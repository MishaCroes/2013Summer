//
//  xacCanvas.m
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 4/8/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacCanvas.h"
#define MAXTOUCHPOINTS 10

@implementation xacCanvas

UIColor *brushColor;
BOOL isTouchDown;

- (id)initWithFrame:(CGRect)frame
{
    self = [super initWithFrame:frame];
    if (self) {
        // Initialization code
        
        // single-stroke
//        _path = [[UIBezierPath alloc] init];
//        _path.lineWidth = 5;
//        _path.miterLimit = -10;
//        _path.lineCapStyle = kCGLineJoinMiter;
        //
        
        // multi-stroke
        _touchPoints = [[NSMutableArray alloc] init];
        _paths = [[NSMutableArray alloc] init];
        _drawnPaths = [[NSMutableArray alloc] init];
        _pathMap = [[NSMutableDictionary alloc] init];
        
        for (int i = 0; i < MAXTOUCHPOINTS; i++) {
            UIBezierPath *tmpPath = [[UIBezierPath alloc] init];
            tmpPath.lineWidth = 5;
            tmpPath.miterLimit = -10;
            tmpPath.lineCapStyle = kCGLineJoinMiter;
            [_paths addObject:tmpPath];
            [_drawnPaths addObject:tmpPath];
        }
        //

        brushColor = [UIColor colorWithRed:0 green:0 blue:0 alpha:0.85];
        
        _isTemp = FALSE;
        isTouchDown = FALSE;
        
        [NSTimer scheduledTimerWithTimeInterval:0.1
                                         target:self
                                       selector:@selector(detectTouch)
                                       userInfo:nil
                                        repeats:YES];
        
        _touchClassifier = [[TouchClassifier alloc] init];
    }
    return self;
}


// Only override drawRect: if you perform custom drawing.
// An empty implementation adversely affects performance during animation.
- (void)drawRect:(CGRect)rect
{
    [brushColor setStroke];

    // single-touch
//    [_path strokeWithBlendMode:kCGBlendModeNormal alpha:0.75];
    //
    
    // multi-stroke
    for(UIBezierPath *tmpPath in _drawnPaths) {
        [tmpPath strokeWithBlendMode:kCGBlendModeNormal alpha:0.75];
    }
    //

}


- (void) doTouchBegan:(NSSet *)touches withEvent:(UIEvent *)event
{
    // single-stroke
//    isTouchDown = TRUE;
//    UITouch *touch = [[touches allObjects] objectAtIndex:0];
//    [_path moveToPoint:[touch locationInView:self]];
    //
    
    // multi-stroke
    isTouchDown = TRUE;
    for(UITouch *touch in [touches allObjects])
    {
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        if([_pathMap objectForKey: key]== nil) {
            
            [_touchPoints addObject:touch];
            UIBezierPath *tmpPath = [_paths lastObject];
            
            if(tmpPath != nil) {
                [tmpPath moveToPoint:[touch locationInView:self]];
                [_pathMap setObject:tmpPath forKey: key];
                [_paths removeLastObject];
            }
        }
    }
    //
}

- (void) doTouchMoved:(NSSet *)touches withEvent:(UIEvent *)event
{
    // single-stroke
//    UITouch *touch=[[touches allObjects] objectAtIndex:0];
//    [_path addLineToPoint:[touch locationInView:self]];
//    if(_isTemp) [self setNeedsDisplay];
    //
    
    // multi-stroke
    for(UITouch *touch in [touches allObjects]) {
        UIBezierPath *tmpPath = [_pathMap objectForKey:[NSString stringWithFormat:@"%d", [touch hash]]];
        [tmpPath addLineToPoint: [touch locationInView:self]];
    }
    //
    
    if(_isTemp) [self setNeedsDisplay];
}

- (void) doTouchEnded:(NSSet *)touches withEvent:(UIEvent *)event
{
    // single-stroke
//    isTouchDown = FALSE;
//    if(_isTemp) [_path removeAllPoints];
//    [self setNeedsDisplay];
    //
    
    // multi-stroke
    isTouchDown = FALSE;
    for(UITouch *touch in [touches allObjects])
    {
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
//        int idx = [[_pathMap objectForKey:key] intValue];
        UIBezierPath *tmpPath = [_pathMap objectForKey:key];
        
        if(tmpPath != nil) {
            if(_isTemp) [tmpPath removeAllPoints];
            [_paths addObject:tmpPath];
        }
        
        [_pathMap removeObjectForKey:key];
        [_touchPoints removeObject:touch];
        
    }
    //
    
    [self setNeedsDisplay];
}

- (void) mediateTouch: (NSArray*)tds {
    for(xacTouchData* td in tds) {
        int idxClass = [_touchClassifier classify: [td packageData]];
        [self printClassResult:idxClass];
    }
}

- (void) clearCanvas
{
    for(UIBezierPath *tmpPath in _drawnPaths) {
        [tmpPath removeAllPoints];
    }
    [self setNeedsDisplay];
}

- (void) detectTouch
{
    NSArray *tmpTouchPoints = [[NSArray alloc] initWithArray:_touchPoints];
    for(UITouch *touch in tmpTouchPoints)
    {
        if([touch phase] == UITouchPhaseEnded || [touch phase] == UITouchPhaseCancelled)
        {
            NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
            UIBezierPath *tmpPath = [_pathMap objectForKey:key];
            
            if(tmpPath != nil) {
                if(_isTemp) [tmpPath removeAllPoints];
                [_paths addObject:tmpPath];
            }
            
            [_pathMap removeObjectForKey:key];
            [_touchPoints removeObject:touch];
        }
    }
}

- (void) printClassResult: (int)idx {
    switch (idx) {
        case PEN:
            NSLog(@"Pen");
            break;
        case FINGER:
            NSLog(@"Finger");
            break;
        case PALM:
            NSLog(@"Palm");
            break;
        default:
            break;
    }
}

@end
