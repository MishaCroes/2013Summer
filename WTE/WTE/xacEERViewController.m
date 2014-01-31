//
//  xacFirstViewController.m
//  WTE
//
//  Created by Xiang 'Anthony' Chen on 6/27/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacEERViewController.h"

@interface xacEERViewController ()

@end

@implementation xacEERViewController


- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
    
    // showing information
    
    if(CONDITION != SWIPEBOARD) {
        return;
    }
  
    float oriX = (_mainView.frame.size.height - WATCHWIDTH) * WATCHORIX;
    float oriY = (_mainView.frame.size.width - WATCHHEIGHT) * WATCHORIY;
    
    _watchView = [[xacEERWatchView alloc] initWithFrame:CGRectMake(oriX, oriY - WATCHHEIGHT / 6, WATCHWIDTH*2, WATCHHEIGHT*2)];
//    _watchView = [[xacEERWatchView alloc] initWithFrame: CGRectMake(oriX - WATCHWIDTH, oriY - WATCHHEIGHT / 6, WATCHWIDTH*2, WATCHHEIGHT*2)];
    
    [_mainView addSubview:_watchView];
    
    _canvas = [[UIImageView alloc] init];
    _canvas.image = [UIImage imageNamed:@"hand-watch-small.png"];
    _canvas.frame = CGRectMake(0, 0, _mainView.frame.size.height, _mainView.frame.size.width);
    [_mainView addSubview:_canvas];
//    [_canvas setAlpha:0.5f];
    
    // #2014Spring
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
    
    _watchView.textEntry.testText = [[xacTestText alloc] initWithFrame:CGRectMake(leftTestText, topTestText, widthTestText, heightTestText) :SWIPEBOARD];
    _watchView.textEntry.testText.btnStart = _btnNext;
    [_mainView addSubview:_watchView.textEntry.testText];
    [_watchView.textEntry.testText loadWords];
    [_watchView.textEntry.testText setBackgroundColor:[UIColor colorWithRed:1.0f green:1.0f blue:1.0f alpha:0.75f]];
//    [_watchView.textEntry readConfig];
    _watchView.textEntry.testText.isWordLoaded = [_watchView.textEntry.testText loadWord:1];
//    [_watchView.textEntry.testText setAlpha:0];

//    _watchView.textEntry.testText = _testText;
//    _watchView.textEntry.testText.technique = SWIPEBOARD;
    
    _watchView.textEntry.textField = [[UITextField alloc] initWithFrame:CGRectMake(leftTestText, oriY, widthTestText, heightTestText)];
    _watchView.textEntry.textField.textAlignment = NSTextAlignmentLeft;
    [_watchView.textEntry.textField setUserInteractionEnabled:NO];
    [_watchView.textEntry.textField setBackgroundColor:[UIColor colorWithRed:1.0f green:1.0f blue:1.0f alpha:0.75f]];
    [_mainView addSubview:_watchView.textEntry.textField];
//    _watchView.textEntry.textField = _textField;

    [_watchView loadSharedString];
    

}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (void) nextWord {
    if([_watchView getWord:1]){
        if(_watchView.textEntry.testText.block >= 1) {
            [_watchView updateInfoView];
        }
        _btnNext.alpha = 0;
        _watchView.textEntry.testText.textField.alpha = 0;
    }
}

- (void) lastWord {
    [_watchView getWord:-1];
}


@end
