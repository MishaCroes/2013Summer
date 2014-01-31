//
//  xacFeatureTable.h
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 5/15/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "WTEConstants.h"

@interface xacFeatureTable : NSObject

@property NSString *strTable;

- (void) addLine:(NSString*) line;
- (void) writeToFile :(int*) technique :(int) pId :(int) section :(NSString*) logType;

@end
