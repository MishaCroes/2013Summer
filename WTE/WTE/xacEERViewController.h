//
//  xacFirstViewController.h
//  WTE
//
//  Created by Xiang 'Anthony' Chen on 6/27/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "xacEERWatchView.h"
#import "WTEConstants.h"

@interface xacEERViewController : UIViewController

@property (strong, nonatomic) IBOutlet UIView *mainView;
@property xacEERWatchView *watchView;

@end
