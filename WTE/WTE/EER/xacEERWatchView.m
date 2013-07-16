//
//  xacWatchView.m
//  EER 2
//
//  Created by Xiang 'Anthony' Chen on 6/13/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacEERWatchView.h"

@implementation xacEERWatchView

- (id)initWithFrame:(CGRect)frame
{
    self = [super initWithFrame:frame];
    if (self) {
        // Initialization code
        _touchPoints = [[NSMutableDictionary alloc] init];        
        _swipe = [[xacSwipe alloc] init];
        _textEntry = [[xacTextEntry alloc] init];
        [_textEntry initVisualView:self];
//        [_textEntry initTextField:self];
        
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

- (void)touchesBegan:(NSSet *)touches withEvent:(UIEvent *)event {
    if([touches count] > MAXTOUCHPOINTS)
        return;
    
    [_textEntry checkTimer];
    
    for(UITouch *touch in [touches allObjects]) {
        
        CGPoint tchPnt = [touch locationInView:self];
        
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        [_swipe addTouchPoint :tchPnt :key];
        [_touchPoints setObject:touch forKey:key];
    }
}

- (void)touchesMoved:(NSSet *)touches withEvent:(UIEvent *)event {
    
}

- (void)touchesEnded:(NSSet *)touches withEvent:(UIEvent *)event {
    for(UITouch *touch in [touches allObjects]) {
        
        CGPoint tchPnt = [touch locationInView:self];
        
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        [_swipe endTouchPoint :tchPnt :key];
    }
    [_textEntry update:_swipe];
    [_swipe cleanTouchPoint];
}

- (void) getWord :(int)sign {
    [_textEntry getWord:sign];
}

- (long) getCurrentTimeInMS
{
    NSTimeInterval time = ([[NSDate date] timeIntervalSince1970]);
    long digits = (long)time; // this is the first 10 digits
    int decimalDigits = (int)(fmod(time, 1) * 1000); // this will get the 3 missing digits
    long timeStamp = (digits * 1000) + decimalDigits;
    return timeStamp;
}

//- (void) startSession {
//    [_textEntry startSession];
//}

- (void) loadSharedString {
//    [_textEntry loadSharedString];
}

@end
