//
//  xacWatchView.h
//  EER 2
//
//  Created by Xiang 'Anthony' Chen on 6/13/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "xacSwipe.h"
#import "xacTextEntry.h"

#define MAXTOUCHPOINTS 2

@interface xacEERWatchView : UIView

@property NSMutableDictionary *touchPoints;
@property xacSwipe *swipe;
@property xacTextEntry *textEntry;
@property long touchDownTime;
@property UITextView *infoView;
@property NSString *strTechnique;
@property NSString *strParticipant;
@property long timeStarted;

- (BOOL) getWord :(int)sign;
- (void) loadSharedString;
- (void) updateInfoView;

@end
