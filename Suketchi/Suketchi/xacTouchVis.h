//
//  xacTouchVis.h
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 5/13/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "xacUIShadow.h"
#import "TouchClassifier.h"
#import "xacTouchData.h"

@interface xacTouchVis : UIView

@property NSMutableArray *touchPoints;
@property NSMutableDictionary *touchVisuals;
@property NSMutableDictionary *touchLabels;
@property float scaleRatio;
@property TouchClassifier *touchClassifier;

- (void) doTouchBegan:(NSSet *)touches withEvent:(UIEvent *)event;
- (void) doTouchMoved:(NSSet *)touches withEvent:(UIEvent *)event;
- (void) doTouchEnded:(NSSet *)touches withEvent:(UIEvent *)event;

- (void) showTouchLabel: (NSMutableArray*)tds;

@end
