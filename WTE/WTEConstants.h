//
//  WTEConstants.h
//  WTE
//
//  Created by Xiang 'Anthony' Chen on 6/27/13.
//  Copyright (c) 2013 hotnAny. All rights reserved.
//

#ifndef WTE_WTEConstants_h
#define WTE_WTEConstants_h

#define SWIPEBOARD 0
#define ZOOMBOARD 1

#define TRAINING 0
#define EVALUATIONONE 1
#define EVALUATIONTWO 2

#define WATCHWIDTH 64
#define WATCHHEIGHT 64

#define ZOOMBOARDFONTSIZE 5

#define WATCHORIX 0.3990f
#define WATCHORIY 0.4250f

#define TEXTFIELDORIX 0.00f
#define TEXTFIELDORIY 0.20f
#define TEXTFIELDWIDTHRATIO 1.0f
#define TEXTFIELDHEIGHTRATIO 0.4f

#define FONTSIZE 15
#define TEXTLENGTH 36

#define NUMTRAININGTRIALS 5
#define NUMBLOCKS 2+1
#define NUMTRIALS 12

#define BREAKTIME 10

#define INTERNAL 300
#define PILOT 200
#define REALTRIALS 100

#define PARTICIPANT INTERNAL+1
#define SECTION EVALUATIONONE

#define SUMMARIZATION 0
#define PERENTRY 1

#define MAXZOOMLEVEL 1

#define INITIALZOOMLEVEL 0
#define ZOOMFACTOR 4.0f / MAXZOOMLEVEL

#define ANIMATIONDURATION 0.1

#define ALPHABET 0
#define SYMNUM 1

////////////////////////////////////
// only these need changes
//#define CONDITION ZOOMBOARD
#define CONDITION SWIPEBOARD
#define PARTICIPANT INTERNAL+1
#define SECTION EVALUATIONONE
////////////////////////////////////

#endif


