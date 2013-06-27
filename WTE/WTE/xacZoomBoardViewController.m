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
xacZoomBoardWatchView *watchView;

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
    
    float oriX = (_mainView.frame.size.height - WATCHWIDTH) * WATCHORIX;
    float oriY = (_mainView.frame.size.width - WATCHHEIGHT) * WATCHORIY;
    
    watchView = [[xacZoomBoardWatchView alloc] initWithFrame:CGRectMake(oriX, oriY, WATCHWIDTH, WATCHHEIGHT)];
    [watchView setBackgroundColor:[UIColor whiteColor]];
    [_mainView addSubview:watchView];
    
    canvas = [[UIImageView alloc] init];
    canvas.image = [UIImage imageNamed:@"hand-watch.png"];
    canvas.frame = CGRectMake(0, 0, _mainView.frame.size.height, _mainView.frame.size.width);
    [_mainView addSubview:canvas];

    
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}
@end
