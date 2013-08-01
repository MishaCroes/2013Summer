//
//  xacSecondViewController.m
//  WTE
//
//  Created by Xiang 'Anthony' Chen on 6/27/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacZoomBoardViewController.h"

@interface xacZoomBoardViewController ()

@end

@implementation xacZoomBoardViewController

UIImageView *canvas;
UIButton* btnNext;
UIButton* btnLast;

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
    
    float oriX = (_mainView.frame.size.height - WATCHWIDTH) * WATCHORIX;
    float oriY = (_mainView.frame.size.width - WATCHHEIGHT) * WATCHORIY;
    
    _watchView = [[xacZoomBoardWatchView alloc] initWithFrame:CGRectMake(oriX, oriY - WATCHHEIGHT / 6, WATCHWIDTH*2, WATCHHEIGHT*2)];
    [_watchView setBackgroundColor:[UIColor whiteColor]];
    [_mainView addSubview:_watchView];
    
    canvas = [[UIImageView alloc] init];
    canvas.image = [UIImage imageNamed:@"hand-watch.png"];
    canvas.frame = CGRectMake(0, 0, _mainView.frame.size.height, _mainView.frame.size.width);
    [_mainView addSubview:canvas];

    btnNext = [[UIButton alloc] initWithFrame:CGRectMake(oriX + WATCHWIDTH * 3/2, oriY + WATCHHEIGHT/2, WATCHWIDTH, WATCHHEIGHT/2)];
    [btnNext setTitle:@"Start" forState:UIControlStateNormal];
    [btnNext setBackgroundColor:[UIColor blackColor]];
    [btnNext addTarget:self action:@selector(nextWord) forControlEvents:UIControlEventTouchUpInside];
    [_mainView addSubview:btnNext];
    
//    btnLast = [[UIButton alloc] initWithFrame:CGRectMake(oriX + WATCHWIDTH + WATCHWIDTH / 3, oriY, WATCHWIDTH / 3, WATCHHEIGHT / 3)];
//    [btnLast setTitle:@"-" forState:UIControlStateNormal];
//    [btnLast setBackgroundColor:[UIColor blackColor]];
//    [btnLast addTarget:self action:@selector(lastWord) forControlEvents:UIControlEventTouchUpInside];
//    [_mainView addSubview:btnLast];
    
    _watchView.testText = [[xacTestText alloc] initWithFrame:CGRectMake(oriX - WATCHWIDTH, oriY - WATCHHEIGHT/3, WATCHWIDTH * 8, WATCHHEIGHT / 3) :ZOOMBOARD];
    [_mainView addSubview:_watchView.testText];
    [_watchView.testText loadWords];
    [_watchView.testText setBackgroundColor:[UIColor colorWithRed:1.0f green:1.0f blue:1.0f alpha:0.75f]];
//    _watchView.testText.technique = ZOOMBOARD;
//    _watchView.testText = _testText;
    
    _textField = [[UITextField alloc] initWithFrame:CGRectMake(oriX - WATCHWIDTH, oriY, WATCHWIDTH * 8, WATCHHEIGHT / 3)];
    _textField.textAlignment = NSTextAlignmentLeft;
    [_textField setUserInteractionEnabled:NO];
    [_textField setBackgroundColor:[UIColor colorWithRed:1.0f green:1.0f blue:1.0f alpha:0.75f]];
    [_mainView addSubview:_textField];
    _watchView.textField = _textField;
    
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (void) nextWord {
    [_watchView getWord:1];
}

- (void) lastWord {
    [_watchView getWord:-1];
}


@end
