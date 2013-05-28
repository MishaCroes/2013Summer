//
//  xacCanvas.h
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 4/8/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "TouchClassifier.h"
#import "xacTouchData.h"

#define PEN     0
#define FINGER  1
#define PALM    2

#define NOTHING         0   // 000
#define PALMREJECTION   1   // 001
#define FINGERERASE     2   // 010

@interface xacCanvas : UIView

@property BOOL isTemp;
@property BOOL toFade;

// single-stroke
@property UIBezierPath *path;
//

// multi-stroke
@property NSMutableArray *touchPoints;
@property NSMutableDictionary *touchAfterEffect;
@property NSMutableArray *paths;
@property NSMutableArray *drawnPaths;
@property NSMutableDictionary *pathMap;
//

@property TouchClassifier *touchClassifier;

- (void) doTouchBegan:(NSSet *)touches withEvent:(UIEvent *)event;
- (void) doTouchMoved:(NSSet *)touches withEvent:(UIEvent *)event;
- (void) doTouchEnded:(NSSet *)touches withEvent:(UIEvent *)event;

- (void) clearCanvas;
- (void) mediateTouch: (NSMutableArray*)tds :(int)methods;

@end
