//
//  xacSecondViewController.h
//  WTE
//
//  Created by Xiang 'Anthony' Chen on 6/27/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "xacZoomBoardWatchView.h"
#import "WTEConstants.h"

#define WATCHWIDTH 128
#define WATCHHEIGHT 128

@interface xacZoomBoardViewController : UIViewController
@property (strong, nonatomic) IBOutlet UIView *mainView;
@property xacZoomBoardWatchView *watchView;
//@property xacTestText* testText;
@property UITextField* textField;

@end
