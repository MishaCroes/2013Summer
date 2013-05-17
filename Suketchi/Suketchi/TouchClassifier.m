#import "TouchClassifier.h"

@implementation TouchClassifier

- (int) classify:(NSArray *)i {
    int p = -1;
    p = [TouchClassifier N60f38b420:i];
    return p;
}

+ (int) N60f38b420:(NSArray *)i {
    int p = -1;
    if (i[0] == nil) {
        p = 0;
    }
    else if ([((NSNumber*)i[0]) doubleValue] <= 5.889999) {
        p = [TouchClassifier N153bcbc81:i];
    }
    else if ([((NSNumber*)i[0]) doubleValue] > 5.889999) {
        p = [TouchClassifier N65712a803:i];
    }
    return p;
}

+ (int) N153bcbc81:(NSArray *)i {
    int p = -1;
    if (i[0] == nil) {
        p = 0;
    }
    else if ([((NSNumber*)i[0]) doubleValue] <= 5.299988) {
        p = [TouchClassifier N8bfc25c2:i];
    }
    else if ([((NSNumber*)i[0]) doubleValue] > 5.299988) {
        p = 0;
    }
    return p;
}

+ (int) N8bfc25c2:(NSArray *)i {
    int p = -1;
    if (i[5] == nil) {
        p = 2;
    }
    else if ([((NSNumber*)i[5]) doubleValue] <= 33.0) {
        p = 2;
    }
    else if ([((NSNumber*)i[5]) doubleValue] > 33.0) {
        p = 0;
    }
    return p;
}

+ (int) N65712a803:(NSArray *)i {
    int p = -1;
    if (i[2] == nil) {
        p = 1;
    }
    else if ([((NSNumber*)i[2]) doubleValue] <= 2.733296) {
        p = [TouchClassifier N689d6d874:i];
    }
    else if ([((NSNumber*)i[2]) doubleValue] > 2.733296) {
        p = 2;
    }
    return p;
}

+ (int) N689d6d874:(NSArray *)i {
    int p = -1;
    if (i[0] == nil) {
        p = 1;
    }
    else if ([((NSNumber*)i[0]) doubleValue] <= 12.579987) {
        p = 1;
    }
    else if ([((NSNumber*)i[0]) doubleValue] > 12.579987) {
        p = 2;
    }
    return p;
}

@end
