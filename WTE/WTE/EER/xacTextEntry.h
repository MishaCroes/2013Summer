//
//  xacTextEntry.h
//  EER 2
//
//  Created by Xiang 'Anthony' Chen on 6/12/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "xacSwipe.h"
#import "WTEConstants.h"
#import "xacTestText.h"

#define BTWNTIMEOUT 2000
#define CURSORREFRESHRATE 3
#define TIMEOUTUPDATERATE 10

@interface xacTextEntry : NSObject

enum EntryState {
    NONE = 0,
    INPROGRESS,
    DONE
};

@property int numTouch;
@property xacSwipe *firstSwipe;
@property xacSwipe *secondSwipe;
@property enum EntryState state;
@property NSMutableDictionary *keyMap;
@property NSMutableDictionary *gestureMap;
@property xacTestText* testText;
@property NSString* strInput;
@property NSString* subStrInput;
@property UITextField *textField;
@property BOOL isTrialEnded;
@property long touchDownTime;
@property int keyboardType;

- (void) update :(xacSwipe*) swipe;
- (void) initVisualView :(UIView*) view;
- (void) initTextField :(UIView*) view;
- (void) startSession;
- (void) checkTimer;
//- (void) loadSharedString;
- (BOOL) getWord :(int)sign;
- (void) readConfig;
- (void) hideVisual :(BOOL)toHide;
- (BOOL) isKeyboardReady;
    
@end
