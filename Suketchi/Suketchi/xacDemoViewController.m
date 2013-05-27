//
//  xacViewController.m
//  Suketchi
//
//  Created by Xiang 'Anthony' Chen on 4/8/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacDemoViewController.h"

@interface xacDemoViewController ()

@end

@implementation xacDemoViewController

xacCanvas *tmpCanvas;
UIBezierPath *extPath;
UIButton* btnLogSwitch;
UIButton* btnLabel;
UIButton* btnClear;

NSArray* labels;
int ptrLabel = 0;

- (void)viewDidLoad
{
    [super viewDidLoad];
    
	// Do any additional setup after loading the view, typically from a nib.
    
    _mainView.multipleTouchEnabled = YES;
    float widthDevice = _mainView.frame.size.width;
    float heightDevice = _mainView.frame.size.height;
    
    _canvas = [[xacCanvas alloc] initWithFrame:CGRectMake(0, 0, heightDevice, widthDevice)];
    [_canvas setBackgroundColor:[UIColor whiteColor]];
    _canvas.toFade = TRUE;
    [_mainView addSubview:_canvas];
    _canvas.multipleTouchEnabled = YES;
    
    tmpCanvas =  [[xacCanvas alloc] initWithFrame:_canvas.frame];
    [tmpCanvas setBackgroundColor:[UIColor colorWithRed:0 green:0 blue:0 alpha:0]];
    tmpCanvas.isTemp = TRUE;
    tmpCanvas.toFade = TRUE;
    [_mainView addSubview:tmpCanvas];
    tmpCanvas.multipleTouchEnabled = YES;
    
    float visSizeRatio = 0.3f;
    _touchVis = [[xacTouchVis alloc] initWithFrame:CGRectMake(0, 0, _canvas.frame.size.width * visSizeRatio, _canvas.frame.size.height * visSizeRatio)];
    _touchVis.scaleRatio = visSizeRatio;
    _touchVis.backgroundColor = [UIColor grayColor];
    [_mainView addSubview:_touchVis];
    
    _touchLogger = [[xacTouchLogger alloc] init:_mainView];
    
    btnLogSwitch = [[UIButton alloc] initWithFrame:CGRectMake(10, _touchVis.frame.size.height, 100, 35)];
    [btnLogSwitch setBackgroundColor:[UIColor blackColor]];
    [btnLogSwitch setTitle:@"TAP TO LOG" forState:UIControlStateNormal];
    btnLogSwitch.titleLabel.font = [UIFont systemFontOfSize:15];
    [btnLogSwitch addTarget:self action:@selector(ctrlLogging) forControlEvents:UIControlEventTouchDown];
    [_mainView addSubview:btnLogSwitch];

    labels = [[NSArray alloc] initWithObjects:@"PEN", @"FINGER", @"PALM", nil];
    ptrLabel = 0;
    _touchLogger.label = [labels objectAtIndex:ptrLabel];
    
    btnLabel = [[UIButton alloc] initWithFrame:CGRectMake(120, _touchVis.frame.size.height, 75, 35)];
    [btnLabel setBackgroundColor:[UIColor blackColor]];
    [btnLabel setTitle:_touchLogger.label forState:UIControlStateNormal];
    btnLabel.titleLabel.font = [UIFont systemFontOfSize:15];
    [btnLabel addTarget:self action:@selector(toggleLabel) forControlEvents:UIControlEventTouchDown];
    [_mainView addSubview:btnLabel];
    
    btnClear = [[UIButton alloc] initWithFrame:CGRectMake(205, _touchVis.frame.size.height, 75, 35)];
    [btnClear setBackgroundColor:[UIColor blackColor]];
    [btnClear setTitle:@"CLEAR" forState:UIControlStateNormal];
    btnClear.titleLabel.font = [UIFont systemFontOfSize:15];
    [btnClear addTarget:self action:@selector(clearCanvas) forControlEvents:UIControlEventTouchDown];
    [_mainView addSubview:btnClear];
    
//    _touchClassifier = [[TouchClassifier alloc] init];
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (void)touchesBegan:(NSSet *)touches withEvent:(UIEvent *)event
{
    [tmpCanvas doTouchBegan:touches withEvent:event];
    [_canvas doTouchBegan:touches withEvent:event];
    [_touchVis doTouchBegan:touches withEvent:event];
    [_touchLogger doTouchBegan:touches withEvent:event];
}

- (void)touchesMoved:(NSSet *)touches withEvent:(UIEvent *)event
{
    [tmpCanvas doTouchMoved:touches withEvent:event];
    [_canvas doTouchMoved:touches withEvent:event];
    [_touchVis doTouchMoved:touches withEvent:event];
    [_touchLogger doTouchMoved:touches withEvent:event];    
}

- (void)touchesEnded:(NSSet *)touches withEvent:(UIEvent *)event
{
    [tmpCanvas doTouchEnded:touches withEvent:event];
    [_canvas doTouchEnded:touches withEvent:event];
    [_touchVis doTouchEnded:touches withEvent:event];
    [_touchLogger doTouchEnded:touches withEvent:event];
    
    // might need another method to swipe the residuals of touch
    [_canvas mediateTouch:_touchLogger.touchDataArchive];
    [_touchVis showTouchLabel:_touchLogger.touchDataArchive];
}

- (void) toggleLabel
{
    ptrLabel = (ptrLabel + 1) % labels.count;
    _touchLogger.label = [labels objectAtIndex:ptrLabel];
    [btnLabel setTitle:_touchLogger.label forState:UIControlStateNormal];
}

- (void) ctrlLogging
{
    if(!_touchLogger.isLogging) {
        [btnLogSwitch setTitle:@"LOGGING..." forState:UIControlStateNormal];
        [_touchLogger initLogging];
    }
    else {
        [_touchLogger finishLogging];
        [btnLogSwitch setTitle:@"TAP TO LOG" forState:UIControlStateNormal];
    }
}

- (void) clearCanvas {
    [_canvas clearCanvas];
}

@end
