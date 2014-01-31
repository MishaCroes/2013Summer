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

NSMutableArray *charArrayZoomBoard;
int ptrCharZoomBoard = 0;
NSString *cursorZoomBoard;

float heightRatio = 0.40f;
float leftZoomBoard;
float topZoomBoard;

bool isThereNewInputZB = false;

NSString* sub_strInput;
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
        
//        float left_textField = frame.size.width * TEXTFIELDORIX;
//        float top_textField = frame.size.height * TEXTFIELDORIY;
        
//        _testText = [[xacTestText alloc] initWithFrame:CGRectMake(left_textField, top_textField/ 5, frame.size.width * TEXTFIELDWIDTHRATIO, frame.size.height * TEXTFIELDHEIGHTRATIO)];
//        [self addSubview:_testText];
//        [_testText setBackgroundColor:[UIColor whiteColor]];
//        [_testText loadWords];
        
        
//        _textField = [[UITextField alloc] initWithFrame:CGRectMake(left_textField, top_textField, frame.size.width * TEXTFIELDWIDTHRATIO, frame.size.height * TEXTFIELDHEIGHTRATIO)];
////        [_textField setFont:[UIFont fontWithName:@"ArialMT" size:150 / TEXTLENGTH]];
//        [_textField setBackgroundColor:[UIColor whiteColor]];
//        [_textField setTextAlignment:NSTextAlignmentLeft];
//        [_textField setUserInteractionEnabled:NO];
//        [self addSubview:_textField];

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
        
        if(CONDITION == ZOOMBOARD) {
            _strTechnique =  @"Zoomboard";
            _strParticipant = [NSString stringWithFormat:@"%d", PARTICIPANT];
            _timeStarted = [self getCurrentTimeInMS];

            [NSTimer scheduledTimerWithTimeInterval:1.0f
                                             target:self
                                           selector:@selector(updateInfoView)
                                           userInfo:nil
                                            repeats:YES];
        } else {
            
        }
        
        _trialFinished = true;

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


int zoomLevel = 0;

- (void)touchesBegan:(NSSet *)touches withEvent:(UIEvent *)event {
    _timeTouchDown = [self getCurrentTimeInMS];
}

- (void)touchesMoved:(NSSet *)touches withEvent:(UIEvent *)event {
    
}

- (void)touchesEnded:(NSSet *)touches withEvent:(UIEvent *)event {
    if([touches count] > MAXTOUCHPOINTS)
        return;
    [_testText reportKLM];
    if(zoomLevel < MAXZOOMLEVEL) {
        
        _testText.actionStarted1 = _timeTouchDown;
        _testText.actionEnded1 = [self getCurrentTimeInMS];
        _testText.visualSearchStarted2 = [self getCurrentTimeInMS] + ANIMATIONDURATION * 1000;
        
        for(UITouch *touch in [touches allObjects]) {
            
            CGPoint tchPnt = [touch locationInView:self];
            float x1 = ZOOMFACTOR * (zoomBoard.center.x - tchPnt.x) + tchPnt.x;
            float y1 = ZOOMFACTOR * (zoomBoard.center.y - tchPnt.y) + tchPnt.y;
            [zoomBoard zoomIn:x1 :y1: ZOOMFACTOR];
            zoomLevel++;
        }
        zoomBoard.typedChar = @"";
    } else {
        
        _testText.actionStarted2 = _timeTouchDown;
        _testText.actionEnded2 = [self getCurrentTimeInMS];
//        _testText.visualSearchStarted1 = [self getCurrentTimeInMS] + ANIMATIONDURATION * 1000;
        
//        if(ptrCharZoomBoard == 0) {
//            [_testText resetTimer];
//        }
        
        [zoomBoard zoomOut:pow(ZOOMFACTOR, zoomLevel)];
        zoomLevel = 0;
        NSLog(@"%@", zoomBoard.typedChar);
        [self addTypedKey:zoomBoard.typedChar];
        [self updateTextField];
    }

}

- (void) addTypedKey :(NSString*) key{
    charArrayZoomBoard[ptrCharZoomBoard++] = key;
    if(ptrCharZoomBoard >= TEXTLENGTH / 2) {
        idxSubString++;
    }
    isThereNewInputZB = true;
}

- (void) updatecursorZoomBoard {
    cursorZoomBoard = [cursorZoomBoard isEqualToString:@"_"] ? @" " : @"_";
    [_textField setText:[_strInput stringByAppendingString:cursorZoomBoard]];
    [self updateTextField];
}


- (void) startSession {
    [self cleanUp];
    [_testText update:nil :0];
}

- (BOOL) getWord :(int)sign {
    if(_trialFinished) {
        [self cleanUp];
//        if([_testText loadWord:sign]) {
        if(_testText.isWordLoaded) {
            _trialFinished = false;
            [zoomBoard hideKeyboard:false];
            _testText.visualSearchStarted1 = [self getCurrentTimeInMS];
            [_testText resetTimer];
            return true;
        }
    }
    return false;
}

- (long) getCurrentTimeInMS
{
    NSTimeInterval time = ([[NSDate date] timeIntervalSince1970]);
    long digits = (long)time; // this is the first 10 digits
    int decimalDigits = (int)(fmod(time, 1) * 1000); // this will get the 3 missing digits
    long timeStamp = (digits * 1000) + decimalDigits;
    return timeStamp;
}


- (void) cleanUp {
    [charArrayZoomBoard removeAllObjects];
    ptrCharZoomBoard = 0;
    idxSubString = 0;
    _strInput = @"";
    [_textField setText:[_strInput stringByAppendingString:cursorZoomBoard]];
}

- (void) updateTextField {
    if(isThereNewInputZB) {
        
        _strInput = @"";
        for(NSString *str in charArrayZoomBoard) {
            _strInput = [_strInput stringByAppendingString:str];
        }
        
//        int lenAvailableSubstr = MAX(0, MIN((int)(_strInput.length - idxSubString), TEXTLENGTH));
//        sub_strInput = [_strInput substringWithRange:(NSRange){idxSubString, lenAvailableSubstr}];
        
        if([_testText update:_strInput :idxSubString]) {
            _trialFinished = true;
            [zoomBoard hideKeyboard:true];
            [self cleanUp];
        }
        isThereNewInputZB = false;
    }
    
    [_textField setText:[_strInput stringByAppendingString:cursorZoomBoard]];
}

- (void) doBackSpace {
    NSLog(@"doBackSpace");
    [_testText reportKLM];
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
    [_testText reportKLM];
    [self addTypedKey:@"_"];
    [self updateTextField];
}

- (void) doZoomOut {
    [_testText reportKLM];
    NSLog(@"zoomlevel: %d", zoomLevel);
    if(zoomLevel > 0) {
        [zoomBoard zoomOut:pow(ZOOMFACTOR, zoomLevel)];
        zoomLevel = 0;
        [_testText reportSoftError];
    }
}

- (void) doKeyboardSwitch {
    [_testText reportKLM];
    NSLog(@"doKeyboardSwitch");
}

// #2014Spring
- (void) updateInfoView {
    //    if(_testText.block >= 1) {
    if(_infoView != NULL) {
        int section = _testText.section;
        int block = _testText.block + 1;
        int trial = _testText.trial + 1;
        
        int timeElapsed = ([self getCurrentTimeInMS] - _timeStarted) / 1000;
        NSString *strMin = [NSString stringWithFormat:@"%d", timeElapsed/60];
        if(strMin.length < 2) {
            strMin = [NSString stringWithFormat:@"0%@", strMin];
        }
        NSString *strSec =[NSString stringWithFormat:@"%d", timeElapsed%60];
        if(strSec.length < 2) {
            strSec = [NSString stringWithFormat:@"0%@", strSec];
        }
        
        if(_testText.block >= 1) {
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
