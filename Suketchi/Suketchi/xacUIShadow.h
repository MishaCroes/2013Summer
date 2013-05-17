//
//  xacUIShadow.h
//  antReader
//
//  Created by Xiang 'Anthony' Chen on 3/8/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacUIBehavior.h"
#import <QuartzCore/QuartzCore.h>

#define BASE_RADIUS 25

@interface xacUIShadow : xacUIBehavior

@property UIView* shadow;
@property UILabel* label;

- (id) init :(UIView*) parentView;
- (void) selfDestruct;
- (void) setColor :(UIColor*) color;

- (void) updateText: (NSString*) str;
@end
