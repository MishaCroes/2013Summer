//
//  xacViewController.m
//  EER 2
//
//  Created by Xiang 'Anthony' Chen on 6/12/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacViewController.h"

@interface xacViewController ()

@end

@implementation xacViewController

UIImageView *canvas;

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
    
    canvas = [[UIImageView alloc] init];
    canvas.image = [UIImage imageNamed:@"hand-watch.png"];
    canvas.frame = CGRectMake(0, 0, _mainView.frame.size.height, _mainView.frame.size.width);
    [_mainView addSubview:canvas];
    
    float oriX = (_mainView.frame.size.height - WATCHWIDTH) * 0.350f;
    float oriY = (_mainView.frame.size.width - WATCHHEIGHT) * 0.495f;
                                                                
    _watchView = [[xacWatchView alloc] initWithFrame: CGRectMake(oriX, oriY, WATCHWIDTH, WATCHHEIGHT)];
    [_mainView addSubview:_watchView];

}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

@end
