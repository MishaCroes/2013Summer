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
float breakTime = BREAKTIME; // sec
float timerRate = 10.0f;

NSString* attrNames = @"participant_id,technique,section_id,block_id,trial_id,phrase,time_to_start,time_to_finish,errors";

- (id)initWithFrame:(CGRect)frame
{
    self = [super initWithFrame:frame];
    if (self) {
        // Initialization code
        _textField = [[UITextField alloc] initWithFrame:CGRectMake(0, 0, frame.size.width, frame.size.height)];
        _textField.textAlignment = NSTextAlignmentLeft;
        [_textField setBackgroundColor:[UIColor clearColor]];
        [_textField setUserInteractionEnabled:NO];
        [_textField setText:@"Press Start to continue..."];
        [self addSubview:_textField];
        
        _curWord = @"";
        _idxWord = 0;
        
        _featureTable = [[xacFeatureTable alloc] init];
        [_featureTable addLine:attrNames];
        
        _isBlockEnded = false;
        
        [NSTimer scheduledTimerWithTimeInterval:1 / timerRate
                                         target:self
                                       selector:@selector(showBreakTimer)
                                       userInfo:nil
                                        repeats:YES];
        
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
    
    NSString* fileName = [NSString stringWithFormat:@"phrase-set-%d", SECTION];
    NSString *path = [[NSBundle mainBundle] pathForResource:fileName ofType:@"txt"];
    NSString *strFile = [NSString stringWithContentsOfFile:path encoding:NSUTF8StringEncoding error:nil];
    
    NSRange textRange = [strFile rangeOfString:@"\n"];
    for ( int idxNewLine = 0;;)
    {
        strFile = [strFile substringFromIndex:idxNewLine];
        textRange = [strFile rangeOfString:@"\n"];
        if(textRange.location == NSNotFound) {
            break;
        }
        NSString* strPhrase = [strFile substringToIndex:textRange.location];
        [_words addObject:[strPhrase
                           stringByReplacingOccurrencesOfString:@"\r" withString:@""]];
        idxNewLine = textRange.location + 1;
    }
    
    numWords = _words.count;
}

- (BOOL) update :(NSString*) input :(int)idxSubStr {
    
    if(breakTime < BREAKTIME) {
        return false;
    }
    
    if(input == nil) {
        [self loadWord:1];
        return false;
    }
    
    if(_curWord.length <= 0) {
        return false;
    }
    
//    NSString* subCurWord = [_curWord substringWithRange:(NSRange){idxSubStr, MIN(_curWord.length - idxSubStr, MIN(_curWord.length, TEXTLENGTH * 3))}];
    [_textField setText:_curWord];
    
    if([_curWord isEqualToString:input]) {
        struct timeval time;
        gettimeofday(&time, NULL);
        _finishTime = (time.tv_sec * 1000) + (time.tv_usec / 1000);
        
        if(TOSHOWTIME) {
            _timeTyping = _finishTime - _timeStartTyping;
            [_textField setText:[NSString stringWithFormat:@"%.2f s", _timeTyping / 1000.0f]];
        }
        else {
            [self addLogEntry];
            [_textField setText:@"Press Start to continue..."];
        }
        ++_trial;
        _curWord = @"";
        return true;
    }
    
    
    NSMutableAttributedString* attString = [[NSMutableAttributedString alloc]initWithString:_curWord];
    
    for (int i=0; i<_curWord.length; i++) {
        if(i >= input.length) {
            break;
        }
        unichar charTest = [_curWord characterAtIndex:i];
        unichar charInput = [input characterAtIndex:i];
        
        if(charTest != charInput) {
//            [self setColorOfSubstring:_textField :(NSRange){i, 1} :[UIColor redColor]];
            [attString addAttribute:(NSString*)NSForegroundColorAttributeName
                              value:[UIColor redColor]
                              range:(NSRange){i, 1}];
        } else {
//            [self setColorOfSubstring:_textField :(NSRange){i, 1} :[UIColor greenColor]];
            [attString addAttribute:(NSString*)NSForegroundColorAttributeName
                              value:[UIColor greenColor]
                              range:(NSRange){i, 1}];
        }
    }
    
    if([input characterAtIndex:input.length-1] != [_curWord characterAtIndex:input.length-1]) {
        _errors++;
    }
    
    _textField.attributedText = attString;
    
    return false;
}

- (void) readConfig {
    NSString *path = [[NSBundle mainBundle] pathForResource:@"participant-section" ofType:@"txt"];
    NSString *strFile = [NSString stringWithContentsOfFile:path encoding:NSUTF8StringEncoding error:nil];
    int len = strFile.length;
    NSLog(@"%@", strFile);
    NSRange textRange = [strFile rangeOfString:@","];
    for ( int idxComma = textRange.location, i = 0;textRange.location != NSNotFound; i++)
    {
        NSString *strFeat = [strFile substringToIndex:idxComma];
        if(i == 0) {
            _participantId = [strFeat intValue];
        } else if(i == 1) {
            _section = [strFeat intValue];
        }
        strFile = [strFile substringFromIndex:idxComma + 1];
        textRange = [strFile rangeOfString:@","];
    }
}

- (void) showBreakTimer {
    if(SECTION == TRAINING) {
        if(_trial < NUMTRIALS) {
            if(_curWord.length <= 0) {
                [_textField setText:@"Press Start to continue ..."];
            }
        }
        return;
    }
    
    if(_block >= NUMBLOCKS) {
        return;
    } else {
        if((int)breakTime < BREAKTIME) {
            int timeRemained = BREAKTIME - breakTime;
            int minute = timeRemained / 60;
            int second = timeRemained - 60 * minute;
            NSString* strMin = [NSString stringWithFormat:@"0%d", minute];
            NSString* strSec = [NSString stringWithFormat:second < 10 ? @"0%d" : @"%d", second];
            NSString* strTimeRemained = [NSString stringWithFormat:@"End of Block #%d, %@:%@ left before next block can be started", _block, strMin, strSec];
            [_textField setText:strTimeRemained];
            
            breakTime += 1.0f / timerRate;
        }
        else if((int)breakTime == BREAKTIME) {
                _trial = 0;
//            if(_trial < NUMTRIALS) {
//                if(_curWord.length <= 0) {
                    [_textField setText:@"Press Start to continue ..."];
//                }
            breakTime += 1.0f / timerRate;
//            }
        }
    }
}

- (BOOL) loadWord :(int)sign {
    // is this the end of a block
    
    if(_trial == NUMTRIALS) {
        if(_block == NUMBLOCKS || (SECTION == TRAINING)) {
            [_textField setText:@"End of section."];
            [_featureTable writeToFile :PARTICIPANT :SECTION];
        } else {
            [_featureTable writeToFile :PARTICIPANT :SECTION];
            ++_block;
            // show take a break text
//            [_textField setText:@"End of block."];
            _isBlockEnded = true;
            breakTime = 0;
        }
        return false;
    } else {
        // show next word
        _curWord = (NSString*)[_words objectAtIndex:_idxWord];
        _idxWord = (_idxWord + numWords + sign) % numWords;
        [_textField setText: [_curWord substringWithRange:(NSRange){0, MIN(_curWord.length, TEXTLENGTH * 3)}]];
        [self setColorOfSubstring:_textField :(NSRange){0, MIN(_curWord.length, TEXTLENGTH * 3)} :[UIColor blackColor]];
        
        struct timeval time;
        gettimeofday(&time, NULL);
        _switchToTime = (time.tv_sec * 1000) + (time.tv_usec / 1000);
        _errors = 0;
        
        return true;
    }
    
}

- (void) loadSharedString {
    _curWord = (NSString*)[_words objectAtIndex:_idxWord];
    //    strShared = curWord;
    [_textField setText: [_curWord substringWithRange:(NSRange){0, MIN(_curWord.length, TEXTLENGTH * 3)}]];
    [self setColorOfSubstring:_textField :(NSRange){0, MIN(_curWord.length, TEXTLENGTH * 3)} :[UIColor blackColor]];
}

- (void) resetTimer {
    struct timeval time;
    gettimeofday(&time, NULL);
    _startTime = (time.tv_sec * 1000) + (time.tv_usec / 1000);
}

- (void) setColorOfSubstring :(UITextField*) tv :(NSRange) range :(UIColor*) color {
    
    NSMutableAttributedString* attString = [[NSMutableAttributedString alloc]initWithString:tv.text];
    [attString addAttribute:(NSString*)NSForegroundColorAttributeName
                      value:color
                      range:range];
    tv.attributedText = attString;
}

- (void) addLogEntry
{
//    NSString* attrNames = @"participant_id,technique,section_id,block_id,trial_id,switch_to_time,start_time,end_time,errors";
    
    [_featureTable addLine: [NSString stringWithFormat:@"%d,%d,%d,%d,%d,%@,%.4f,%.4f,%d", PARTICIPANT,_technique,SECTION,_block,_trial,_curWord,(_startTime - _switchToTime)/1000.0f,(_finishTime-_startTime)/1000.0f,_errors]];
}

@end
