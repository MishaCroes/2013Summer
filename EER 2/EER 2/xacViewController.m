//
//  xacViewController.m
//  EER 2
//
//  Created by Xiang 'Anthony' Chen on 6/12/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacViewController.h"

@interface xacViewController ()

@end

@implementation xacViewController

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
    
    _touchPoints = [[NSMutableDictionary alloc] init];
    float oriX = (_mainView.frame.size.height - WATCHWIDTH) * 0.5f;
    float oriY = (_mainView.frame.size.width - WATCHHEIGHT) * 0.5f;
    _watchScreenView = [[UIView alloc] initWithFrame:CGRectMake(
                                                                oriX,
                                                                oriY,
                                                                WATCHWIDTH, WATCHHEIGHT)];
    [_watchScreenView setBackgroundColor:[UIColor colorWithRed:1 green:1 blue:1 alpha:0.5]];
    [_mainView setBackgroundColor:[UIColor colorWithRed:0 green:0 blue:0 alpha:0.5]];
    [_mainView addSubview:_watchScreenView];
    
    _swipe = [[xacSwipe alloc] init];
    _textEntry = [[xacTextEntry alloc] init];
    [_textEntry initVisualView:_watchScreenView];
    [_textEntry initTextView:_watchScreenView];
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (void)touchesBegan:(NSSet *)touches withEvent:(UIEvent *)event {
    if([touches count] > MAXTOUCHPOINTS)
        return;
    
    for(UITouch *touch in [touches allObjects]) {
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        [_swipe addTouchPoint :[touch locationInView:_watchScreenView] :key];
        [_touchPoints setObject:touch forKey:key];
    }
}

- (void)touchesMoved:(NSSet *)touches withEvent:(UIEvent *)event {
    
}

- (void)touchesEnded:(NSSet *)touches withEvent:(UIEvent *)event {
    for(UITouch *touch in [touches allObjects]) {
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        [_swipe endTouchPoint :[touch locationInView:_watchScreenView] :key];
    }
    [_textEntry update:_swipe];
    [_swipe cleanTouchPoint];
    //    NSLog(@"%ld", [self getCurrentTimeInMS]);
}

- (long) getCurrentTimeInMS
{
    NSTimeInterval time = ([[NSDate date] timeIntervalSince1970]);
    long digits = (long)time; // this is the first 10 digits
    int decimalDigits = (int)(fmod(time, 1) * 1000); // this will get the 3 missing digits
    long timeStamp = (digits * 1000) + decimalDigits;
    return timeStamp;
}

@end
