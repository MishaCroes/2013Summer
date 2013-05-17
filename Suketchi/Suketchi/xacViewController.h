//
//  xacViewController.h
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 4/8/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "xacCanvas.h"
#import "xacTouchVis.h"
#import "xacTouchLogger.h"
//#import "TouchClassifier.h"

@interface xacViewController : UIViewController

@property (strong, nonatomic) IBOutlet UIView *mainView;
@property xacCanvas *canvas;
@property xacTouchVis *touchVis;
@property xacTouchLogger *touchLogger;
@end
