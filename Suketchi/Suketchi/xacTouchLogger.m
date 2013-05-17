//
//  xacTouchLogger.m
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 5/15/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacTouchLogger.h"

@implementation xacTouchLogger

- (id) init:(UIView*) masterView
{
    self = [super init];
    if (self) {
        _masterView = masterView;
        _touchDataPoints = [[NSMutableDictionary alloc] init];
        _label = @"unknown";
    }
    return self;
}

- (void) initLogging
{
    _featureTable = [[xacFeatureTable alloc] init];
    [_featureTable addLine:@"maxSize,avgSize,sdSize,avgVelocity,avgSpeed,lifeSpan,class"];
    _isLogging = YES;
}

- (void) finishLogging
{
    [_featureTable writeToFile];
    _isLogging = NO;
}

- (void) doTouchBegan:(NSSet *)touches withEvent:(UIEvent *)event
{
    for(UITouch *touch in [touches allObjects])
    {
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        if([_touchDataPoints objectForKey: key]== nil) {
            xacTouchData* touchData = [[xacTouchData alloc] init];
            touchData.key = key;
            touchData.uiTouch = touch;
            touchData.numTouchPoints = 1;
            touchData.startPos = touchData.pos = [touch locationInView:_masterView];
            touchData.startTime = [self getCurrentTimeInMS]; // (long)(NSTimeInterval)([[NSDate date] timeIntervalSince1970]);

            touchData.sumSize = 0;
            touchData.maxSize = 0;
            float radius = [[touch valueForKey:@"pathMajorRadius"] floatValue];
            touchData.sumSize += radius;
            touchData.maxSize = MAX(touchData.maxSize, radius);
            [touchData.sizes addObject:[NSNumber numberWithFloat: radius]];
//            NSLog(@"%ld", touchData.startTime);
            [_touchDataPoints setObject:touchData forKey: key];
        }
    }
}

- (void) doTouchMoved:(NSSet *)touches withEvent:(UIEvent *)event
{
    for(UITouch *touch in [touches allObjects])
    {
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        xacTouchData* touchData = [_touchDataPoints objectForKey:key];
        touchData.numTouchPoints++;

        CGPoint prePos = touchData.pos;
        CGPoint curPos = [touch locationInView:_masterView];
        touchData.mileage += sqrtf((curPos.x - prePos.x) * (curPos.x - prePos.x) + (curPos.y - prePos.y) * (curPos.y - prePos.y));
        
        touchData.pos = [touch locationInView:_masterView];
        float radius = [[touch valueForKey:@"pathMajorRadius"] floatValue];
        touchData.sumSize += radius;
        touchData.maxSize = MAX(touchData.maxSize, radius);
        [touchData.sizes addObject:[NSNumber numberWithFloat: radius]];        
    }
}

- (void) doTouchEnded:(NSSet *)touches withEvent:(UIEvent *)event
{
    _touchDataArchive = [[NSMutableArray alloc] init];
    for(UITouch *touch in [touches allObjects])
    {
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        xacTouchData* touchData = [_touchDataPoints objectForKey:key];
        touchData.numTouchPoints++;        
        touchData.endPos = touchData.pos = [touch locationInView:_masterView];
        touchData.endTime = [self getCurrentTimeInMS]; // (long)(NSTimeInterval)([[NSDate date] timeIntervalSince1970]);
        float radius = [[touch valueForKey:@"pathMajorRadius"] floatValue];
        touchData.sumSize += radius;
        touchData.maxSize = MAX(touchData.maxSize, radius);
        [touchData.sizes addObject:[NSNumber numberWithFloat: radius]];
        
        [self addLogEntry:touchData :_label];
        
        [_touchDataArchive addObject: touchData];
        [_touchDataPoints removeObjectForKey:key];

    }
}

- (void) detectTouch
{
    NSDictionary *tmpTouchDataPoints = [[NSDictionary alloc] initWithDictionary: _touchDataPoints];
    for(xacTouchData *touchData in tmpTouchDataPoints)
    {
        UITouch* touch = touchData.uiTouch;
        NSString* key = [NSString stringWithFormat:@"%d", [touch hash]];
        if([touch phase] == UITouchPhaseEnded || [touch phase] == UITouchPhaseCancelled)
        {
            touchData.endPos = touchData.pos = [touch locationInView:_masterView];
            touchData.endTime = [self getCurrentTimeInMS];// (long)(NSTimeInterval)([[NSDate date] timeIntervalSince1970]);
            
            [_touchDataPoints removeObjectForKey:key];
        }
    }
}

- (void) addLogEntry:(xacTouchData*)td :(NSString*)class
{
//    NSLog(@"X0: %f, Y0: %f, X1: %f, Y1: %f, dT: %ld, avgSize: %f, maxSize: %f", td.startPos.x, td.startPos.y, td.endPos.x, td.endPos.y, td.endTime - td.startTime, td.sumSize / td.numTouchPoints, td.maxSize);
//    [_featureTable addLine:@"maxSize,avgSize,sdSize,avgVelocity,avgSpeed,lifeSpan,class"];

    float maxSize = td.maxSize;
    float avgSize = td.sumSize / td.numTouchPoints;
    float sdSize = [td getSDSize];
    long lifeSpan = td.endTime - td.startTime;
    float offset = sqrtf((td.startPos.x - td.endPos.x) * (td.startPos.x - td.endPos.x) +
                         (td.startPos.y - td.endPos.y) * (td.startPos.y - td.endPos.y));
    float avgVelocity = offset / lifeSpan;
    float avgSpeed = td.mileage / lifeSpan;
    
    [_featureTable addLine: [NSString stringWithFormat:@"%f,%f,%f,%f,%f,%ld,%@", maxSize,avgSize,sdSize,avgVelocity,avgSpeed,lifeSpan,class]];
}

- (long) getCurrentTimeInMS
{
    NSTimeInterval time = ([[NSDate date] timeIntervalSince1970]);
    long digits = (long)time; // this is the first 10 digits
    int decimalDigits = (int)(fmod(time, 1) * 1000); // this will get the 3 missing digits
    long timeStamp = (digits * 1000) + decimalDigits;
    return timeStamp;
}

@end