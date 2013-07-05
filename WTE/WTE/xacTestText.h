//
//  xacTestText.h
//  WTE
//
//  Created by Xiang 'Anthony' Chen on 7/4/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "WTEConstants.h"
#include <sys/time.h>

@interface xacTestText : UIView

@property UITextField* textField;
@property NSMutableArray* words;
@property long timeStartTyping;
@property int timeTyping;
@property int idxWord;
@property NSString* curWord;

- (void) loadWords;
- (void) loadWord :(int)sign;
- (BOOL) update :(NSString*) input :(int) idxSubStr;
- (void) resetTimer;
- (void) loadSharedString;

@end
