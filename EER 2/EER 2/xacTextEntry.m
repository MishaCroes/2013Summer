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
UITextView *textView;
NSMutableArray *charArray;
int ptrChar = 0;
NSString *cursor;


- (id) init {
    self = [super init];
    if(self) {
        
        // routine to monitor time out of two-stroke input
        [NSTimer scheduledTimerWithTimeInterval:1.0f / TIMEOUTUPDATERATE
                                         target:self
                                       selector:@selector(updateTimeOut)
                                       userInfo:nil
                                        repeats:YES];
        // routine to update the visual of the cursor
        [NSTimer scheduledTimerWithTimeInterval:1.0f / CURSORREFRESHRATE
                                         target:self
                                       selector:@selector(updateCursor)
                                       userInfo:nil
                                        repeats:YES];
        
        _keyMap = [[NSMutableDictionary alloc] init];
        [self readKeyMap];
        _gestureMap = [[NSMutableDictionary alloc] init];
        [self initGestureMap];
        
        textView = nil;
        charArray = [[NSMutableArray alloc] initWithCapacity:TEXTLINELENGTH];
        imgView = nil;
    }
    return self;
}

- (void) update :(xacSwipe*) swipe {
    switch (_state) {
        case NONE:
            _numTouch = swipe.touchPoints.count;
            _firstSwipe = [self getCopyOf:swipe];
            [self updateVisual:_firstSwipe.gesture];
            _state = INPROGRESS;
            break;
        case INPROGRESS:
            _secondSwipe = [self getCopyOf:swipe];
            [self doTextEntry];
            _secondSwipe = _firstSwipe = nil;
            _state = DONE;
            [self updateVisual:UNKNOWN];
            break;
        case DONE:
            _state = NONE;
            break;
        default:
            break;
    }
    
    [self printState];
}

- (xacSwipe*) getCopyOf :(xacSwipe*)theSwipe {
    xacSwipe *tmpSwipe = [[xacSwipe alloc] init];
    tmpSwipe.gesture = theSwipe.gesture;
    tmpSwipe.touchPoints = theSwipe.touchPoints;
    tmpSwipe.timeStamp = theSwipe.timeStamp;
    return tmpSwipe;
}

- (void) doTextEntry {
    
    // space
    if(_firstSwipe.gesture == EAST && _secondSwipe.gesture == EAST) {
        NSString *key = @" ";
        if(ptrChar <= TEXTLINELENGTH - 1) {
            charArray[ptrChar++] = key;
        } else {
            [charArray removeObjectAtIndex:0];
            [charArray addObject:key];
        }
    }
    // back space
    else if(_firstSwipe.gesture == WEST && _secondSwipe.gesture == WEST) {
        if(charArray.count > 0) {
            [charArray removeLastObject];
            ptrChar--;
        }
    }
    // the others
    else {
        
        NSString *strFirstSwipe = [_gestureMap objectForKey:[NSNumber numberWithInt:_firstSwipe.gesture]];
        NSString *strSecondSwipe = [_gestureMap objectForKey:[NSNumber numberWithInt:_secondSwipe.gesture]];
        NSString *strID = [NSString stringWithFormat:@"_%d_%@_%@", _numTouch, strFirstSwipe, strSecondSwipe];
        
        NSString *key = [_keyMap objectForKey: strID];
        if(key) {
            if(ptrChar <= TEXTLINELENGTH - 1) {
                charArray[ptrChar++] = key;
            } else {
                [charArray removeObjectAtIndex:0];
                [charArray addObject:key];
            }
        }
        NSLog(@"%@: %@", strID, key);
        
    }
    
}

- (void) updateTextView {
        
    NSString *sentence = @"";
    for(NSString *str in charArray) {
        sentence = [sentence stringByAppendingString:str];
    }
    
    sentence = [sentence stringByAppendingString:cursor];
    
    [textView setText:sentence];
}

- (long) getCurrentTimeInMS
{
    NSTimeInterval time = ([[NSDate date] timeIntervalSince1970]);
    long digits = (long)time; // this is the first 10 digits
    int decimalDigits = (int)(fmod(time, 1) * 1000); // this will get the 3 missing digits
    long timeStamp = (digits * 1000) + decimalDigits;
    return timeStamp;
}

- (void) updateTimeOut {
    if(_firstSwipe == nil) {
        _state = NONE;
    }
    else {
        long currTime = [self getCurrentTimeInMS];
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

- (void) updateCursor {
    cursor = [cursor isEqualToString:@"_"] ? @" " : @"_";
    [self updateTextView];
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
    imgView.image = [UIImage imageNamed:@"keyboard.png"];
    imgView.frame = CGRectMake(0, 0, view.frame.size.width, view.frame.size.height);
    [view addSubview:imgView];
}

- (void) initTextView :(UIView*) view {
    float W = view.frame.size.width;
    float H = view.frame.size.height;
    textView = [[UITextView alloc] initWithFrame:CGRectMake(0, H * 0.15, W, H * 0.6)];
    [textView setFont:[UIFont fontWithName:@"ArialMT" size:150 / TEXTLINELENGTH]];
    textView.textAlignment = NSTextAlignmentLeft;
    [textView setBackgroundColor:[UIColor clearColor]];
    [textView setUserInteractionEnabled:NO];
    [view addSubview:textView];
}

- (void) updateVisual :(int)swipe {
    switch (swipe) {
        case CENTER:
            imgView.image = [UIImage imageNamed:@"FGH.png"];
            break;
        case NORTH:
            imgView.image = [UIImage imageNamed:@"TYU.png"];
            break;
        case NORTHEAST:
            imgView.image = [UIImage imageNamed:@"IOP.png"];
            break;
        case EAST:
            imgView.image = [UIImage imageNamed:@"JKL.png"];
            break;
        case SOUTHEAST:
            imgView.image = [UIImage imageNamed:@"VBNM.png"];
            break;
        case SOUTH:
            // south is preserved for going back to the full keyboard
            if(imgView != nil) {
                [self updateVisual:UNKNOWN];
            }
            _state = NONE;
            _firstSwipe = nil;
            break;
        case SOUTHWEST:
            imgView.image = [UIImage imageNamed:@"ZXC.png"];
            break;
        case WEST:
            imgView.image = [UIImage imageNamed:@"ASD.png"];
            break;
        case NORTHWEST:
            imgView.image = [UIImage imageNamed:@"QWER.png"];
            break;
        default:
            imgView.image = [UIImage imageNamed:@"keyboard.png"];
            break;
    }

}

@end
