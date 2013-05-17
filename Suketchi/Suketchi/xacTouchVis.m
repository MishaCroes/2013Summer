//
//  xacTouchVis.m
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 5/13/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacTouchVis.h"

@implementation xacTouchVis

NSArray *colors;
NSArray* classNames;

- (id)initWithFrame:(CGRect)frame
{
    self = [super initWithFrame:frame];
    if (self) {
        // Initialization code
        _touchPoints = [[NSMutableArray alloc] init];
        _touchVisuals = [[NSMutableDictionary alloc] init];
        _touchLabels =[[NSMutableDictionary alloc] init];
        
        colors  = [[NSArray alloc] initWithObjects:
                    [UIColor redColor],     [UIColor greenColor],   [UIColor blueColor],    [UIColor purpleColor],
                    [UIColor orangeColor],  [UIColor cyanColor],    [UIColor whiteColor],   [UIColor yellowColor],
                    [UIColor magentaColor], [UIColor brownColor],   [UIColor blackColor],   [UIColor lightGrayColor], nil];
        
        [NSTimer scheduledTimerWithTimeInterval:0.1
                                         target:self
                                       selector:@selector(detectTouch)
                                       userInfo:nil
                                        repeats:YES];
        
        [NSTimer scheduledTimerWithTimeInterval:0.05
                                         target:self
                                       selector:@selector(updateVisual)
                                       userInfo:nil
                                        repeats:YES];
        
        _touchClassifier = [[TouchClassifier alloc] init];
        
        classNames = [[NSArray alloc] initWithObjects:@"Pen", @"Finger", @"Palm", nil];
    }
    return self;
}

/*
// Only override drawRect: if you perform custom drawing.
// An empty implementation adversely affects performance during animation.
- (void)drawRect:(CGRect)rect
{
    // Drawing code
}
*/

- (void) doTouchBegan:(NSSet *)touches withEvent:(UIEvent *)event
{
    [self detectTouch];
    
    for(UITouch *touch in [touches allObjects])
    {
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        if([_touchVisuals objectForKey: key]== nil) {
            [_touchPoints addObject:touch];
            
            xacUIShadow *shadow = [[xacUIShadow alloc] init: self];
            [shadow setColor: [colors objectAtIndex:[_touchPoints indexOfObject:touch]]];
            [_touchVisuals setObject:shadow forKey: key];
            
            xacUIShadow *label = [[xacUIShadow alloc] init:self];
            [label setColor:[UIColor clearColor]];
            xacUIShadow *oldLabel = [_touchLabels objectForKey:key];
            [oldLabel selfDestruct];
            [_touchLabels removeObjectForKey:key];
            [_touchLabels setObject:label forKey:key];
        }
    }
}

- (void) doTouchMoved:(NSSet *)touches withEvent:(UIEvent *)event
{
    for(UITouch *touch in [touches allObjects])
    {
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        CGPoint touchPos = [touch locationInView:self];
        
        xacUIShadow *shadow = [_touchVisuals objectForKey:key];
        float radius = [[touch valueForKey:@"pathMajorRadius"] floatValue];
        [shadow update: touchPos.x * _scaleRatio :touchPos.y * _scaleRatio :radius];
        
    }
}

- (void) doTouchEnded:(NSSet *)touches withEvent:(UIEvent *)event
{
    for(UITouch *touch in [touches allObjects])
    {
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        
        [_touchPoints removeObject:touch];
        xacUIShadow *shadow = [_touchVisuals objectForKey:key];
        [shadow selfDestruct];
        [_touchVisuals removeObjectForKey:[NSString stringWithFormat:@"%d", [touch hash]]];
        
    }
    
}

- (void) detectTouch
{
    NSArray *tmpTouchPoints = [[NSArray alloc] initWithArray:_touchPoints];
    for(UITouch *touch in tmpTouchPoints)
    {
        if([touch phase] == UITouchPhaseEnded || [touch phase] == UITouchPhaseCancelled)
        {
            xacUIShadow *shadow = [_touchVisuals objectForKey:[NSString stringWithFormat:@"%d", [touch hash]]];
            [shadow selfDestruct];
            [_touchVisuals removeObjectForKey:[NSString stringWithFormat:@"%d", [touch hash]]];
            [_touchPoints removeObject:touch];
        }
    }
}

- (void) updateVisual
{
    NSMutableDictionary *tmpTouchLabels = [[NSMutableDictionary alloc] initWithDictionary:_touchLabels copyItems:NO];
    for(id key in tmpTouchLabels) {
        xacUIShadow *label = [_touchLabels objectForKey:key];
        label.shadow.alpha *= 0.9f;
        
        if(label.shadow.alpha < 0.001) {
            [_touchLabels removeObjectForKey:key];
        }
    }
}

- (void) showTouchLabel: (NSMutableArray*)tds {
    for(xacTouchData* td in tds) {
        //        xacTouchData *td = [tdDic objectForKey:key];
        int idxClass = [_touchClassifier classify: [td packageData]];
        
        xacUIShadow *label = [_touchLabels objectForKey:td.key];
        label.shadow.alpha = 1.0f;
        [label update: td.pos.x :td.pos.y :200];
        [label updateText: classNames[idxClass]];
        
    }
}

@end
