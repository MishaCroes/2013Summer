//
//  xacWatchView.h
//  EER 2
//
//  Created by Xiang 'Anthony' Chen on 6/13/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "xacSwipe.h"
#import "xacTextEntry.h"

#define MAXTOUCHPOINTS 2
#define WATCHWIDTH 128
#define WATCHHEIGHT 128

@interface xacWatchView : UIView

@property NSMutableDictionary *touchPoints;
@property xacSwipe *swipe;
@property xacTextEntry *textEntry;


@end
