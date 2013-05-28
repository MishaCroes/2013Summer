//
//  xacDrawingViewController.h
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 5/27/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "xacCanvas.h"
#import "xacTouchVis.h"
#import "xacTouchLogger.h"

@interface xacDrawingViewController : UIViewController

@property (strong, nonatomic) IBOutlet UIView *mainView;
@property xacCanvas *canvas;
@property xacTouchLogger *touchLogger;

@end
