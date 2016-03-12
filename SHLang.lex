package wlrewriter;

import java.lang.*;
  
%%

%byaccj


LETTER = [a-zA-Z]
DIGIT = [0-9]
NONZERO_DIGIT = [1-9]

PROGRAM_KW = (program)
MAIN_KW = (main)

PROCEDURE_KW = (procedure)

EMPTY_KW = (empty)

INTEGER_KW = (int)
REAL_KW = (real)
CHAR_KW = (char)

INTEGER_CONSTANT ="0"|({NONZERO_DIGIT}{DIGIT}*)
IDENTIFIER ={LETTER}+|{LETTER}({LETTER}|{DIGIT})*

IF_KW = (if)
THEN_KW = (then)
ELSE_KW = (else)

WHILE_KW = (while)
DO_KW = (do)

FOR_KW = (for)
IN_KW = (in)
REPEAT_KW = (repeat)
CASE_KW = (case)
DEFAULT_KW = (default)
RETURN_KW = (return)
EXIT_KW = (exit)
WHEN_KW = (when)

AND_KW = (and)
OR_KW = (or)
NOT_KW = (not)

SEMICOLON_KW = [;]
COLON_KW = [:]
COMMA_KW = [,]
ASS_KW = (:=)

LP_KW = [(]
RP_KW = [)
LB_KW = [[]
RB_KW = []]
LCB_KW = [{]
RCB_KW = [}]

TWO_DOTS_KW = (..)

EQ_KW = [=]
NE_KW = (<>)
LT_KW = [<]
LE_KW = (<=)
GT_KW = [>]
GE_KW = (>=)

ADD_KW = [+]
SUB_KW = [-]
MUL_KW = [*]
DIV_KW = [/]
MOD_KW = [%]

%%

{LineTerminator} {yyline++;}

{PROGRAM_KW} {
	return YYParser.PROGRAM_KW;
}

{AND_KW} {
	return YYParser.AND_KW;
}
{OR_KW} {
	return YYParser.OR_KW;
}
{NEG_KW} {
	return YYParser.NEG_KW;
}

{ASSIGN_KW} {
	return YYParser.ASSIGN_KW;
}

{IF_KW} {
	return YYParser.IF_KW;
}
{THEN_KW} {
	return YYParser.THEN_KW;
}
{ELSE_KW} {
	return YYParser.ELSE_KW;
}
{ENDIF_KW} {
	return YYParser.ENDIF_KW;
}

{WHILE_KW} {
	return YYParser.WHILE_KW;
}
{DO_KW} {
	return YYParser.DO_KW;
}
{DONE_KW} {
	return YYParser.DONE_KW;
}

{NOP_KW} {
	return YYParser.NOP_KW;
}

{BOT_KW} {
	return YYParser.BOT_KW;
}

{INL_KW} {
	return YYParser.INL_KW;
}
{INH_KW} {
	return YYParser.INH_KW;
}
{OUTL_KW} {
	return YYParser.OUTL_KW;
}
{OUTH_KW} {
	return YYParser.OUTH_KW;
}

{PLUS_KW} {
	return YYParser.PLUS_KW;
}
{MINUS_KW} {
	return YYParser.MINUS_KW;
}

{LT_KW} {
	return YYParser.LT_KW;
}
{LE_KW} {
	return YYParser.LE_KW;
}
{EQ_KW} {
	return YYParser.EQ_KW;
}
{GT_KW} {
	return YYParser.GT_KW;
}
{GE_KW} {
	return YYParser.GE_KW;
}

{INTEGER_NUMBER} {
	YYParser.stmt=yytext();
	return YYParser.INTEGER_NUMBER;
}
{BOOL_CONSTANT} {
     
     String s=yytext();
	 YYParser.stmt=yytext();
	return YYParser.BOOL_CONSTANT;
}

{IDENTIFIER} {
	YYParser.stmt=yytext();	
	return YYParser.IDENTIFIER;
}

{LPAR_KW} {
	return YYParser.LPAR_KW;
}

{RPAR_KW} {
	return YYParser.RPAR_KW;
}

"," {
	return ',';
	}
";" {
	return ';';
}

. {
}