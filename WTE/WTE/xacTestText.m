//
//  xacTestText.m
//  WTE
//
//  Created by Xiang 'Anthony' Chen on 7/4/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#import "xacTestText.h"

@implementation xacTestText


int numWords = 100;
//int idxSubString = -1;
//NSString* lastInput = 0;

- (id)initWithFrame:(CGRect)frame
{
    self = [super initWithFrame:frame];
    if (self) {
        // Initialization code
        _textField = [[UITextField alloc] initWithFrame:CGRectMake(0, 0, frame.size.width, frame.size.height)];
//        [_textField setFont:[UIFont fontWithName:@"ArialMT" size:FONTSIZE]];
        _textField.textAlignment = NSTextAlignmentLeft;
        [_textField setBackgroundColor:[UIColor clearColor]];
        [_textField setUserInteractionEnabled:NO];
        [_textField setText:@"Press Start!"];
//            [_textField setBackgroundColor:[UIColor greenColor]];
        [self addSubview:_textField];
        
        _curWord = @"";
        
    }
    return self;
}

/*
// Only override drawRect: if you perform custom drawing.
// An empty implementation adversely affects performance during animation.
- (void)drawRect:(CGRect)rect
{
    // Drawing code
}
*/

- (void) loadWords {
    _words = [[NSMutableArray alloc] init];
    
//    for (int i=0; i<numWords; i++) {
//        [_words addObject: @"FUNCTIONS R VALUES"];
//    }
    
    NSString *path = [[NSBundle mainBundle] pathForResource:@"phrases2" ofType:@"txt"];
    NSString *strFile = [NSString stringWithContentsOfFile:path encoding:NSUTF8StringEncoding error:nil];
    
    NSRange textRange = [strFile rangeOfString:@"\n"];
    for ( int idxNewLine = textRange.location + 1;;)
    {
        strFile = [strFile substringFromIndex:idxNewLine];
        textRange = [strFile rangeOfString:@"\n"];
        if(textRange.location == NSNotFound) {
            break;
        }
        [_words addObject:[strFile substringToIndex:textRange.location - 1]];
        idxNewLine = textRange.location + 1;
    }
    
    numWords = _words.count;
}

- (void) readKeyMap {
    
}

- (BOOL) update :(NSString*) input :(int)idxSubStr {
    
    // compare input string with current test string
//    NSString* curStr = (NSString*)[_words objectAtIndex:idxWord];
    
    
    if(input == nil) {
        [self loadWord:1];
        return false;
    }
    
    if(_curWord.length <= 0) {
        return false;
    }
    
//    if([input isEqualToString:lastInput]) {
//        return false;
//    }
//    
//    NSLog(@"%@", input);
//        
//    if(input.length >= TEXTLENGTH / 2) {
//        idxSubString++;
//    }
//    lastInput = [input copy];
    
    NSString* subCurWord = [_curWord substringWithRange:(NSRange){idxSubStr, MIN(_curWord.length - idxSubStr, TEXTLENGTH)}];
    [_textField setText:subCurWord];

    if([_curWord isEqualToString:input]) {

        // load next string
//        [self loadNextWord];
        
        struct timeval time;
        gettimeofday(&time, NULL);
        long curTime = (time.tv_sec * 1000) + (time.tv_usec / 1000);
        
        _timeTyping = curTime - _timeStartTyping;
        [_textField setText:[NSString stringWithFormat:@"%.2f ms", _timeTyping / 1000.0f]];
        
        _curWord = @"";
        
        return true;
    }
    
    NSMutableAttributedString* attString = [[NSMutableAttributedString alloc]initWithString:subCurWord];
    for (int i=idxSubStr; i<_curWord.length; i++) {
        if(i >= input.length) {
            break;
        }
        unichar charTest = [_curWord characterAtIndex:i];
        unichar charInput = [input characterAtIndex:i];
        
        if(charTest != charInput) {
//            [self setColorOfSubstring:_textField :(NSRange){i, 1} :[UIColor redColor]];
            [attString addAttribute:(NSString*)NSForegroundColorAttributeName
                              value:[UIColor redColor]
                              range:(NSRange){i - idxSubStr, 1}];
        } else {
//            [self setColorOfSubstring:_textField :(NSRange){i, 1} :[UIColor greenColor]];
            [attString addAttribute:(NSString*)NSForegroundColorAttributeName
                              value:[UIColor greenColor]
                              range:(NSRange){i- idxSubStr, 1}];
        }
    }
    
    _textField.attributedText = attString;
    
    return false;
}

- (void) loadWord :(int)sign {
//    idxWord = arc4random() % numWords;
    _idxWord = (_idxWord + numWords + sign) % numWords;
    _curWord = (NSString*)[_words objectAtIndex:_idxWord];
//    strShared = curWord;
    [_textField setText: [_curWord substringWithRange:(NSRange){0, TEXTLENGTH}]];
    [self setColorOfSubstring:_textField :(NSRange){0, TEXTLENGTH} :[UIColor blackColor]];
}

- (void) loadSharedString {
    _curWord = (NSString*)[_words objectAtIndex:_idxWord];
    //    strShared = curWord;
    [_textField setText: [_curWord substringWithRange:(NSRange){0, TEXTLENGTH}]];
    [self setColorOfSubstring:_textField :(NSRange){0, TEXTLENGTH} :[UIColor blackColor]];
}

- (void) resetTimer {
    struct timeval time;
    gettimeofday(&time, NULL);
    _timeStartTyping = (time.tv_sec * 1000) + (time.tv_usec / 1000);
}

- (void) setColorOfSubstring :(UITextField*) tv :(NSRange) range :(UIColor*) color {
    
    NSMutableAttributedString* attString = [[NSMutableAttributedString alloc]initWithString:tv.text];
    [attString addAttribute:(NSString*)NSForegroundColorAttributeName
                      value:color
                      range:range];
    tv.attributedText = attString;
}

@end
