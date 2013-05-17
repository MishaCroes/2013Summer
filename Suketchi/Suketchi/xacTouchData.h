//
//  xacTouchData.h
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 5/15/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface xacTouchData : NSObject

@property NSString* key;

@property UITouch* uiTouch;

@property int numTouchPoints;
@property long startTime;
@property long endTime;

@property float maxSize;
@property float sumSize;
@property NSMutableArray *sizes;

@property CGPoint startPos;
@property CGPoint endPos;
@property CGPoint pos;
@property float mileage;

- (float) getSDSize;

- (NSArray*) packageData;

@end
