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
UITextField *textFieldZoomBoard;

NSMutableArray *charArrayZoomBoard;
int ptrCharZoomBoard = 0;
NSString *cursorZoomBoard;

float heightRatio = 0.40f;
float leftZoomBoard;
float topZoomBoard;

bool isThereNewInputZB = false;
NSString* strInput;
NSString* subStrInput;
int idxSubString;


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
        
        float lefttextFieldZoomBoard = frame.size.width * TEXTFIELDORIX;
        float toptextFieldZoomBoard = frame.size.height * TEXTFIELDORIY;
        
        _testText = [[xacTestText alloc] initWithFrame:CGRectMake(lefttextFieldZoomBoard, toptextFieldZoomBoard/ 5, frame.size.width * TEXTFIELDWIDTHRATIO, frame.size.height * TEXTFIELDHEIGHTRATIO)];
        [self addSubview:_testText];
        [_testText setBackgroundColor:[UIColor whiteColor]];
        [_testText loadWords];
        
        
        textFieldZoomBoard = [[UITextField alloc] initWithFrame:CGRectMake(lefttextFieldZoomBoard, toptextFieldZoomBoard, frame.size.width * TEXTFIELDWIDTHRATIO, frame.size.height * TEXTFIELDHEIGHTRATIO)];
//        [textFieldZoomBoard setFont:[UIFont fontWithName:@"ArialMT" size:150 / TEXTLENGTH]];
        [textFieldZoomBoard setBackgroundColor:[UIColor whiteColor]];
        [textFieldZoomBoard setTextAlignment:NSTextAlignmentLeft];
        [textFieldZoomBoard setUserInteractionEnabled:NO];
        [self addSubview:textFieldZoomBoard];

        swipeView = [[xacDummyLayer alloc] initWithFrame:zoomBoard.frame];
        [swipeView setBackgroundColor:[UIColor colorWithRed:1.0f green:0.0f blue:0.0f alpha:0.5f]];
        swipeView.zoomBoard = zoomBoard;
        [swipeView setTag:1027];
//        [self addSubview:swipeView];
        
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
        
        
        charArrayZoomBoard = [[NSMutableArray alloc] initWithCapacity:TEXTLENGTH];
        
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
        if(ptrCharZoomBoard == 0) {
            [_testText resetTimer];
        }
        [zoomBoard zoomOut:zoomFactor];
        isZoomed = FALSE;
        NSLog(@"%@", zoomBoard.typedChar);
        [self addTypedKey:zoomBoard.typedChar];
        [self updateTextFieldZoomBoard];
    }

}

- (void) addTypedKey :(NSString*) key{
//    NSString *key = [[btn titletextFieldZoomBoard] text];
//    if(ptrCharZoomBoard <= TEXTLENGTH - 1) {
        charArrayZoomBoard[ptrCharZoomBoard++] = key;
//    } else {
//        [charArrayZoomBoard removeObjectAtIndex:0];
//        [charArrayZoomBoard addObject:key];
    
        if(ptrCharZoomBoard >= TEXTLENGTH / 2) {
            idxSubString++;
        }
//    }
    isThereNewInputZB = true;
}

- (void) updatecursorZoomBoard {
    cursorZoomBoard = [cursorZoomBoard isEqualToString:@"_"] ? @" " : @"_";
//    NSLog(@"cursorZoomBoard is: %@", cursorZoomBoard);
    [self updateTextFieldZoomBoard];
}


- (void) startSession {
    [self cleanUp];
    [_testText update:nil :0];
}

- (void) getWord :(int)sign {
    [self cleanUp];
    [_testText loadWord:sign];
}

- (void) cleanUp {
    [charArrayZoomBoard removeAllObjects];
    ptrCharZoomBoard = 0;
    idxSubString = 0;
    subStrInput = @"";
    [textFieldZoomBoard setText:[subStrInput stringByAppendingString:cursorZoomBoard]];
}

- (void) updateTextFieldZoomBoard {
    
//    NSString *sentence = @"";
//    for(NSString *str in charArrayZoomBoard) {
//        sentence = [sentence stringByAppendingString:str];
//    }
//    
//    sentence = [sentence stringByAppendingString:cursorZoomBoard];
////    NSLog(@"%@", sentence);
//    
//    [textFieldZoomBoard setText:sentence];
    
    if(isThereNewInputZB) {
        
        strInput = @"";
        for(NSString *str in charArrayZoomBoard) {
            strInput = [strInput stringByAppendingString:str];
        }
        
        int lenAvailableSubstr = MAX(0, MIN((int)(strInput.length - idxSubString), TEXTLENGTH));
        subStrInput = [strInput substringWithRange:(NSRange){idxSubString, lenAvailableSubstr}];
        
        if([_testText update:strInput :idxSubString]) {
            [self cleanUp];
        }
        isThereNewInputZB = false;
    }
    
    [textFieldZoomBoard setText:[subStrInput stringByAppendingString:cursorZoomBoard]];
}

- (void) doBackSpace {
    NSLog(@"doBackSpace");
    if(charArrayZoomBoard.count > 0) {
        [charArrayZoomBoard removeLastObject];
        if(ptrCharZoomBoard >= TEXTLENGTH / 2) {
            idxSubString--;
        }
        ptrCharZoomBoard--;
    }
    isThereNewInputZB = true;
}

- (void) doSpace {
    NSLog(@"doSpace");
    [self addTypedKey:@" "];
    [self updateTextFieldZoomBoard];
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
