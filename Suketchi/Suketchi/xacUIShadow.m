//
//  xacUIShadow.m
//  antReader
//
//  Created by Xiang 'Anthony' Chen on 3/8/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacUIShadow.h"

@implementation xacUIShadow

- (id) init :(UIView*) parentView
{
    self = [super init];
    if(self)
    {
        _shadow = [[UIView alloc] init];
        [_shadow setBackgroundColor: [UIColor redColor]];
        [parentView addSubview: _shadow];
        
        _label = [[UILabel alloc] init];
        [_label setFont: [UIFont systemFontOfSize:30]];
        [_label setBackgroundColor:[UIColor clearColor]];
        [_shadow addSubview:_label];
    }
    return self;
}


- (void) update: (float)x :(float)y :(float)r
{
//    _shadow.alpha = (0.75 * (1 - heightRatio) + 0.05) * flagVisibility;
    _shadow.frame = CGRectMake(0, 0, 2 * r, 2 * r);
    _shadow.layer.cornerRadius = r;
    [_shadow setCenter:CGPointMake(x, y)];
    
    _label.frame = CGRectMake(r * 0.5, r * 0.5, r, r);
//    [_label setText:@"ruogu"];
}

- (void) updateText: (NSString*) str {
    [_label setText:str];
}

- (void) selfDestruct
{
    [_label removeFromSuperview];
    [_shadow removeFromSuperview];
}

- (void) setColor :(UIColor*) color
{
    [_shadow setBackgroundColor:color];
}

@end
