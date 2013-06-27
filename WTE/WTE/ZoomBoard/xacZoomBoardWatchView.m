//
//  xacWatchView.m
//  ZoomBoard
//
//  Created by Xiang 'Anthony' Chen on 6/19/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacZoomBoardWatchView.h"
#import "xacZoomBoard.h"
#define MAXTOUCHPOINTS 1

@implementation xacZoomBoardWatchView

xacZoomBoard *zoomBoard;
xacDummyLayer *swipeView;
UITextView *textViewZoomBoard;

NSMutableArray *charArrayZoomBoard;
int ptrCharZoomBoard = 0;
NSString *cursorZoomBoard;

float heightRatio = 0.40f;
float leftZoomBoard;
float topZoomBoard;

//bool isZoomed = false;

- (id)initWithFrame:(CGRect)frame
{
    self = [super initWithFrame:frame];
    if (self) {
        // Initialization code

        leftZoomBoard = 0;
        topZoomBoard = frame.size.height * (1 - heightRatio);
        zoomBoard = [[xacZoomBoard alloc] initWithFrame:CGRectMake(leftZoomBoard, topZoomBoard, frame.size.width, frame.size.height * heightRatio)];
        [zoomBoard setUserInteractionEnabled:NO];
        
        [self addSubview:zoomBoard];
        
        float lefttextViewZoomBoard = frame.size.width * TEXTVIEWORIX;
        float toptextViewZoomBoard = frame.size.height * TEXTVIEWORIY;
        textViewZoomBoard = [[UITextView alloc] initWithFrame:CGRectMake(lefttextViewZoomBoard, toptextViewZoomBoard, frame.size.width * TEXTVIEWWIDTHRATIO, frame.size.height * TEXTVIEWHEIGHTRATIO)];
        [textViewZoomBoard setFont:[UIFont fontWithName:@"ArialMT" size:150 / TEXTLINELENGTH]];
        [textViewZoomBoard setBackgroundColor:[UIColor whiteColor]];
        [textViewZoomBoard setTextAlignment:NSTextAlignmentLeft];
        [textViewZoomBoard setUserInteractionEnabled:NO];

        swipeView = [[xacDummyLayer alloc] initWithFrame:zoomBoard.frame];
        [swipeView setBackgroundColor:[UIColor colorWithRed:1.0f green:0.0f blue:0.0f alpha:0.5f]];
        swipeView.zoomBoard = zoomBoard;
        [swipeView setTag:1027];
//        [self addSubview:swipeView];
        
        [self addSubview:textViewZoomBoard];
        
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
        
        
        charArrayZoomBoard = [[NSMutableArray alloc] initWithCapacity:TEXTLINELENGTH];
        
        // routine to update the visual of the cursorZoomBoard
        [NSTimer scheduledTimerWithTimeInterval:1.0f / CURSORREFRESHRATE
                                         target:self
                                       selector:@selector(updatecursorZoomBoard)
                                       userInfo:nil
                                        repeats:YES];

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

float zoomFactor = 3.0f;
bool isZoomed = false;

- (void)touchesBegan:(NSSet *)touches withEvent:(UIEvent *)event {

}

- (void)touchesMoved:(NSSet *)touches withEvent:(UIEvent *)event {
    
}

- (void)touchesEnded:(NSSet *)touches withEvent:(UIEvent *)event {    
    if([touches count] > MAXTOUCHPOINTS)
        return;
    if(!isZoomed) {
        for(UITouch *touch in [touches allObjects]) {
            
            CGPoint tchPnt = [touch locationInView:self];
            float x1 = zoomFactor * (zoomBoard.center.x - tchPnt.x) + tchPnt.x;
            float y1 = zoomFactor * (zoomBoard.center.y - tchPnt.y) + tchPnt.y;
            [zoomBoard zoomIn:x1 :y1: zoomFactor];
        }
        
        isZoomed = TRUE;
        zoomBoard.typedChar = @"";
    } else {
        [zoomBoard zoomOut:zoomFactor];
        isZoomed = FALSE;
        NSLog(@"%@", zoomBoard.typedChar);
        [self addTypedKey:zoomBoard.typedChar];
        [self updatetextViewZoomBoard];
    }

}

- (void) addTypedKey :(NSString*) key{
//    NSString *key = [[btn titletextViewZoomBoard] text];
    if(ptrCharZoomBoard <= TEXTLINELENGTH - 1) {
        charArrayZoomBoard[ptrCharZoomBoard++] = key;
    } else {
        [charArrayZoomBoard removeObjectAtIndex:0];
        [charArrayZoomBoard addObject:key];
    }
}

- (void) updatecursorZoomBoard {
    cursorZoomBoard = [cursorZoomBoard isEqualToString:@"_"] ? @" " : @"_";
//    NSLog(@"cursorZoomBoard is: %@", cursorZoomBoard);
    [self updatetextViewZoomBoard];
}

- (void) updatetextViewZoomBoard {
    
    NSString *sentence = @"";
    for(NSString *str in charArrayZoomBoard) {
        sentence = [sentence stringByAppendingString:str];
    }
    
    sentence = [sentence stringByAppendingString:cursorZoomBoard];
//    NSLog(@"%@", sentence);
    
    [textViewZoomBoard setText:sentence];
}

- (void) doBackSpace {
    NSLog(@"doBackSpace");
    if(charArrayZoomBoard.count > 0) {
        [charArrayZoomBoard removeLastObject];
        ptrCharZoomBoard--;
    }

}

- (void) doSpace {
    NSLog(@"doSpace");
    [self addTypedKey:@" "];
    [self updatetextViewZoomBoard];
}

- (void) doZoomOut {
    NSLog(@"doZoomOut");
    [zoomBoard zoomOut:zoomFactor];
    isZoomed = FALSE;
}

- (void) doKeyboardSwitch {
    NSLog(@"doKeyboardSwitch");
}


@end
