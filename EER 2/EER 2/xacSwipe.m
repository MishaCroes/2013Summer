//
//  xacSwipe.m
//  EER 2
//
//  Created by Xiang 'Anthony' Chen on 6/12/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacSwipe.h"

@implementation xacSwipe

-(id) init {
    self = [super init];
    if(self) {
        _touchPoints = [[NSMutableDictionary alloc] init];
    }
    return self;
}

-(void) addTouchPoint :(CGPoint)start :(NSString*) key {
    xacTouch *touch = [[xacTouch alloc] init];
    touch.start = start;
    [_touchPoints setObject:touch forKey:key];
}

-(void) endTouchPoint :(CGPoint)end :(NSString*) key {
    xacTouch *touch = [_touchPoints objectForKey:key];
    if(touch != nil) {
        touch.end = end;
    }
    
    [self printStroke :[self getGesture]];
}

- (int) getGesture {
    _gesture = UNKNOWN;
    NSMutableArray *strokes = [[NSMutableArray alloc] init];
    
    for(id key in _touchPoints) {
        xacTouch *touch = [_touchPoints objectForKey:key];
        
        int stroke = UNKNOWN;
        if(touch) {
            float x = touch.end.x - touch.start.x;
            float y = -(touch.end.y - touch.start.y);
            
            if(MAX(fabs(x), fabs(y)) < TAPWIDTH) {
                stroke = CENTER;
            }
            else if(y / tanf(THETA * 5 / 2) < x && x < y / tanf(THETA * 3 / 2)) {
                stroke = NORTH;
            }
            else if(y < tan(THETA * 3 / 2) * x && y > tan(THETA * 1 / 2) * x) {
                stroke = NORTHEAST;
            }
            else if(y < tan(THETA * 1 / 2) * x && y > tan(-THETA * 1 / 2) * x) {
                stroke = EAST;
            }
            else if(y < tan(THETA * -1 / 2) * x && y > tan(THETA * -3 / 2) * x) {
                stroke = SOUTHEAST;
            }
            else if(y / tanf(THETA * -5 / 2) < x && x < y / tanf(THETA * -3 / 2)) {
                stroke = SOUTH;
            }
            else if(y < tan(THETA * -7 / 2) * x && y > tan(THETA * -5 / 2) * x) {
                stroke = SOUTHWEST;
            }
            else if(y < tan(THETA * -9 / 2) * x && y > tan(THETA * -7 / 2) * x) {
                stroke = WEST;
            }
            else if(y < tan(THETA * -11 / 2) * x && y > tan(THETA * -9 / 2) * x) {
                stroke = NORTHWEST;
            }
        }
        
        [strokes addObject:[NSNumber numberWithInt:stroke]];
    }
    
    if([_touchPoints count] == 1) {
        NSNumber *gesIndex = [strokes objectAtIndex:0];
        _gesture = [gesIndex intValue];
    }
    
    _timeStamp = [self getCurrentTimeInMS];
    
    return _gesture;
}

- (void) printStroke :(int)stroke {
    NSString *strStroke = @"unknown";
    switch (stroke) {
        case CENTER:
            strStroke = @"center";
            break;
        case NORTH:
            strStroke = @"north";
            break;
        case NORTHEAST:
            strStroke = @"northeast";
            break;
        case EAST:
            strStroke = @"east";
            break;
        case SOUTHEAST:
            strStroke = @"southeast";
            break;
        case SOUTH:
            strStroke = @"south";
            break;
        case SOUTHWEST:
            strStroke = @"southwest";
            break;
        case WEST:
            strStroke = @"west";
            break;
        case NORTHWEST:
            strStroke = @"northwest";
            break;
        default:
            break;
    }
    
    NSLog(@"%@", strStroke);
}

- (void) cleanTouchPoint {
    [_touchPoints removeAllObjects];
}

- (long) getCurrentTimeInMS
{
    NSTimeInterval time = ([[NSDate date] timeIntervalSince1970]);
    long digits = (long)time; // this is the first 10 digits
    int decimalDigits = (int)(fmod(time, 1) * 1000); // this will get the 3 missing digits
    long timeStamp = (digits * 1000) + decimalDigits;
    return timeStamp;
}

- (NSString*) strGesture {
    
}

@end
