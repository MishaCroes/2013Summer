//
//  xacTextEntry.h
//  EER
//
//  Created by Xiang 'Anthony' Chen on 5/30/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "xacSwipe.h"

#define BTWNTIMEOUT 2000
#define TEXTLINELENGTH 8

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

- (void) update :(xacSwipe*) swipe;
- (void) initVisualView :(UIView*) view;
- (void) initTextView :(UIView*) view;

@end
