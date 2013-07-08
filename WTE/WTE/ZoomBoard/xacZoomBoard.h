//
//  xacZoomBoard.h
//  ZoomBoard
//
//  Created by Xiang 'Anthony' Chen on 6/19/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <UIKit/UIKit.h>

#define CURSORREFRESHRATE 3

@interface xacZoomBoard : UIView

- (void) zoomIn:(float)x :(float)y :(float)zoomFactor;
- (void) zoomOut:(float)zoomFactor;
//- (void) touchType: (UIEvent*)event;
- (void) startSession;

@property bool readyToType;
@property NSString *typedChar;

@end
