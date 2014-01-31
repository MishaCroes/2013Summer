//
//  xacWatchView.h
//  ZoomBoard
//
//  Created by Xiang 'Anthony' Chen on 6/19/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "xacDummyLayer.h"
#import "WTEConstants.h"
#import "xacTestText.h"

@interface xacZoomBoardWatchView : UIView

@property xacTestText* testText;
@property UITextField* textField;
@property BOOL trialFinished;
@property long timeTouchDown;
@property UITextView *infoView;
@property NSString *strTechnique;
@property NSString *strParticipant;
@property long timeStarted;
@property NSString* strInput;

- (void) startSession;
- (BOOL) getWord :(int)sign;
- (void) updateInfoView;

@end
