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

@interface xacZoomBoardViewController : UIViewController
@property (strong, nonatomic) IBOutlet UIView *mainView;
@property xacZoomBoardWatchView *watchView;
//@property xacTestText* testText;
@property UITextField* textField;

@property UIImageView *canvas;
@property UIButton* btnNext;
@property UIButton* btnLast;
@property UITextView *infoView;

@end
