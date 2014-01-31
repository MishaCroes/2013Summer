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

NSString* attrNamesFeature = @"log_type,participant_id,technique,section_id,block_id,trial_id,phrase,time_to_start,time_to_finish,hard_errors,soft_errors,keystroke";

NSString* attrNamesGOMS = @"participant_id,technique,section_id,block_id,trial_id,character,visual_search_started_1,action_started_1,action_ended_1,visual_search_started_2,action_started_2,action_ended_2,vs_1,a_1,vs_2,a_2,sum";

- (id)initWithFrame:(CGRect)frame :(int)technique
{
    self = [super initWithFrame:frame];
    if (self) {
        // Initialization code
        _textField = [[UITextField alloc] initWithFrame:CGRectMake(0, 0, frame.size.width, frame.size.height)];
        _textField.textAlignment = NSTextAlignmentLeft;
        [_textField setBackgroundColor:[UIColor clearColor]];
        [_textField setUserInteractionEnabled:NO];
        [_textField setText:@"Press Start to continue ..."];
        [self addSubview:_textField];
        
        _curWord = @"";
        _idxWord = 0;
        
//        _block = 2;
        
        _featureTable = [[xacFeatureTable alloc] init];
        [_featureTable addLine:attrNamesFeature];
        
        _gomsTable = [[xacFeatureTable alloc] init];
        [_gomsTable addLine:attrNamesGOMS];
        
        _isBlockEnded = false;
        
        _section = SECTION;
        _technique = technique;
        if(_technique == CONDITION) {
            [NSTimer scheduledTimerWithTimeInterval:1 / timerRate
                                             target:self
                                           selector:@selector(showBreakTimer)
                                           userInfo:nil
                                            repeats:YES];
        }
        
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
    if(_block <= NUMBLOCKS) {
        [_textField setText:_curWord];
    }
    
    
    NSMutableAttributedString* attString = [[NSMutableAttributedString alloc]initWithString:_curWord];
    int numCorrectCharNew = 0;
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
            numCorrectCharNew++;
        }
    }
    
    if(input.length > _curWord.length || [input characterAtIndex:input.length-1] != [_curWord characterAtIndex:input.length-1]) {
        _errors++;
        _errorsPerChar++;
    }
    
//    if(input.length > 0)
//        NSLog(@"%@, %@", [input substringToIndex:input.length], [_curWord substringToIndex:input.length]);
    
    if(input.length > 0 && (input.length > _curWord.length || ![[input substringToIndex:input.length] isEqualToString:[_curWord substringToIndex:input.length]])) {
        _textField.alpha = 1;
    } else {
        _textField.alpha = 0;
    }
    
    if(numCorrectCharNew > _numCorrectChar) {
        _finishTimePerChar = [self getTime];
        if(_errorsPerChar == 0 && _softErrorsPerChar == 0) {
            [self addLogEntryPerChar:[input characterAtIndex:input.length-1]];
        }
        _startTimePerChar = [self getTime];
        _errorsPerChar = 0;
        _softErrorsPerChar = 0;
        
        _visualSearchStarted1 = [self getTime];
        
    } else {
        
    }
    _numCorrectChar = numCorrectCharNew;
    
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
//            [_textField setText:@"Press Start to continue..."];
        }
        ++_trial;
        _isWordLoaded = [self loadWord:1];
        _btnStart.alpha  = 1;
        _numCorrectChar = 0;
//        _curWord = @"";
        return true;
    }
    
    _textField.attributedText = attString;
    
    return false;
}

//- (void) readConfig {
//    NSString *path = [[NSBundle mainBundle] pathForResource:@"participant-section" ofType:@"txt"];
//    NSString *strFile = [NSString stringWithContentsOfFile:path encoding:NSUTF8StringEncoding error:nil];
////    int len = strFile.length;
//    NSLog(@"%@", strFile);
//    NSRange textRange = [strFile rangeOfString:@","];
//    for ( int idxComma = textRange.location, i = 0;textRange.location != NSNotFound; i++)
//    {
//        NSString *strFeat = [strFile substringToIndex:idxComma];
//        if(i == 0) {
//            _participantId = [strFeat intValue];
//        } else if(i == 1) {
//            _section = [strFeat intValue];
//        }
//        strFile = [strFile substringFromIndex:idxComma + 1];
//        textRange = [strFile rangeOfString:@","];
//    }
//}

- (void) showBreakTimer {
    if(SECTION == TRAINING) {
        if(_trial < NUMTRIALS) {
            if(_curWord.length <= 0) {
//                [_textField setText:@"Press Start to continue ..."];
                _isWordLoaded = [self loadWord:1];
            }
        }
        return;
    }
    
    if(_block >= NUMBLOCKS) {
        _textField.alpha = 1;
        [_textField setText:@"End of section"];
        return;
    } else {
        if((int)breakTime < BREAKTIME) {
            int timeRemained = BREAKTIME - breakTime;
            int minute = timeRemained / 60;
            int second = timeRemained - 60 * minute;
            NSString* strMin = [NSString stringWithFormat:@"0%d", minute];
            NSString* strSec = [NSString stringWithFormat:second < 10 ? @"0%d" : @"%d", second];
            _textField.alpha = 1;
            if(_block >= 2) {
                NSString* strTimeRemained = [NSString stringWithFormat:@"End of Block #%d, %@:%@ left before next block starts", _block, strMin, strSec];
                [_textField setText:strTimeRemained];
            } else {
                NSString* strTimeRemained = [NSString stringWithFormat:@"End of practice block, %@:%@ left before next block starts" , strMin, strSec];
                [_textField setText:strTimeRemained];
            }
            
            breakTime += 1.0f / timerRate;
            
            if((int)breakTime == BREAKTIME) {
//                [_textField setText:@"Press Start to continue ..."];
                _isWordLoaded = [self loadWord:1];

            }
        } 
//        else 
    }
}

- (BOOL) loadWord :(int)sign {
//    if((int)breakTime < BREAKTIME) return false;
    // is this the end of a block
    
    if( (_block == 0 && _trial== NUMTRAININGTRIALS) || (_block > 0 && _trial == NUMTRIALS)) {
        _trial = 0;
        [_featureTable writeToFile :CONDITION :PARTICIPANT :SECTION :@"PERF"];
        [_gomsTable writeToFile :CONDITION :PARTICIPANT :SECTION :@"GOMS"];
        if(_block == NUMBLOCKS) {
            [_textField setText:@"End of section."];
        }
//        else {
            ++_block;
            // show take a break text
//            [_textField setText:@"End of block."];
            _isBlockEnded = true;
            breakTime = 0;
//        }
        return false;
    }
    
    if((int)breakTime < BREAKTIME)
        return false;
    
    // show next word
    _curWord = (NSString*)[_words objectAtIndex:_idxWord];
    _idxWord = (_idxWord + numWords + sign) % numWords;
    [_textField setText: [_curWord substringWithRange:(NSRange){0, MIN(_curWord.length, TEXTLENGTH * 3)}]];
    [self setColorOfSubstring:_textField :(NSRange){0, MIN(_curWord.length, TEXTLENGTH * 3)} :[UIColor blackColor]];
    
    struct timeval time;
    gettimeofday(&time, NULL);
    _switchToTime = (time.tv_sec * 1000) + (time.tv_usec / 1000);
    _errors = 0;
    _softErrors = 0;
    _keyStroke = 0;
    _textField.alpha = 1;
    
    return true;
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
    _startTimePerChar = _startTime;
}

- (long) getTime {
    struct timeval time;
    gettimeofday(&time, NULL);
    return (time.tv_sec * 1000) + (time.tv_usec / 1000);
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
//    @"participant_id,technique,section_id,block_id,trial_id,phrase_or_char,time_to_start,time_to_finish,errors";
    
    [_featureTable addLine: [NSString stringWithFormat:@"%d,%d,%d,%d,%d,%d,%@,%.4f,%.4f,%d,%d,%d", SUMMARIZATION, PARTICIPANT,_technique,SECTION,_block,_trial,_curWord,(_startTime - _switchToTime)/1000.0f,(_finishTime-_startTime)/1000.0f,_errors, _softErrors,_keyStroke]];
}

- (void) addLogEntryPerChar :(char)character
{
//  @"participant_id,technique,section_id,block_id,trial_id,character,visual_search_1,swipe_time_1,visual_search_2,swipe_time_2";
    
    [_gomsTable addLine: [NSString stringWithFormat:@"%d,%d,%d,%d,%d,%c,%ld,%ld,%ld,%ld,%ld,%ld,%ld,%ld,%ld,%ld,%ld", PARTICIPANT,_technique,SECTION,_block,_trial,character,_visualSearchStarted1, _actionStarted1, _actionEnded1, _visualSearchStarted2, _actionStarted2, _actionEnded2, _actionStarted1-_visualSearchStarted1, _actionEnded1-_actionStarted1, _actionStarted2-_visualSearchStarted2, _actionEnded2-_actionStarted2, _actionEnded2-_visualSearchStarted1]];
    
    if(_actionStarted1 - _visualSearchStarted1 < 0) {
        int brk = 2;
        brk ++;
    }
}

- (void) reportSoftError {
    _softErrors++;
    _softErrorsPerChar++;
}

- (void) reportKLM {
    _keyStroke++;
    NSLog(@"KLM: %d", _keyStroke);
}

//- (long) getCurrentTimeInMS
//{
//    NSTimeInterval time = ([[NSDate date] timeIntervalSince1970]);
//    long digits = (long)time; // this is the first 10 digits
//    int decimalDigits = (int)(fmod(time, 1) * 1000); // this will get the 3 missing digits
//    long timeStamp = (digits * 1000) + decimalDigits;
//    return timeStamp;
//}

@end
