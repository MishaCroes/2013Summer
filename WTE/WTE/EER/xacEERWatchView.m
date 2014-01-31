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
        
        _touchPoints = [[NSMutableDictionary alloc] init];        
        _swipe = [[xacSwipe alloc] init];
        _textEntry = [[xacTextEntry alloc] init];
        [_textEntry initVisualView:self];
//        [_textEntry initTextField:self];
//        [self setBackgroundColor:[UIColor redColor]];

        
        if(CONDITION == SWIPEBOARD){
            _strTechnique = @"Swipeboard";
            _strParticipant = [NSString stringWithFormat:@"%d", PARTICIPANT];
            _timeStarted = [self getCurrentTimeInMS];

            
            [NSTimer scheduledTimerWithTimeInterval:1.0f
                                             target:self
                                           selector:@selector(updateInfoView)
                                           userInfo:nil
                                            repeats:YES];
        }
        
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
    
//    [_textEntry checkTimer];
    
    _textEntry.touchDownTime = [self getCurrentTimeInMS];
    
    for(UITouch *touch in [touches allObjects]) {
        
        CGPoint tchPnt = [touch locationInView:self];
        
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        [_swipe addTouchPoint :tchPnt :key];
        [_touchPoints setObject:touch forKey:key];
    }
    
//    if(_textEntry.testText.block >= 1) {
//        [self updateInfoView];
//    }
}

- (void)touchesMoved:(NSSet *)touches withEvent:(UIEvent *)event {
    
}

- (void)touchesEnded:(NSSet *)touches withEvent:(UIEvent *)event {
    if(![_textEntry isKeyboardReady]) {
        return;
    }
    
    [_textEntry.testText reportKLM];
    for(UITouch *touch in [touches allObjects]) {
        
        CGPoint tchPnt = [touch locationInView:self];
        
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        [_swipe endTouchPoint :tchPnt :key];
    }
    [_textEntry update:_swipe];
    if(_textEntry.isTrialEnded) {
        [_textEntry hideVisual:true];
    }
    [_swipe cleanTouchPoint];
    
    
}

- (BOOL) getWord :(int)sign {
    return [_textEntry getWord:sign];
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

// #2014Spring
- (void) updateInfoView {
//    if(_textEntry.testText.block >= 1) {
        if(_infoView != NULL) {
            int section = _textEntry.testText.section;
            int block = _textEntry.testText.block + 1;
            int trial = _textEntry.testText.trial + 1;
            
            int timeElapsed = ([self getCurrentTimeInMS] - _timeStarted) / 1000;
            NSString *strMin = [NSString stringWithFormat:@"%d", timeElapsed/60];
            if(strMin.length < 2) {
                strMin = [NSString stringWithFormat:@"0%@", strMin];
            }
            NSString *strSec =[NSString stringWithFormat:@"%d", timeElapsed%60];
            if(strSec.length < 2) {
                strSec = [NSString stringWithFormat:@"0%@", strSec];
            }
            
            if(_textEntry.testText.block >= 1) {
                [_infoView setText:[NSString stringWithFormat:@"%@: Participant #%@\nSection %d Block %d/%d Trial %d/%d\nTime elapsed: %@:%@"
                                , _strTechnique, _strParticipant, section, block-1, NUMBLOCKS-1, trial, NUMTRIALS, strMin, strSec]];
            } else {
                [_infoView setText:[NSString stringWithFormat:@"%@: Participant #%@\nSection %d Practice block\nTime elapsed: %@:%@"
                                    , _strTechnique, _strParticipant, section, strMin, strSec]];
            }
        }
//    }
}

@end
