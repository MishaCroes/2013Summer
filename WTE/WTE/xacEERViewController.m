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

UIImageView *canvas;
UIButton* btnNext;
UIButton* btnLast;

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
  
    
    float oriX = (_mainView.frame.size.height - WATCHWIDTH) * WATCHORIX;
    float oriY = (_mainView.frame.size.width - WATCHHEIGHT) * WATCHORIY;
    
    _watchView = [[xacEERWatchView alloc] initWithFrame: CGRectMake(oriX, oriY, WATCHWIDTH, WATCHHEIGHT)];
    [_mainView addSubview:_watchView];
    
    canvas = [[UIImageView alloc] init];
    canvas.image = [UIImage imageNamed:@"hand-watch.png"];
    canvas.frame = CGRectMake(0, 0, _mainView.frame.size.height, _mainView.frame.size.width);
    [_mainView addSubview:canvas];
    
    btnNext = [[UIButton alloc] initWithFrame:CGRectMake(oriX + WATCHWIDTH, oriY + WATCHHEIGHT / 8, WATCHWIDTH * 2 / 3, WATCHHEIGHT / 2)];
    [btnNext setTitle:@"Start" forState:UIControlStateNormal];
    [btnNext setBackgroundColor:[UIColor blackColor]];
    [btnNext addTarget:self action:@selector(nextWord) forControlEvents:UIControlEventTouchUpInside];
    [_mainView addSubview:btnNext];
    
//    btnLast = [[UIButton alloc] initWithFrame:CGRectMake(oriX + WATCHWIDTH + WATCHWIDTH / 3, oriY, WATCHWIDTH / 3, WATCHHEIGHT / 3)];
//    [btnLast setTitle:@"-" forState:UIControlStateNormal];
//    [btnLast setBackgroundColor:[UIColor blackColor]];
//    [btnLast addTarget:self action:@selector(lastWord) forControlEvents:UIControlEventTouchUpInside];
//    [_mainView addSubview:btnLast];

    _watchView.textEntry.testText = [[xacTestText alloc] initWithFrame:CGRectMake(oriX - WATCHWIDTH * 2 / 3, oriY - WATCHHEIGHT / 8 - WATCHHEIGHT / 6, WATCHWIDTH * 3, WATCHHEIGHT / 6)];
    [_mainView addSubview:_watchView.textEntry.testText];
    [_watchView.textEntry.testText loadWords];
    [_watchView.textEntry.testText setBackgroundColor:[UIColor colorWithRed:1.0f green:1.0f blue:1.0f alpha:0.5f]];
    [_watchView.textEntry readConfig];
//    _watchView.textEntry.testText = _testText;
    _watchView.textEntry.testText.technique = SWIPEBOARD;
    
    _watchView.textEntry.textField = [[UITextField alloc] initWithFrame:CGRectMake(oriX - WATCHWIDTH * 2 / 3, oriY - WATCHHEIGHT / 8, WATCHWIDTH * 3, WATCHHEIGHT / 6)];
    _watchView.textEntry.textField.textAlignment = NSTextAlignmentLeft;
    [_watchView.textEntry.textField setUserInteractionEnabled:NO];
    [_watchView.textEntry.textField setBackgroundColor:[UIColor colorWithRed:1.0f green:1.0f blue:1.0f alpha:0.5f]];
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
    [_watchView getWord:1];
}

- (void) lastWord {
    [_watchView getWord:-1];
}


@end
