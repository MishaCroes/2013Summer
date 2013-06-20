//
//  xacWatchView.m
//  ZoomBoard
//
//  Created by Xiang 'Anthony' Chen on 6/19/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacWatchView.h"
#import "xacZoomBoard.h"
#define MAXTOUCHPOINTS 1

@implementation xacWatchView

xacZoomBoard *zoomBoard;
xacDummyLayer *swipeView;
UILabel *label;

NSMutableArray *charArray;
int ptrChar = 0;
NSString *cursor;

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
        
        float leftTextView = 0;
        float topTextView = 0;
        label = [[UILabel alloc] initWithFrame:CGRectMake(leftTextView, topTextView, frame.size.width, frame.size.height * (1 - heightRatio * 1.2f))];
        [label setBackgroundColor:[UIColor whiteColor]];
        [label setTextAlignment:NSTextAlignmentLeft];
        
        
        [label setUserInteractionEnabled:NO];
        
//        UISwipeGestureRecognizer *swipeUpRecognizer = [[UISwipeGestureRecognizer alloc] initWithTarget:self action:@selector(didSwipe)];
//        [swipeUpRecognizer setDirection:(UISwipeGestureRecognizerDirectionUp | UISwipeGestureRecognizerDirectionDown | UISwipeGestureRecognizerDirectionLeft | UISwipeGestureRecognizerDirectionRight)];
//        [self addGestureRecognizer:swipeUpRecognizer];

        swipeView = [[xacDummyLayer alloc] initWithFrame:zoomBoard.frame];
        [swipeView setBackgroundColor:[UIColor colorWithRed:1.0f green:0.0f blue:0.0f alpha:0.5f]];
        swipeView.zoomBoard = zoomBoard;
        [swipeView setTag:1027];
//        [self addSubview:swipeView];
        
        zoomBoard.label = label;
        [self addSubview:label];
        
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
        
        
        charArray = [[NSMutableArray alloc] initWithCapacity:TEXTLINELENGTH];
        
        // routine to update the visual of the cursor
        [NSTimer scheduledTimerWithTimeInterval:1.0f / CURSORREFRESHRATE
                                         target:self
                                       selector:@selector(updateCursor)
                                       userInfo:nil
                                        repeats:YES];

    }
    return self;
}

-(void)didSwipe{
    //    if (recognizer.direction == UISwipeGestureRecognizerDirectionRight) {
    //        NSLog(@"get gesture right");
    //    }
    //    if (recognizer.direction == UISwipeGestureRecognizerDirectionLeft) {
    //        NSLog(@"get gesture Left");
    //    }
    NSLog(@"good");
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
//    [self addSubview:zoomBoard];
//    [self addSubview:swipeView];
    
    if([touches count] > MAXTOUCHPOINTS)
        return;
    if(!isZoomed) {
        for(UITouch *touch in [touches allObjects]) {
            
            CGPoint tchPnt = [touch locationInView:self];
            float x1 = zoomFactor * (zoomBoard.center.x - tchPnt.x) + tchPnt.x;
            float y1 = zoomFactor * (zoomBoard.center.y - tchPnt.y) + tchPnt.y;
            [zoomBoard zoomIn:x1 :y1: zoomFactor];
        }
        
        //    [zoomBoard setUserInteractionEnabled:YES];
        
        isZoomed = TRUE;
        zoomBoard.typedChar = @"";
//        zoomBoard.readyToType = true;
    } else {
        [zoomBoard zoomOut:zoomFactor];
        isZoomed = FALSE;
        NSLog(@"%@", zoomBoard.typedChar);
        [self addTypedKey:zoomBoard.typedChar];
        [self updateTextView];
        //        [zoomBoard setUserInteractionEnabled:NO];
    }

}

- (void) addTypedKey :(NSString*) key{
//    NSString *key = [[btn titleLabel] text];
    if(ptrChar <= TEXTLINELENGTH - 1) {
        charArray[ptrChar++] = key;
    } else {
        [charArray removeObjectAtIndex:0];
        [charArray addObject:key];
    }
}

- (void) updateCursor {
    cursor = [cursor isEqualToString:@"_"] ? @" " : @"_";
    [self updateTextView];
}

- (void) updateTextView {
    
    
    
    
//    [self updateTextView];
    
    NSString *sentence = @"";
    for(NSString *str in charArray) {
        sentence = [sentence stringByAppendingString:str];
    }
    
    sentence = [sentence stringByAppendingString:cursor];
    
    [label setText:sentence];
}

- (void) doBackSpace {
    NSLog(@"doBackSpace");
    if(charArray.count > 0) {
        [charArray removeLastObject];
        ptrChar--;
    }

}

- (void) doSpace {
    NSLog(@"doSpace");
    [self addTypedKey:@" "];
    [self updateTextView];
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
