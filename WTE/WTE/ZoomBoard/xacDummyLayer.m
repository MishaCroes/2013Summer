//
//  xacDummyLayer.m
//  ZoomBoard
//
//  Created by Xiang 'Anthony' Chen on 6/20/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacDummyLayer.h"

@implementation xacDummyLayer

- (id)initWithFrame:(CGRect)frame
{
    self = [super initWithFrame:frame];
    if (self) {
        // Initialization code
//        UISwipeGestureRecognizer *SwipeRecognizer = [[UISwipeGestureRecognizer alloc] initWithTarget:self action:@selector(didSwipe)];
//        [SwipeRecognizer setDirection:(UISwipeGestureRecognizerDirectionUp | UISwipeGestureRecognizerDirectionDown)];
////        UISwipeGestureRecognizerDirectionLeft | UISwipeGestureRecognizerDirectionRight)];
//        [self addGestureRecognizer:SwipeRecognizer];
        
        // swipe left to backspace
        UISwipeGestureRecognizer *leftSwipeRecognizer = [[UISwipeGestureRecognizer alloc] initWithTarget:self action:@selector(doBackSpace)];
        [leftSwipeRecognizer setDirection:(UISwipeGestureRecognizerDirectionLeft)];
        [self addGestureRecognizer:leftSwipeRecognizer];
        
        // swipe right to spave
        UISwipeGestureRecognizer *rightSwipeRecognizer = [[UISwipeGestureRecognizer alloc] initWithTarget:self action:@selector(doSpace)];
        [rightSwipeRecognizer setDirection:(UISwipeGestureRecognizerDirectionRight)];
        [self addGestureRecognizer:rightSwipeRecognizer];
        
        // swipe down to zoom out
        UISwipeGestureRecognizer *downSwipeRecognizer = [[UISwipeGestureRecognizer alloc] initWithTarget:self action:@selector(doZoomOut)];
        [downSwipeRecognizer setDirection:(UISwipeGestureRecognizerDirectionDown)];
        [self addGestureRecognizer:downSwipeRecognizer];
        
        // swipe up to switch keyboard
        UISwipeGestureRecognizer *upSwipeRecognizer = [[UISwipeGestureRecognizer alloc] initWithTarget:self action:@selector(doKeyboardSwitch)];
        [upSwipeRecognizer setDirection:(UISwipeGestureRecognizerDirectionUp)];
        [self addGestureRecognizer:upSwipeRecognizer];

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
UIView *parent;


- (void) doBackSpace {
    NSLog(@"doBackSpace");
}

- (void) doSpace {
    NSLog(@"doSpace");
}

- (void) doZoomOut {
    NSLog(@"doZoomOut");
}

- (void) doKeyboardSwitch {
    NSLog(@"doKeyboardSwitch");
}


@end
