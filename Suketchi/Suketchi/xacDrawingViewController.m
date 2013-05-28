//
//  xacDrawingViewController.m
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 5/27/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacDrawingViewController.h"

@interface xacDrawingViewController ()

@end

@implementation xacDrawingViewController

xacCanvas *tmpCanvas;
UIButton* btnClear;

- (id)initWithNibName:(NSString *)nibNameOrNil bundle:(NSBundle *)nibBundleOrNil
{
    self = [super initWithNibName:nibNameOrNil bundle:nibBundleOrNil];
    if (self) {
        // Custom initialization
    }
    return self;
}

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view.
    
    // main view
    _mainView.multipleTouchEnabled = YES;
    float widthDevice = _mainView.frame.size.width;
    float heightDevice = _mainView.frame.size.height;
    
    // the real canvas
    _canvas = [[xacCanvas alloc] initWithFrame:CGRectMake(0, 0, heightDevice, widthDevice)];
    [_canvas setBackgroundColor:[UIColor whiteColor]];
    [_mainView addSubview:_canvas];
    _canvas.multipleTouchEnabled = YES;
    
    // the buffering canvas
    tmpCanvas =  [[xacCanvas alloc] initWithFrame:_canvas.frame];
    [tmpCanvas setBackgroundColor:[UIColor colorWithRed:0 green:0 blue:0 alpha:0]];
    tmpCanvas.isTemp = TRUE;
    [_mainView addSubview:tmpCanvas];
    tmpCanvas.multipleTouchEnabled = YES;

    // touch logging
    _touchLogger = [[xacTouchLogger alloc] init:_mainView];
    
    btnClear = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, 75, 35)];
    [btnClear setBackgroundColor:[UIColor blackColor]];
    [btnClear setTitle:@"CLEAR" forState:UIControlStateNormal];
    btnClear.titleLabel.font = [UIFont systemFontOfSize:15];
    [btnClear addTarget:_canvas action:@selector(clearCanvas) forControlEvents:UIControlEventTouchDown];
    [_mainView addSubview:btnClear];
    
    // clean up the ass routine
    [NSTimer scheduledTimerWithTimeInterval:0.1
                                     target:self
                                   selector:@selector(wipeResidua)
                                   userInfo:nil
                                    repeats:YES];
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (void)touchesBegan:(NSSet *)touches withEvent:(UIEvent *)event {
    [tmpCanvas doTouchBegan:touches withEvent:event];
    [_canvas doTouchBegan:touches withEvent:event];
    [_touchLogger doTouchBegan:touches withEvent:event];    
}

- (void)touchesMoved:(NSSet *)touches withEvent:(UIEvent *)event {
    [tmpCanvas doTouchMoved:touches withEvent:event];
    [_canvas doTouchMoved:touches withEvent:event];
    [_touchLogger doTouchMoved:touches withEvent:event];    
}

- (void)touchesEnded:(NSSet *)touches withEvent:(UIEvent *)event {
    [tmpCanvas doTouchEnded:touches withEvent:event];
    [_canvas doTouchEnded:touches withEvent:event];
    [_touchLogger doTouchEnded:touches withEvent:event];
    
    [_canvas mediateTouch:_touchLogger.touchDataArchive :PALMREJECTION];
    [_touchLogger depleteArchive];
}

- (void) wipeResidua {
    [_touchLogger wipeResidua];
}

@end
