//
//  xacTextEntry.m
//  EER 2
//
//  Created by Xiang 'Anthony' Chen on 6/12/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacTextEntry.h"

@implementation xacTextEntry

UIImageView *imgView;
NSMutableArray *charArray;
int ptrCharEER = 0;
NSString* cursorEER = @"";
int idxSubString;
bool isThereNewInput = false;

- (id) init {
    self = [super init];
    if(self) {
        
        // routine to monitor time out of two-stroke input
        [NSTimer scheduledTimerWithTimeInterval:1.0f / TIMEOUTUPDATERATE
                                         target:self
                                       selector:@selector(updateTimeOut)
                                       userInfo:nil
                                        repeats:YES];
        // routine to update the visual of the cursorEER
        [NSTimer scheduledTimerWithTimeInterval:1.0f / CURSORREFRESHRATE
                                         target:self
                                       selector:@selector(updatecursorEER)
                                       userInfo:nil
                                        repeats:YES];
        
        _keyMap = [[NSMutableDictionary alloc] init];
        [self readKeyMap];
        _gestureMap = [[NSMutableDictionary alloc] init];
        [self initGestureMap];
        
        _textField = nil;
        charArray = [[NSMutableArray alloc] initWithCapacity:TEXTLENGTH];
        imgView = nil;
        
        _isTrialEnded = true;
        
        _keyboardType = ALPHABET;
        
    }
    return self;
}

- (void) checkTimer {
    if(ptrCharEER == 0) {
        [_testText resetTimer];
    }
}

- (void) update :(xacSwipe*) swipe {
    switch (_state) {
        case NONE:
            _numTouch = swipe.touchPoints.count;
            
            /////////////////////////////////////////////////////////////////
            _firstSwipe = [self getCopyOf:swipe];
            _testText.actionStarted1 = _touchDownTime;
            _testText.actionEnded1 = [self getTime];
            /////////////////////////////////////////////////////////////////
            
            /////////////////////////////////////////////////////////////////
            [self updateVisual:_firstSwipe.gesture];
            _testText.visualSearchStarted2 = [self getTime];
            /////////////////////////////////////////////////////////////////
            
            NSLog(@"%ld, %ld", _testText.actionEnded1, _testText.visualSearchStarted2);
            
            _state = INPROGRESS;
            break;
        case INPROGRESS:
            _secondSwipe = [self getCopyOf:swipe];
            [self doTextEntry];
            
            /////////////////////////////////////////////////////////////////
            _secondSwipe = _firstSwipe = nil;
            _testText.actionStarted2 = _touchDownTime;
            _testText.actionEnded2 = [self getTime];
            /////////////////////////////////////////////////////////////////
            
            _state = DONE;
            
            /////////////////////////////////////////////////////////////////
            [self updateVisual:UNKNOWN];
//            _testText.visualSearchStarted1 = [self getCurrentTimeInMS];
            /////////////////////////////////////////////////////////////////
            
            break;
        case DONE:
            _state = NONE;
            break;
        default:
            break;
    }
    
//    [self printState];
    [self updateTextField];
}

- (xacSwipe*) getCopyOf :(xacSwipe*)theSwipe {
    xacSwipe *tmpSwipe = [[xacSwipe alloc] init];
    tmpSwipe.gesture = theSwipe.gesture;
    tmpSwipe.touchPoints = theSwipe.touchPoints;
    tmpSwipe.timeStamp = theSwipe.timeStamp;
    return tmpSwipe;
}

- (void) doTextEntry {
    
    isThereNewInput = true;
    
    // back to keyboard
    if(_secondSwipe.gesture == SOUTH) {
        if(imgView != nil) {
            [self updateVisual:UNKNOWN];
        }
        _state = NONE;
        _firstSwipe = nil;
        [_testText reportSoftError];
    }
    // ,
    else if(_firstSwipe.gesture == SOUTHEAST && _secondSwipe.gesture == CENTER) {
        NSString *key = @",";

        charArray[ptrCharEER++] = key;

        if(ptrCharEER >= TEXTLENGTH / 2) {
            idxSubString++;
        }
    }
    // back space
    else if(_firstSwipe.gesture == SOUTHWEST && _secondSwipe.gesture == SOUTHWEST) {
        if(charArray.count > 0) {
            [charArray removeLastObject];
            
            if(ptrCharEER >= TEXTLENGTH / 2) {
                idxSubString--;
            }
            ptrCharEER--;
        }
    }
    // switch keyboard
//    else if(_firstSwipe.gesture == NORTH && _secondSwipe.gesture == NORTH) {
//        if(imgView != nil) {
//            [self updateVisual:SWITCHBOARD];
//        }
//        _state = NONE;
//        _firstSwipe = nil;
//
//    }
    // the others
    else {
        NSString *strFirstSwipe = [_gestureMap objectForKey:[NSNumber numberWithInt:_firstSwipe.gesture]];
        NSString *strSecondSwipe = [_gestureMap objectForKey:[NSNumber numberWithInt:_secondSwipe.gesture]];
        NSString *strID = [NSString stringWithFormat:@"_%d_%@_%@", _numTouch, strFirstSwipe, strSecondSwipe];
        
        NSString *key = [_keyMap objectForKey: strID];
        if(key) {

                charArray[ptrCharEER++] = key;

            if(ptrCharEER >= TEXTLENGTH / 2) {
                idxSubString++;
            }
            
        }
        NSLog(@"%@: %@", strID, key);
        
    }
    
}

- (void) updateTextField {
    if(isThereNewInput) {
        
        _strInput = @"";
        for(NSString *str in charArray) {
            _strInput = [_strInput stringByAppendingString:str];
        }
        
        int lenAvailableSubstr = MAX(0, MIN((int)(_strInput.length - idxSubString), TEXTLENGTH));
        _subStrInput = [_strInput substringWithRange:(NSRange){idxSubString, lenAvailableSubstr}];
    
        if([_testText update:_strInput :idxSubString]) {
            _isTrialEnded = true;
            [self cleanUp];
        }
        isThereNewInput = false;
    }
    
    [_textField setText:[_strInput stringByAppendingString:cursorEER]];
}

- (void) cleanUp {
    [charArray removeAllObjects];
    ptrCharEER = 0;
    idxSubString = 0;
    _strInput = @"";
    [_textField setText:[_strInput stringByAppendingString:cursorEER]];
}

//- (long) getCurrentTimeInMS
//{
//    NSTimeInterval time = ([[NSDate date] timeIntervalSince1970]);
//    long digits = (long)time; // this is the first 10 digits
//    int decimalDigits = (int)(fmod(time, 1) * 1000); // this will get the 3 missing digits
//    long timeStamp = (digits * 1000) + decimalDigits;
//    return timeStamp;
//}

- (long) getTime {
    struct timeval time;
    gettimeofday(&time, NULL);
    return (time.tv_sec * 1000) + (time.tv_usec / 1000);
}

- (void) updateTimeOut {
    if(_firstSwipe == nil) {
        _state = NONE;
    }
    else {
        long currTime = [self getTime];
        if(currTime - _firstSwipe.timeStamp > BTWNTIMEOUT) {
            
            if(_state == INPROGRESS) {
                NSLog(@"time out!");
                if(imgView != nil) {
                    [self updateVisual:UNKNOWN];
                }
            }
            
            _state = NONE;
            _firstSwipe = nil;
        }
    }
}

- (void) updatecursorEER {
    cursorEER = [cursorEER isEqualToString:@"_"] ? @" " : @"_";
    [_textField setText:[_strInput stringByAppendingString:cursorEER]];
//    NSLog(@"%@", cursorEER);

}

- (void) printState {
    NSString* strState = @"unknown";
    switch (_state) {
        case NONE:
            strState = @"none";
            break;
        case INPROGRESS:
            strState = @"waiting for next stroke... ";
            break;
        case DONE:
            strState = @"done";
            break;
        default:
            break;
    }
    
    NSLog(@"%@", strState);
}

// associate constants to the directions they represent
- (void) initGestureMap {
    [_gestureMap setObject:@"center" forKey:[NSNumber numberWithInt:CENTER]];
    [_gestureMap setObject:@"north" forKey:[NSNumber numberWithInt:NORTH]];
    [_gestureMap setObject:@"northeast" forKey:[NSNumber numberWithInt:NORTHEAST]];
    [_gestureMap setObject:@"east" forKey:[NSNumber numberWithInt:EAST]];
    [_gestureMap setObject:@"southeast" forKey:[NSNumber numberWithInt:SOUTHEAST]];
    [_gestureMap setObject:@"south" forKey:[NSNumber numberWithInt:SOUTH]];
    [_gestureMap setObject:@"southwest" forKey:[NSNumber numberWithInt:SOUTHWEST]];
    [_gestureMap setObject:@"west" forKey:[NSNumber numberWithInt:WEST]];
    [_gestureMap setObject:@"northwest" forKey:[NSNumber numberWithInt:NORTHWEST]];
}

- (void) readConfig {
    NSString *path = [[NSBundle mainBundle] pathForResource:@"participant-section" ofType:@"txt"];
    NSString *strFile = [NSString stringWithContentsOfFile:path encoding:NSUTF8StringEncoding error:nil];
//    int len = strFile.length;
    NSLog(@"%@", strFile);
    NSRange textRange = [strFile rangeOfString:@","];
    for ( int idxComma = textRange.location, i = 0;textRange.location != NSNotFound; i++)
    {
        NSString *strFeat = [strFile substringToIndex:idxComma];
        if(i == 0) {
            _testText.participantId = [strFeat intValue];
        } else if(i == 1) {
            _testText.section = [strFeat intValue];
        }
        strFile = [strFile substringFromIndex:idxComma + 1];
        textRange = [strFile rangeOfString:@","];
    }
}

- (void) readKeyMap {
    NSString *path = [[NSBundle mainBundle] pathForResource:@"key-mapping" ofType:@"csv"];
    NSString *strFile = [NSString stringWithContentsOfFile:path encoding:NSUTF8StringEncoding error:nil];

    NSRange textRange = [strFile rangeOfString:@"\n"];
    for ( int idxNewLine = textRange.location + 1;textRange.location != NSNotFound;)
    {
        strFile = [strFile substringFromIndex:idxNewLine];
        
        int numFeat = 3;
        NSString *strID = @"";
        
        for (int i=0; i<numFeat; i++) {
            int idxComma = [strFile rangeOfString:@","].location;
            NSString *strFeat = [strFile substringToIndex:idxComma];
            strID = [strID stringByAppendingFormat:@"_%@", strFeat];
            strFile = [strFile substringFromIndex:idxComma + 1];
        }
        
        textRange = [strFile rangeOfString:@"\n"];
        idxNewLine = textRange.location + 1;
        
        NSString *strKey = @"";
        if (textRange.location == NSNotFound) {
            strKey = strFile;
        }
        else {
            strKey = [strFile substringToIndex:idxNewLine-1];
        }
        
//        NSLog(@"%@", strKey);
        [_keyMap setObject:strKey forKey:strID];
    }
}

- (void) initVisualView :(UIView*) view {
    imgView = [[UIImageView alloc] init];
    [imgView setAlpha:0];
    imgView.image = [UIImage imageNamed:@"keyboard.png"];
    imgView.frame = CGRectMake(view.frame.size.width/4, view.frame.size.height/4, view.frame.size.width/2, view.frame.size.height/2);
    [view addSubview:imgView];
}

- (void) initTextField :(UIView*) view {
//    float W = view.frame.size.width;
//    float H = view.frame.size.height;
    
//    textField = [[UITextField alloc] initWithFrame:CGRectMake(W * TEXTFIELDORIX, H * TEXTFIELDORIY, W * TEXTFIELDWIDTHRATIO, H * TEXTFIELDHEIGHTRATIO)];
//    textField.textAlignment = NSTextAlignmentLeft;
//    [textField setBackgroundColor:[UIColor clearColor]];
//    [textField setUserInteractionEnabled:NO];
//    [view addSubview:textField];
    
//    _testText = [[xacTestText alloc] initWithFrame:CGRectMake(W * TEXTFIELDORIX - W / 2, H * TEXTFIELDORIY - H / 2, W * TEXTFIELDWIDTHRATIO * 2, H * TEXTFIELDHEIGHTRATIO)];
//    [view addSubview:_testText];
//    [_testText loadWords];
}

- (void) updateVisual :(int)swipe {
    switch (swipe) {
        case CENTER:
            imgView.image = [UIImage imageNamed:@"FGH.png"];
            break;
        case NORTH:
            imgView.image = [UIImage imageNamed:@"RTYU.png"];
            break;
        case NORTHEAST:
            imgView.image = [UIImage imageNamed:@"IOP.png"];
            break;
        case EAST:
            imgView.image = [UIImage imageNamed:@"JKL.png"];
            break;
        case SOUTHEAST:
            imgView.image = [UIImage imageNamed:@"Mcp.png"];
            break;
        case SOUTH:
            imgView.image = [UIImage imageNamed:@"VBN.png"];
            break;
        case SOUTHWEST:
            imgView.image = [UIImage imageNamed:@"ZXC.png"];
            break;
        case WEST:
            imgView.image = [UIImage imageNamed:@"ASD.png"];
            break;
        case NORTHWEST:
            imgView.image = [UIImage imageNamed:@"QWE.png"];
            break;
//        case SWITCHBOARD:
//            if(_keyboardType == ALPHABET) {
////                imgView.image = [UIImage imageNamed:@"ASD.png"];
//                _keyboardType = SYMNUM;
//            } else {
////                 imgView.image = [UIImage imageNamed:@"keyboard.png"];
//                _keyboardType = ALPHABET;
//            }
//            break;
        default:
//            if(_keyboardType == ALPHABET) {
//                imgView.image = [UIImage imageNamed:@"sym-keyboard"];
////                _keyboardType = SYMNUM;
//            } else {
//                imgView.image = [UIImage imageNamed:@"keyboard.png"];
////                _keyboardType = ALPHABET;
//            }
            imgView.image = [UIImage imageNamed:@"keyboard.png"];
            break;
    }

}

- (void) hideVisual :(BOOL)toHide {
    if(toHide) {
        [imgView setAlpha:0];
    } else {
        [imgView setAlpha:1];
    }
}

- (BOOL) isKeyboardReady {
    return imgView.alpha == 1 ? true : false;
}

//- (void) startSession {
//    [self cleanUp];
//    [_testText update:nil :0];
//}

- (BOOL) getWord :(int)sign {
    if(_isTrialEnded) {
        [self cleanUp];
        
//        if([_testText loadWord:sign]) {
        if(_testText.isWordLoaded) {
            _testText.visualSearchStarted1 = [self getTime];
            [self checkTimer];
            _isTrialEnded = false;
            [self hideVisual:false];
            return true;
        }
    }
    
    return false;
}

- (void) loadSharedString {
    [self cleanUp];
    [_testText loadSharedString];
}
@end
