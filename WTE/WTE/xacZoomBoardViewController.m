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


- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
    
    if(CONDITION == SWIPEBOARD){
        return;
    }
    
    float oriX = (_mainView.frame.size.height - WATCHWIDTH) * WATCHORIX;
    float oriY = (_mainView.frame.size.width - WATCHHEIGHT) * WATCHORIY;
    
    _watchView = [[xacZoomBoardWatchView alloc] initWithFrame:CGRectMake(oriX, oriY - WATCHHEIGHT / 6, WATCHWIDTH*2, WATCHHEIGHT*2)];
    [_watchView setBackgroundColor:[UIColor whiteColor]];
    [_mainView addSubview:_watchView];
    
    _canvas = [[UIImageView alloc] init];
    _canvas.image = [UIImage imageNamed:@"hand-watch-small.png"];
//    [_canvas setAlpha:0.5f];
    _canvas.frame = CGRectMake(0, 0, _mainView.frame.size.height, _mainView.frame.size.width);
    [_mainView addSubview:_canvas];

    _infoView = [[UITextView alloc] initWithFrame:CGRectMake(0, 0, _mainView.frame.size.width / 4, 50)];
    [_infoView setText:@""];
    [_mainView addSubview:_infoView];
    _watchView.infoView = _infoView;
    
    _btnNext = [[UIButton alloc] initWithFrame:CGRectMake(oriX + WATCHHEIGHT*1/2, oriY + WATCHHEIGHT*2/3, WATCHWIDTH * 1.1, WATCHHEIGHT/2)];
    [_btnNext setTitle:@"Start" forState:UIControlStateNormal];
    [_btnNext setBackgroundColor:[UIColor blackColor]];
    [_btnNext addTarget:self action:@selector(nextWord) forControlEvents:UIControlEventTouchUpInside];
    [_mainView addSubview:_btnNext];
    
//    btnLast = [[UIButton alloc] initWithFrame:CGRectMake(oriX + WATCHWIDTH + WATCHWIDTH / 3, oriY, WATCHWIDTH / 3, WATCHHEIGHT / 3)];
//    [btnLast setTitle:@"-" forState:UIControlStateNormal];
//    [btnLast setBackgroundColor:[UIColor blackColor]];
//    [btnLast addTarget:self action:@selector(lastWord) forControlEvents:UIControlEventTouchUpInside];
//    [_mainView addSubview:btnLast];
    
    int widthTestText = WATCHWIDTH * 7;
    int heightTestText = WATCHHEIGHT / 3;
    int leftTestText = oriX - WATCHWIDTH;
    int topTestText = oriY - WATCHHEIGHT/3;
    
    _watchView.testText = [[xacTestText alloc] initWithFrame:CGRectMake(leftTestText, topTestText, widthTestText, heightTestText) :ZOOMBOARD];
    _watchView.testText.btnStart = _btnNext;
    [_mainView addSubview:_watchView.testText];
    [_watchView.testText loadWords];
    [_watchView.testText setBackgroundColor:[UIColor colorWithRed:1.0f green:1.0f blue:1.0f alpha:0.75f]];
    _watchView.testText.isWordLoaded = [_watchView.testText loadWord:1];
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
    if([_watchView getWord:1]) {
//        [_watchView update_infoView];
        if(_watchView.testText.block >= 1) {
            [_watchView updateInfoView];
        }
        _btnNext.alpha = 0;
        _watchView.testText.textField.alpha = 0;
    }
}

- (void) lastWord {
    [_watchView getWord:-1];
}


@end
