package jSHLang;

/* Phase 1
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

class MainClass {
    public static void main(String[] args) {
        FileReader fr = null;
        String input = ".\\files\\Code.shl";
        try {
            fr = new FileReader(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // System.out.println("Lexeme\tToken\tAttribute");
        Yylex yylex = new Yylex(fr);
        try {
            yylex.yylex();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} */
  
%%

%byaccj

LETTER = [a-zA-Z]
NONZERO_DIGIT = [1-9]
DIGIT = "0"|{NONZERO_DIGIT}

PROGRAM_KW = (program)
MAIN_KW = (main)

PROCEDURE_KW = (procedure)

INTEGER_KW = (int)
REAL_KW = (real)
CHAR_KW = (char)
BOOLEAN_KW = (boolean)

IF_KW = (if)
THEN_KW = (then)
ELSE_KW = (else)

DO_KW = (do)
WHILE_KW = (while)

FOR_KW = (for)
IN_KW = (in)
REPEAT_KW = (repeat)

SWITCH_KW = (switch)
CASE_KW = (case)
DEFAULT_KW = (default)
END_KW = (end)

RETURN_KW = (return)
EXIT_KW = (exit)
WHEN_KW = (when)

AND_THEN_KW = (and then)
AND_KW = (and)
OR_ELSE_KW = (or else)
OR_KW = (or)
NOT_KW = (not)

SEMICOLON_KW = [;]
COLON_KW = [:]
COMMA_KW = [,]
SINGLE_QUOTE_KW = "\u0027"
ASS_KW = (:=)

LP_KW = [(]
RP_KW = [)]
LB_KW = "["
RB_KW = "]"
LCB_KW = [{]
RCB_KW = [}]

TWO_DOTS_KW = "\.\."
DOT_KW = "\."

EQ_KW = [=]
NE_KW = (<>)
LE_KW = (<=)
LT_KW = [<]
GE_KW = (>=)
GT_KW = [>]

ADD_KW = [+]
SUB_KW = [-]
MUL_KW = [*]
DIV_KW = [/]
MOD_KW = [%]

BOOLEAN_CONSTANT = (true) | (false)
CHAR_CONSTANT = {SINGLE_QUOTE_KW} ({LETTER} | {DIGIT}) {SINGLE_QUOTE_KW}
REAL_CONSTANT = (({DIGIT})|({NONZERO_DIGIT}({DIGIT})*))({DOT_KW})({DIGIT})*{NONZERO_DIGIT}
INTEGER_CONSTANT = {DIGIT}|{NONZERO_DIGIT}{DIGIT}*
IDENTIFIER ={LETTER}({LETTER}|{DIGIT})*

%%

{PROGRAM_KW} {
	// System.out.println(yytext() + "\t" + "PROGRAM_KW\t" + '-');
	return YYParser.PROGRAM_KW;
}
{MAIN_KW} {
	// System.out.println(yytext() + "\t" + "MAIN_KW\t" + '-');
	return YYParser.MAIN_KW;
}

{PROCEDURE_KW} {
	// System.out.println(yytext() + "\t" + "PROCEDURE_KW\t" + '-');
	return YYParser.PROCEDURE_KW;
}

{INTEGER_KW} {
	// System.out.println(yytext() + "\t" + "INTEGER_KW\t" + '-');
	return YYParser.INTEGER_KW;
}
{REAL_KW} {
	// System.out.println(yytext() + "\t" + "REAL_KW\t" + '-');
	return YYParser.REAL_KW;
}
{CHAR_KW} {
	// System.out.println(yytext() + "\t" + "CHAR_KW\t" + '-');
	return YYParser.CHAR_KW;
}
{BOOLEAN_KW} {
	// System.out.println(yytext() + "\t" + "BOOLEAN_KW\t" + '-');
	return YYParser.BOOLEAN_KW;
}

{IF_KW} {
	// System.out.println(yytext() + "\t" + "IF_KW\t" + '-');
	return YYParser.IF_KW;
}
{THEN_KW} {
	// System.out.println(yytext() + "\t" + "THEN_KW\t" + '-');
	return YYParser.THEN_KW;
}
{ELSE_KW} {
	// System.out.println(yytext() + "\t" + "ELSE_KW\t" + '-');
	return YYParser.ELSE_KW;
}

{DO_KW} {
	// System.out.println(yytext() + "\t" + "DO_KW\t" + '-');
	return YYParser.DO_KW;
}
{WHILE_KW} {
	// System.out.println(yytext() + "\t" + "WHILE_KW\t" + '-');
	return YYParser.WHILE_KW;
}

{FOR_KW} {
	// System.out.println(yytext() + "\t" + "FOR_KW\t" + '-');
	return YYParser.FOR_KW;
}
{IN_KW} {
	// System.out.println(yytext() + "\t" + "IN_KW\t" + '-');
	return YYParser.IN_KW;
}
{REPEAT_KW} {
	// System.out.println(yytext() + "\t" + "REPEAT_KW\t" + '-');
	return YYParser.REPEAT_KW;
}

{SWITCH_KW} {
	// System.out.println(yytext() + "\t" + "SWITCH_KW\t" + '-');
	return YYParser.SWITCH_KW;
}
{CASE_KW} {
	// System.out.println(yytext() + "\t" + "CASE_KW\t" + '-');
	return YYParser.CASE_KW;
}
{DEFAULT_KW} {
	// System.out.println(yytext() + "\t" + "DEFAULT_KW\t" + '-');
	return YYParser.DEFAULT_KW;
}
{END_KW} {
	// System.out.println(yytext() + "\t" + "END_KW\t" + '-');
	return YYParser.END_KW;
}

{RETURN_KW} {
	// System.out.println(yytext() + "\t" + "RETURN_KW\t" + '-');
	return YYParser.RETURN_KW;
}
{EXIT_KW} {
	// System.out.println(yytext() + "\t" + "EXIT_KW\t" + '-');
	return YYParser.EXIT_KW;
}
{WHEN_KW} {
	// System.out.println(yytext() + "\t" + "WHEN_KW\t" + '-');
	return YYParser.WHEN_KW;
}

{AND_THEN_KW} {
	// System.out.println(yytext() + "\t" + "AND_THEN_KW\t" + '-');
	return YYParser.AND_THEN_KW;
}
{AND_KW} {
	// System.out.println(yytext() + "\t" + "AND_KW\t" + '-');
	return YYParser.AND_KW;
}
{OR_ELSE_KW} {
	// System.out.println(yytext() + "\t" + "OR_ELSE_KW\t" + '-');
	return YYParser.OR_ELSE_KW;
}
{OR_KW} {
	// System.out.println(yytext() + "\t" + "OR_KW\t" + '-');
	return YYParser.OR_KW;
}
{NOT_KW} {
	// System.out.println(yytext() + "\t" + "NOT_KW\t" + '-');
	return YYParser.NOT_KW;
}

{SEMICOLON_KW} {
	// System.out.println(yytext() + "\t" + "SEMICOLON_KW\t" + '-');
	return YYParser.SEMICOLON_KW;
}
{COLON_KW} {
	// System.out.println(yytext() + "\t" + "COLON_KW\t" + '-');
	return YYParser.COLON_KW;
}
{COMMA_KW} {
	// System.out.println(yytext() + "\t" + "COMMA_KW\t" + '-');
	return YYParser.COMMA_KW;
}
{SINGLE_QUOTE_KW} {
	// System.out.println(yytext() + "\t" + "SINGLE_QUOTE_KW\t" + '-');
	return YYParser.SINGLE_QUOTE_KW;
}
{ASS_KW} {
	// System.out.println(yytext() + "\t" + "ASS_KW\t" + '-');
	return YYParser.ASS_KW;
}

{LP_KW} {
	// System.out.println(yytext() + "\t" + "LP_KW\t" + '-');
	return YYParser.LP_KW;
}
{RP_KW} {
	// System.out.println(yytext() + "\t" + "RP_KW\t" + '-');
	return YYParser.RP_KW;
}
{LB_KW} {
	// System.out.println(yytext() + "\t" + "LB_KW\t" + '-');
	return YYParser.LB_KW;
}
{RB_KW} {
	// System.out.println(yytext() + "\t" + "RB_KW\t" + '-');
	return YYParser.RB_KW;
}
{LCB_KW} {
	// System.out.println(yytext() + "\t" + "LCB_KW\t" + '-');
	return YYParser.LCB_KW;
}
{RCB_KW} {
	// System.out.println(yytext() + "\t" + "RCB_KW\t" + '-');
	return YYParser.RCB_KW;
}

{TWO_DOTS_KW} {
    // System.out.println(yytext() + "\t" + "TWO_DOTS_KW\t" + '-');
	return YYParser.TWO_DOTS_KW;
}
{DOT_KW} {
    // System.out.println(yytext() + "\t" + "DOT_KW\t" + '-');
	return YYParser.DOT_KW;
}

{EQ_KW} {
	// System.out.println(yytext() + "\t" + "EQ_KW\t" + '-');
	return YYParser.EQ_KW;
}
{NE_KW} {
	// System.out.println(yytext() + "\t" + "NE_KW\t" + '-');
	return YYParser.NE_KW;
}
{LE_KW} {
	// System.out.println(yytext() + "\t" + "LE_KW\t" + '-');
	return YYParser.LE_KW;
}
{LT_KW} {
	// System.out.println(yytext() + "\t" + "LT_KW\t" + '-');
	return YYParser.LT_KW;
}
{GE_KW} {
	// System.out.println(yytext() + "\t" + "GE_KW\t" + '-');
	return YYParser.GE_KW;
}
{GT_KW} {
	// System.out.println(yytext() + "\t" + "GT_KW\t" + '-');
	return YYParser.GT_KW;
}

{ADD_KW} {
	// System.out.println(yytext() + "\t" + "ADD_KW\t" + '-');
	return YYParser.ADD_KW;
}
{SUB_KW} {
	// System.out.println(yytext() + "\t" + "SUB_KW\t" + '-');
	return YYParser.SUB_KW;
}
{MUL_KW} {
	// System.out.println(yytext() + "\t" + "MUL_KW\t" + '-');
	return YYParser.MUL_KW;
}
{DIV_KW} {
	// System.out.println(yytext() + "\t" + "DIV_KW\t" + '-');
	return YYParser.DIV_KW;
}
{MOD_KW} {
	// System.out.println(yytext() + "\t" + "MOD_KW\t\t" + '-');
	return YYParser.MOD_KW;
}

{BOOLEAN_CONSTANT} {
	// System.out.println(yytext() + "\t" + "CHAR_CONSTANT\t" + "-");
	return YYParser.BOOLEAN_CONSTANT;
}
{CHAR_CONSTANT} {
	// System.out.println(yytext() + "\t" + "CHAR_CONSTANT\t" + "-");
	return YYParser.CHAR_CONSTANT;
}
{REAL_CONSTANT} {
	// System.out.println(yytext() + "\t" + "REAL_CONSTANT\t" + "-");
	return YYParser.REAL_CONSTANT;
}
{INTEGER_CONSTANT} {
	// System.out.println(yytext() + "\t" + "INTEGER_CONSTANT\t" + "-");
	return YYParser.INTEGER_CONSTANT;
}
{IDENTIFIER} {
	// System.out.println(yytext() + "\t" + "IDENTIFIER\t" + "Symbol Table Entry");
	return YYParser.IDENTIFIER;
}

"\s"|"\n"|"\r"|"\t" {
}

. {
}