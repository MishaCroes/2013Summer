//
//  xacTouchLogger.h
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 5/15/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "xacTouchData.h"
#import "xacFeatureTable.h"

@interface xacTouchLogger : NSObject

@property UIView* masterView;
@property NSMutableDictionary *touchDataPoints;
@property NSMutableArray *touchDataArchive;
@property xacFeatureTable *featureTable;
@property NSString* label;
@property BOOL isLogging;

- (id) init :(UIView*) masterView;
- (void) initLogging;
- (void) finishLogging;
- (void) depleteArchive;
- (void) wipeResidua;

- (void) doTouchBegan:(NSSet *)touches withEvent:(UIEvent *)event;
- (void) doTouchMoved:(NSSet *)touches withEvent:(UIEvent *)event;
- (void) doTouchEnded:(NSSet *)touches withEvent:(UIEvent *)event;

@end
