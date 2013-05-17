//
//  xacTouchData.m
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 5/15/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacTouchData.h"

@implementation xacTouchData

- (id)init
{
    self = [super init];
    if(self)
    {
        _sizes = [[NSMutableArray alloc] init];
    }
    return self;
}

- (float) getSDSize
{
    float tmpSum = 0;
    float avgSize = _sumSize / _numTouchPoints;
    for(NSNumber *size in _sizes)
    {
        float valueSize = [size floatValue];
        tmpSum += (valueSize - avgSize) * (valueSize - avgSize);
    }
    
    float sdSize = sqrtf(tmpSum / _numTouchPoints);
    return sdSize;
}

- (NSArray*) packageData {

    NSNumber *maxSize = [NSNumber numberWithDouble: _maxSize];
    NSNumber *avgSize = [NSNumber numberWithDouble: _sumSize / _numTouchPoints];
    NSNumber *sdSize = [NSNumber numberWithDouble: [self getSDSize]];
    NSNumber *lifeSpan = [NSNumber numberWithDouble: _endTime - _startTime];
    NSNumber *offset = [NSNumber numberWithDouble:
                        sqrtf((_startPos.x - _endPos.x) * (_startPos.x - _endPos.x) +
                              (_startPos.y - _endPos.y) * (_startPos.y - _endPos.y))];
    NSNumber *avgVelocity = [NSNumber numberWithDouble: [offset doubleValue] / [lifeSpan doubleValue]];
    NSNumber *avgSpeed = [NSNumber numberWithDouble: _mileage / [lifeSpan doubleValue]];
    
    NSArray *touchData = [[NSArray alloc] initWithObjects:maxSize, avgSize, sdSize, avgVelocity, avgSpeed, lifeSpan, nil];
    
    return touchData;
}


@end
