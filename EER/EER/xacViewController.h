//
//  xacViewController.h
//  EER
//
//  Created by Xiang 'Anthony' Chen on 5/30/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "xacSwipe.h"
#import "xacTextEntry.h"

#define MAXTOUCHPOINTS 2
#define WATCHWIDTH 128
#define WATCHHEIGHT 128

@interface xacViewController : UIViewController

@property NSMutableDictionary *touchPoints;
@property (strong, nonatomic) IBOutlet UIView *mainView;
@property UIView *watchScreenView;
@property xacSwipe *swipe;
@property xacTextEntry *textEntry;

@end
