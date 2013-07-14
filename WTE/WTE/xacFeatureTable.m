//
//  xacFeatureTable.m
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 5/15/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacFeatureTable.h"

@implementation xacFeatureTable

- (id)init
{
    self = [super init];
    if(self)
    {
        _strTable = @"";
    }
    return self;
}

- (void) addLine:(NSString*) line
{
    _strTable = [_strTable stringByAppendingString: [NSString stringWithFormat:@"%@\n", line]];
}

- (void) writeToFile:(int) pId :(int) section
{
    NSArray *paths = NSSearchPathForDirectoriesInDomains(NSDocumentDirectory, NSUserDomainMask, YES);

    NSDateFormatter* dateFormatter = [[NSDateFormatter alloc] init];
    [dateFormatter setDateFormat: @"yyyy-MM-dd"];
    NSString *strDate = [dateFormatter stringFromDate:[NSDate date]];
    NSString *docDir = [paths objectAtIndex: 0];
    [self createDirectory:strDate atFilePath:docDir];
    docDir = [NSString stringWithFormat:@"%@/%@", docDir, strDate];
    
    NSDateFormatter* dateTimeFormatter = [[NSDateFormatter alloc] init];
    [dateTimeFormatter setDateFormat:@"yyyy-MM-dd_hh:mm:ss"];
    NSString *strDateTime = [dateTimeFormatter stringFromDate:[NSDate date]];
    NSString *docName = [NSString stringWithFormat:@"WatchTextEntry-%d-%d-%@.csv", pId, section, strDateTime];
    NSString *docFile = [docDir stringByAppendingPathComponent: docName];

    [_strTable writeToFile:docFile atomically:NO encoding:NSUTF8StringEncoding error:nil];
}

-(void)createDirectory:(NSString *)directoryName atFilePath:(NSString *)filePath
{
    NSString *filePathAndDirectory = [filePath stringByAppendingPathComponent:directoryName];
    NSError *error;
    
    BOOL isDir;
    if([[NSFileManager defaultManager] fileExistsAtPath:filePathAndDirectory isDirectory:&isDir])
    {
        return;
    }
    
    if (![[NSFileManager defaultManager] createDirectoryAtPath:filePathAndDirectory
                                   withIntermediateDirectories:NO
                                                    attributes:nil
                                                         error:&error])
    {
        NSLog(@"Create directory error: %@", error);
    }
}

@end
