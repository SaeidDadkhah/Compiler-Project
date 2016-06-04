/* A Bison parser, made by GNU Bison 2.5.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007-2011 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 1 of "SHLang.yac"  */

package jSHLang;

import java.io.*;


/**
 * A Bison parser, automatically generated from <tt>SHLang.yac</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser {
    /**
     * Version number for the Bison executable that generated this parser.
     */
    public static final String bisonVersion = "2.5";

    /**
     * Name of the skeleton that generated this parser.
     */
    public static final String bisonSkeleton = "lalr1.java";


    /**
     * True if verbose error messages are enabled.
     */
    public boolean errorVerbose = false;


    /**
     * Token returned by the scanner to signal the end of its input.
     */
    public static final int EOF = 0;

/* Tokens.  */
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int PROGRAM_KW = 258;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int MAIN_KW = 259;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int PROCEDURE_KW = 260;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int INTEGER_KW = 261;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int REAL_KW = 262;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int CHAR_KW = 263;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int BOOLEAN_KW = 264;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int IF_KW = 265;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int THEN_KW = 266;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int ELSE_KW = 267;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int DO_KW = 268;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int WHILE_KW = 269;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int FOR_KW = 270;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int IN_KW = 271;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int REPEAT_KW = 272;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int SWITCH_KW = 273;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int CASE_KW = 274;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int DEFAULT_KW = 275;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int END_KW = 276;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int RETURN_KW = 277;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int EXIT_KW = 278;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int WHEN_KW = 279;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int AND_KW = 280;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int AND_THEN_KW = 281;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int OR_KW = 282;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int OR_ELSE_KW = 283;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int NOT_KW = 284;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int SEMICOLON_KW = 285;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int COLON_KW = 286;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int COMMA_KW = 287;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int SINGLE_QUOTE_KW = 288;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int ASS_KW = 289;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int LP_KW = 290;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int RP_KW = 291;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int LB_KW = 292;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int RB_KW = 293;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int LCB_KW = 294;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int RCB_KW = 295;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int TWO_DOTS_KW = 296;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int DOT_KW = 297;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int EQ_KW = 298;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int NE_KW = 299;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int LE_KW = 300;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int LT_KW = 301;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int GE_KW = 302;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int GT_KW = 303;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int ADD_KW = 304;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int SUB_KW = 305;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int MUL_KW = 306;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int DIV_KW = 307;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int MOD_KW = 308;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int BOOLEAN_CONSTANT = 309;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int CHAR_CONSTANT = 310;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int REAL_CONSTANT = 311;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int INTEGER_CONSTANT = 312;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int IDENTIFIER = 313;
    /**
     * Token number, to be returned by the scanner.
     */
    public static final int usub = 314;


    /**
     * Communication interface between the scanner and the Bison-generated
     * parser <tt>YYParser</tt>.
     */
    public interface Lexer {


        /**
         * Method to retrieve the semantic value of the last scanned token.
         *
         * @return the semantic value of the last scanned token.
         */
        Object getLVal();

        /**
         * Entry point for the scanner.  Returns the token identifier corresponding
         * to the next token and prepares to return the semantic value
         * of the token.
         *
         * @return the token identifier corresponding to the next token.
         */
        int yylex() throws java.io.IOException;

        /**
         * Entry point for error reporting.  Emits an error
         * in a user-defined way.
         *
         * @param s The string for the error message.
         */
        void yyerror(String s);
    }

    /**
     * The object doing lexical analysis for us.
     */
    private Lexer yylexer;


    /**
     * Instantiates the Bison-generated parser.
     *
     * @param yylexer The scanner that will supply tokens to the parser.
     */
    public YYParser(Lexer yylexer) {
        this.yylexer = yylexer;

    }

    private java.io.PrintStream yyDebugStream = System.err;

    /**
     * Return the <tt>PrintStream</tt> on which the debugging output is
     * printed.
     */
    public final java.io.PrintStream getDebugStream() {
        return yyDebugStream;
    }

    /**
     * Set the <tt>PrintStream</tt> on which the debug output is printed.
     *
     * @param s The stream that is used for debugging output.
     */
    public final void setDebugStream(java.io.PrintStream s) {
        yyDebugStream = s;
    }

    private int yydebug = 0;

    /**
     * Answer the verbosity of the debugging output; 0 means that all kinds of
     * output from the parser are suppressed.
     */
    public final int getDebugLevel() {
        return yydebug;
    }

    /**
     * Set the verbosity of the debugging output; 0 means that all kinds of
     * output from the parser are suppressed.
     *
     * @param level The verbosity level for debugging output.
     */
    public final void setDebugLevel(int level) {
        yydebug = level;
    }

    private final int yylex() throws java.io.IOException {
        return yylexer.yylex();
    }

    protected final void yyerror(String s) {
        yylexer.yyerror(s);
    }


    protected final void yycdebug(String s) {
        if (yydebug > 0)
            yyDebugStream.println(s);
    }

    private final class YYStack {
        private int[] stateStack = new int[16];

        private Object[] valueStack = new Object[16];

        public int size = 16;
        public int height = -1;

        public final void push(int state, Object value) {
            height++;
            if (size == height) {
                int[] newStateStack = new int[size * 2];
                System.arraycopy(stateStack, 0, newStateStack, 0, height);
                stateStack = newStateStack;


                Object[] newValueStack = new Object[size * 2];
                System.arraycopy(valueStack, 0, newValueStack, 0, height);
                valueStack = newValueStack;

                size *= 2;
            }

            stateStack[height] = state;

            valueStack[height] = value;
        }

        public final void pop() {
            pop(1);
        }

        public final void pop(int num) {
            // Avoid memory leaks... garbage collection is a white lie!
            if (num > 0) {
                java.util.Arrays.fill(valueStack, height - num + 1, height + 1, null);

            }
            height -= num;
        }

        public final int stateAt(int i) {
            return stateStack[height - i];
        }

        public final Object valueAt(int i) {
            return valueStack[height - i];
        }

        // Print the state stack on the debug stream.
        public void print(java.io.PrintStream out) {
            out.print("Stack now");

            for (int i = 0; i <= height; i++) {
                out.print(' ');
                out.print(stateStack[i]);
            }
            out.println();
        }
    }

    /**
     * Returned by a Bison action in order to stop the parsing process and
     * return success (<tt>true</tt>).
     */
    public static final int YYACCEPT = 0;

    /**
     * Returned by a Bison action in order to stop the parsing process and
     * return failure (<tt>false</tt>).
     */
    public static final int YYABORT = 1;

    /**
     * Returned by a Bison action in order to start error recovery without
     * printing an error message.
     */
    public static final int YYERROR = 2;

    // Internal return codes that are not supported for user semantic
    // actions.
    private static final int YYERRLAB = 3;
    private static final int YYNEWSTATE = 4;
    private static final int YYDEFAULT = 5;
    private static final int YYREDUCE = 6;
    private static final int YYERRLAB1 = 7;
    private static final int YYRETURN = 8;

    private int yyerrstatus_ = 0;

    /**
     * Return whether error recovery is being done.  In this state, the parser
     * reads token until it reaches a known state, and then restarts normal
     * operation.
     */
    public final boolean recovering() {
        return yyerrstatus_ == 0;
    }

    private int yyaction(int yyn, YYStack yystack, int yylen) {
        Object yyval;


    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
        if (yylen > 0)
            yyval = yystack.valueAt(yylen - 1);
        else
            yyval = yystack.valueAt(0);

        yy_reduce_print(yyn, yystack);

        switch (yyn) {
            case 2:
                if (yyn == 2)

/* Line 351 of lalr1.java  */
/* Line 57 of "SHLang.yac"  */ {
                    System.out.println("Rule 1.1: " +
                            "program: PROGRAM_KW IDENTIFIER declarations_list procedure_list MAIN_KW block");
                }
                ;
                break;


            case 3:
                if (yyn == 3)

/* Line 351 of lalr1.java  */
/* Line 61 of "SHLang.yac"  */ {
                    System.out.println("Rule 1.2: " +
                            "program: PROGRAM_KW IDENTIFIER procedure_list MAIN_KW block");
                }
                ;
                break;


            case 4:
                if (yyn == 4)

/* Line 351 of lalr1.java  */
/* Line 65 of "SHLang.yac"  */ {
                    System.out.println("Rule 1.3: " +
                            "program: PROGRAM_KW IDENTIFIER declarations_list MAIN_KW block");
                }
                ;
                break;


            case 5:
                if (yyn == 5)

/* Line 351 of lalr1.java  */
/* Line 69 of "SHLang.yac"  */ {
                    System.out.println("Rule 1.4: " +
                            "program: PROGRAM_KW IDENTIFIER MAIN_KW block");
                }
                ;
                break;


            case 6:
                if (yyn == 6)

/* Line 351 of lalr1.java  */
/* Line 75 of "SHLang.yac"  */ {
                    System.out.println("Rule 2.1: " +
                            "declarations_list: declarations_list declarations");
                }
                ;
                break;


            case 7:
                if (yyn == 7)

/* Line 351 of lalr1.java  */
/* Line 79 of "SHLang.yac"  */ {
                    System.out.println("Rule 2.2: " +
                            "declarations_list: declarations");
                }
                ;
                break;


            case 8:
                if (yyn == 8)

/* Line 351 of lalr1.java  */
/* Line 85 of "SHLang.yac"  */ {
                    System.out.println("Rule 3: " +
                            "declarations: type_specifiers declarator_list SEMICOLON_KW");
                }
                ;
                break;


            case 9:
                if (yyn == 9)

/* Line 351 of lalr1.java  */
/* Line 91 of "SHLang.yac"  */ {
                    System.out.println("Rule 4.1: " +
                            "type_specifiers: INTEGER_KW");
                }
                ;
                break;


            case 10:
                if (yyn == 10)

/* Line 351 of lalr1.java  */
/* Line 95 of "SHLang.yac"  */ {
                    System.out.println("Rule 4.2: " +
                            "type_specifiers: REAL_KW");
                }
                ;
                break;


            case 11:
                if (yyn == 11)

/* Line 351 of lalr1.java  */
/* Line 99 of "SHLang.yac"  */ {
                    System.out.println("Rule 4.3: " +
                            "type_specifiers: CHAR_KW");
                }
                ;
                break;


            case 12:
                if (yyn == 12)

/* Line 351 of lalr1.java  */
/* Line 103 of "SHLang.yac"  */ {
                    System.out.println("Rule 4.4: " +
                            "type_specifiers: BOOLEAN_KW");
                }
                ;
                break;


            case 13:
                if (yyn == 13)

/* Line 351 of lalr1.java  */
/* Line 109 of "SHLang.yac"  */ {
                    System.out.println("Rule 5.1: " +
                            "declarator_list: declarator_list COMMA_KW declarator");
                }
                ;
                break;


            case 14:
                if (yyn == 14)

/* Line 351 of lalr1.java  */
/* Line 113 of "SHLang.yac"  */ {
                    System.out.println("Rule 5.2: " +
                            "delarator_list: declarator");
                }
                ;
                break;


            case 15:
                if (yyn == 15)

/* Line 351 of lalr1.java  */
/* Line 119 of "SHLang.yac"  */ {
                    System.out.println("Rule 6.1: " +
                            "declarator: dec");
                }
                ;
                break;


            case 16:
                if (yyn == 16)

/* Line 351 of lalr1.java  */
/* Line 123 of "SHLang.yac"  */ {
                    System.out.println("Rule 6.2: " +
                            "declarator: dec ASS_KW initializer");
                }
                ;
                break;


            case 17:
                if (yyn == 17)

/* Line 351 of lalr1.java  */
/* Line 129 of "SHLang.yac"  */ {
                    System.out.println("Rule 7.1: " +
                            "dec: IDENTIFIER");
                }
                ;
                break;


            case 18:
                if (yyn == 18)

/* Line 351 of lalr1.java  */
/* Line 133 of "SHLang.yac"  */ {
                    System.out.println("Rule 7.2: " +
                            "dec: IDENTIFIER LB_KW range RB_KW");
                }
                ;
                break;


            case 19:
                if (yyn == 19)

/* Line 351 of lalr1.java  */
/* Line 137 of "SHLang.yac"  */ {
                    System.out.println("Rule 7.3: " +
                            "dec: IDENTIFIER LB_KW INTEGER_CONSTANT RB_KW");
                }
                ;
                break;


            case 20:
                if (yyn == 20)

/* Line 351 of lalr1.java  */
/* Line 143 of "SHLang.yac"  */ {
                    System.out.println("Rule 8.1: " +
                            "range: IDENTIFIER TWO_DOTS_KW IDENTIFIER");
                }
                ;
                break;


            case 21:
                if (yyn == 21)

/* Line 351 of lalr1.java  */
/* Line 147 of "SHLang.yac"  */ {
                    System.out.println("Rule 8.2: " +
                            "range: INTEGER_CONSTANT TWO_DOTS_KW INTEGER_CONSTANT");
                }
                ;
                break;


            case 22:
                if (yyn == 22)

/* Line 351 of lalr1.java  */
/* Line 151 of "SHLang.yac"  */ {
                    System.out.println("Rule 8.3: " +
                            "range: arithmatic_expressions TWO_DOTS_KW arithmatic_expressions");
                }
                ;
                break;


            case 23:
                if (yyn == 23)

/* Line 351 of lalr1.java  */
/* Line 157 of "SHLang.yac"  */ {
                    System.out.println("Rule 9: " +
                            "initializer: LCB_KW initializer_list RCB_KW");
                }
                ;
                break;


            case 24:
                if (yyn == 24)

/* Line 351 of lalr1.java  */
/* Line 163 of "SHLang.yac"  */ {
                    System.out.println("Rule 10.1: " +
                            "initializer_list: constant_expressions COMMA_KW initializer_list");
                }
                ;
                break;


            case 25:
                if (yyn == 25)

/* Line 351 of lalr1.java  */
/* Line 167 of "SHLang.yac"  */ {
                    System.out.println("Rule 10.2: " +
                            "initializer_list: constant_expressions");
                }
                ;
                break;


            case 26:
                if (yyn == 26)

/* Line 351 of lalr1.java  */
/* Line 173 of "SHLang.yac"  */ {
                    System.out.println("Rule 11.1: " +
                            "procedure_list: procedure");
                }
                ;
                break;


            case 27:
                if (yyn == 27)

/* Line 351 of lalr1.java  */
/* Line 177 of "SHLang.yac"  */ {
                    System.out.println("Rule 11.2: " +
                            "procedure_list: procedure_list procedure");
                }
                ;
                break;


            case 28:
                if (yyn == 28)

/* Line 351 of lalr1.java  */
/* Line 183 of "SHLang.yac"  */ {
                    System.out.println("Rule 12.1: " +
                            "procedure: PROCEDURE_KW IDENTIFIER parameters LCB_KW declarations_list block RCB_KW");
                }
                ;
                break;


            case 29:
                if (yyn == 29)

/* Line 351 of lalr1.java  */
/* Line 187 of "SHLang.yac"  */ {
                    System.out.println("Rule 12.2: " +
                            "procedure: PROCEDURE_KW IDENTIFIER parameters LCB_KW block RCB_KW");
                }
                ;
                break;


            case 30:
                if (yyn == 30)

/* Line 351 of lalr1.java  */
/* Line 193 of "SHLang.yac"  */ {
                    System.out.println("Rule 13: " +
                            "parameters: LP_KW declarations_list RP_KW");
                }
                ;
                break;


            case 31:
                if (yyn == 31)

/* Line 351 of lalr1.java  */
/* Line 197 of "SHLang.yac"  */ {
                    System.out.println("Rule 13: " +
                            "parameters: LP_KW RP_KW");
                }
                ;
                break;


            case 32:
                if (yyn == 32)

/* Line 351 of lalr1.java  */
/* Line 203 of "SHLang.yac"  */ {
                    System.out.println("Rule 14.1: " +
                            "block: LCB_KW statement_list RCB_KW ");
                }
                ;
                break;


            case 33:
                if (yyn == 33)

/* Line 351 of lalr1.java  */
/* Line 207 of "SHLang.yac"  */ {
                    System.out.println("Rule 14.2: " +
                            "block: LCB_KW RCB_KW ");
                }
                ;
                break;


            case 34:
                if (yyn == 34)

/* Line 351 of lalr1.java  */
/* Line 213 of "SHLang.yac"  */ {
                    System.out.println("Rule 15.1: " +
                            "statement_list: statement SEMICOLON_KW");
                }
                ;
                break;


            case 35:
                if (yyn == 35)

/* Line 351 of lalr1.java  */
/* Line 217 of "SHLang.yac"  */ {
                    System.out.println("Rule 15.2: " +
                            "statement_list: statement SEMICOLON_KW");
                }
                ;
                break;


            case 36:
                if (yyn == 36)

/* Line 351 of lalr1.java  */
/* Line 221 of "SHLang.yac"  */ {
                    System.out.println("Rule 15.3: " +
                            "statement_list: statement_list statement SEMICOLON_KW");
                }
                ;
                break;


            case 37:
                if (yyn == 37)

/* Line 351 of lalr1.java  */
/* Line 227 of "SHLang.yac"  */ {
                    System.out.println("Rule 16.1: " +
                            "statement: IDENTIFIER ASS_KW expressions");
                }
                ;
                break;


            case 38:
                if (yyn == 38)

/* Line 351 of lalr1.java  */
/* Line 231 of "SHLang.yac"  */ {
                    System.out.println("Rule 16.2: " +
                            "statement: IF_KW bool_expressions THEN_KW block");
                }
                ;
                break;


            case 39:
                if (yyn == 39)

/* Line 351 of lalr1.java  */
/* Line 235 of "SHLang.yac"  */ {
                    System.out.println("Rule 16.3: " +
                            "statement: IF_KW bool_expressions THEN_KW block ELSE_KW block");
                }
                ;
                break;


            case 40:
                if (yyn == 40)

/* Line 351 of lalr1.java  */
/* Line 239 of "SHLang.yac"  */ {
                    System.out.println("Rule 16.4: " +
                            "statement: DO_KW block WHILE_KW bool_expressions");
                }
                ;
                break;


            case 41:
                if (yyn == 41)

/* Line 351 of lalr1.java  */
/* Line 243 of "SHLang.yac"  */ {
                    System.out.println("Rule 16.5: " +
                            "statement: FOR_KW IDENTIFIER IN_KW range REPEAT_KW statement");
                }
                ;
                break;


            case 42:
                if (yyn == 42)

/* Line 351 of lalr1.java  */
/* Line 247 of "SHLang.yac"  */ {
                    System.out.println("Rule 16.6.1: " +
                            "statement: SWITCH_KW expressions caseelement default END_KW");
                }
                ;
                break;


            case 43:
                if (yyn == 43)

/* Line 351 of lalr1.java  */
/* Line 251 of "SHLang.yac"  */ {
                    System.out.println("Rule 16.6.2: " +
                            "statement: SWITCH_KW expressions caseelement END_KW");
                }
                ;
                break;


            case 44:
                if (yyn == 44)

/* Line 351 of lalr1.java  */
/* Line 255 of "SHLang.yac"  */ {
                    System.out.println("Rule 16.7.1: " +
                            "statement: IDENTIFIER LP_KW arguments RP_KW");
                }
                ;
                break;


            case 45:
                if (yyn == 45)

/* Line 351 of lalr1.java  */
/* Line 259 of "SHLang.yac"  */ {
                    System.out.println("Rule 16.7.2: " +
                            "statement: IDENTIFIER LP_KW RP_KW");
                }
                ;
                break;


            case 46:
                if (yyn == 46)

/* Line 351 of lalr1.java  */
/* Line 263 of "SHLang.yac"  */ {
                    System.out.println("Rule 16.8: " +
                            "statement: RETURN_KW expressions");
                }
                ;
                break;


            case 47:
                if (yyn == 47)

/* Line 351 of lalr1.java  */
/* Line 267 of "SHLang.yac"  */ {
                    System.out.println("Rule 16.9: " +
                            "statement: EXIT_KW WHEN_KW LP_KW bool_expressions RP_KW");
                }
                ;
                break;


            case 48:
                if (yyn == 48)

/* Line 351 of lalr1.java  */
/* Line 271 of "SHLang.yac"  */ {
                    System.out.println("Rule 16.10: " +
                            "statement: block");
                }
                ;
                break;


            case 49:
                if (yyn == 49)

/* Line 351 of lalr1.java  */
/* Line 277 of "SHLang.yac"  */ {
                    System.out.println("Rule 17.1: " +
                            "arguments: declarator_list");
                }
                ;
                break;


            case 50:
                if (yyn == 50)

/* Line 351 of lalr1.java  */
/* Line 283 of "SHLang.yac"  */ {
                    System.out.println("Rule 18.1: " +
                            "caseelement: CASE_KW INTEGER_CONSTANT COLON_KW block SEMICOLON_KW");
                }
                ;
                break;


            case 51:
                if (yyn == 51)

/* Line 351 of lalr1.java  */
/* Line 287 of "SHLang.yac"  */ {
                    System.out.println("Rule 18.2: " +
                            "caseelement: caseelement CASE_KW INTEGER_CONSTANT COLON_KW block SEMICOLON_KW");
                }
                ;
                break;


            case 52:
                if (yyn == 52)

/* Line 351 of lalr1.java  */
/* Line 293 of "SHLang.yac"  */ {
                    System.out.println("Rule 19: " +
                            "default: DEFAULT_KW COLON_KW block SEMICOLON_KW");
                }
                ;
                break;


            case 53:
                if (yyn == 53)

/* Line 351 of lalr1.java  */
/* Line 299 of "SHLang.yac"  */ {
                    System.out.println("Rule 20.1: " +
                            "expressions: constant_expressions");
                }
                ;
                break;


            case 54:
                if (yyn == 54)

/* Line 351 of lalr1.java  */
/* Line 303 of "SHLang.yac"  */ {
                    System.out.println("Rule 20.2: " +
                            "expressions: bool_expressions");
                }
                ;
                break;


            case 55:
                if (yyn == 55)

/* Line 351 of lalr1.java  */
/* Line 307 of "SHLang.yac"  */ {
                    System.out.println("Rule 20.3: " +
                            "expressions: arithmatic_expressions");
                }
                ;
                break;


            case 56:
                if (yyn == 56)

/* Line 351 of lalr1.java  */
/* Line 311 of "SHLang.yac"  */ {
                    System.out.println("Rule 20.4: " +
                            "expressions: IDENTIFIER");
                }
                ;
                break;


            case 57:
                if (yyn == 57)

/* Line 351 of lalr1.java  */
/* Line 315 of "SHLang.yac"  */ {
                    System.out.println("Rule 20.5: " +
                            "expressions: LP_KW expressions RP_KW");
                }
                ;
                break;


            case 58:
                if (yyn == 58)

/* Line 351 of lalr1.java  */
/* Line 321 of "SHLang.yac"  */ {
                    System.out.println("Rule 21.1: " +
                            "constant_expressions: INTEGER_CONSTANT");
                }
                ;
                break;


            case 59:
                if (yyn == 59)

/* Line 351 of lalr1.java  */
/* Line 325 of "SHLang.yac"  */ {
                    System.out.println("Rule 21.2: " +
                            "constant_expressions: REAL_CONSTANT");
                }
                ;
                break;


            case 60:
                if (yyn == 60)

/* Line 351 of lalr1.java  */
/* Line 329 of "SHLang.yac"  */ {
                    System.out.println("Rule 21.3: " +
                            "constant_expressions: CHAR_CONSTANT");
                }
                ;
                break;


            case 61:
                if (yyn == 61)

/* Line 351 of lalr1.java  */
/* Line 333 of "SHLang.yac"  */ {
                    System.out.println("Rule 21.4: " +
                            "constant_expressions: BOOLEAN_CONSTANT");
                }
                ;
                break;


            case 62:
                if (yyn == 62)

/* Line 351 of lalr1.java  */
/* Line 339 of "SHLang.yac"  */ {
                    System.out.println("Rule 22.1: " +
                            "bool_expressions: expressions LT_KW expressions");
                }
                ;
                break;


            case 63:
                if (yyn == 63)

/* Line 351 of lalr1.java  */
/* Line 343 of "SHLang.yac"  */ {
                    System.out.println("Rule 22.2: " +
                            "bool_expressions: expressions LE_KW expressions");
                }
                ;
                break;


            case 64:
                if (yyn == 64)

/* Line 351 of lalr1.java  */
/* Line 347 of "SHLang.yac"  */ {
                    System.out.println("Rule 22.3: " +
                            "bool_expressions: expressions GT_KW expressions");
                }
                ;
                break;


            case 65:
                if (yyn == 65)

/* Line 351 of lalr1.java  */
/* Line 351 of "SHLang.yac"  */ {
                    System.out.println("Rule 22.4: " +
                            "bool_expressions: expressions GE_KW expressions");
                }
                ;
                break;


            case 66:
                if (yyn == 66)

/* Line 351 of lalr1.java  */
/* Line 355 of "SHLang.yac"  */ {
                    System.out.println("Rule 22.5: " +
                            "bool_expressions: expressions EQ_KW expressions");
                }
                ;
                break;


            case 67:
                if (yyn == 67)

/* Line 351 of lalr1.java  */
/* Line 359 of "SHLang.yac"  */ {
                    System.out.println("Rule 22.6: " +
                            "bool_expressions: expressions NE_KW expressions");
                }
                ;
                break;


            case 68:
                if (yyn == 68)

/* Line 351 of lalr1.java  */
/* Line 363 of "SHLang.yac"  */ {
                    System.out.println("Rule 22.7: " +
                            "bool_expressions: expressions AND_KW expressions");
                }
                ;
                break;


            case 69:
                if (yyn == 69)

/* Line 351 of lalr1.java  */
/* Line 367 of "SHLang.yac"  */ {
                    System.out.println("Rule 22.8: " +
                            "bool_expressions: expressions OR_KW expressions");
                }
                ;
                break;


            case 70:
                if (yyn == 70)

/* Line 351 of lalr1.java  */
/* Line 371 of "SHLang.yac"  */ {
                    System.out.println("Rule 22.9: " +
                            "bool_expressions: expressions AND_THEN_KW expressions");
                }
                ;
                break;


            case 71:
                if (yyn == 71)

/* Line 351 of lalr1.java  */
/* Line 375 of "SHLang.yac"  */ {
                    System.out.println("Rule 22.10: " +
                            "bool_expressions: expressions OR_ELSE_KW expressions");
                }
                ;
                break;


            case 72:
                if (yyn == 72)

/* Line 351 of lalr1.java  */
/* Line 379 of "SHLang.yac"  */ {
                    System.out.println("Rule 22.11: " +
                            "bool_expressions: expressions NOT_KW expressions");
                }
                ;
                break;


            case 73:
                if (yyn == 73)

/* Line 351 of lalr1.java  */
/* Line 385 of "SHLang.yac"  */ {
                    System.out.println("Rule 23.1: " +
                            "arithmatic_expressions: expressions ADD_KW expressions");
                }
                ;
                break;


            case 74:
                if (yyn == 74)

/* Line 351 of lalr1.java  */
/* Line 389 of "SHLang.yac"  */ {
                    System.out.println("Rule 23.2: " +
                            "arithmatic_expressions: expressions SUB_KW expressions");
                }
                ;
                break;


            case 75:
                if (yyn == 75)

/* Line 351 of lalr1.java  */
/* Line 393 of "SHLang.yac"  */ {
                    System.out.println("Rule 23.3: " +
                            "arithmatic_expressions: expressions MUL_KW expressions");
                }
                ;
                break;


            case 76:
                if (yyn == 76)

/* Line 351 of lalr1.java  */
/* Line 397 of "SHLang.yac"  */ {
                    System.out.println("Rule 23.3: " +
                            "arithmatic_expressions: expressions DIV_KW expressions");
                }
                ;
                break;


            case 77:
                if (yyn == 77)

/* Line 351 of lalr1.java  */
/* Line 401 of "SHLang.yac"  */ {
                    System.out.println("Rule 23.5: " +
                            "arithmatic_expressions: expressions MOD_KW expressions");
                }
                ;
                break;


            case 78:
                if (yyn == 78)

/* Line 351 of lalr1.java  */
/* Line 405 of "SHLang.yac"  */ {
                    System.out.println("Rule 23.6: " +
                            "arithmatic_expressions: SUB_KW expressions");
                }
                ;
                break;




/* Line 351 of lalr1.java  */
/* Line 1318 of "SHLang.cac"  */
            default:
                break;
        }

        yy_symbol_print("-> $$ =", yyr1_[yyn], yyval);

        yystack.pop(yylen);
        yylen = 0;

    /* Shift the result of the reduction.  */
        yyn = yyr1_[yyn];
        int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt(0);
        if (0 <= yystate && yystate <= yylast_
                && yycheck_[yystate] == yystack.stateAt(0))
            yystate = yytable_[yystate];
        else
            yystate = yydefgoto_[yyn - yyntokens_];

        yystack.push(yystate, yyval);
        return YYNEWSTATE;
    }

    /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
    private final String yytnamerr_(String yystr) {
        if (yystr.charAt(0) == '"') {
            StringBuffer yyr = new StringBuffer();
            strip_quotes:
            for (int i = 1; i < yystr.length(); i++)
                switch (yystr.charAt(i)) {
                    case '\'':
                    case ',':
                        break strip_quotes;

                    case '\\':
                        if (yystr.charAt(++i) != '\\')
                            break strip_quotes;
              /* Fall through.  */
                    default:
                        yyr.append(yystr.charAt(i));
                        break;

                    case '"':
                        return yyr.toString();
                }
        } else if (yystr.equals("$end"))
            return "end of input";

        return yystr;
    }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

    private void yy_symbol_print(String s, int yytype,
                                 Object yyvaluep) {
        if (yydebug > 0)
            yycdebug(s + (yytype < yyntokens_ ? " token " : " nterm ")
                    + yytname_[yytype] + " ("
                    + (yyvaluep == null ? "(null)" : yyvaluep.toString()) + ")");
    }

    /**
     * Parse input from the scanner that was specified at object construction
     * time.  Return whether the end of the input was reached successfully.
     *
     * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
     * imply that there were no syntax errors.
     */
    public boolean parse() throws java.io.IOException {
        /// Lookahead and lookahead in internal form.
        int yychar = yyempty_;
        int yytoken = 0;

    /* State.  */
        int yyn = 0;
        int yylen = 0;
        int yystate = 0;

        YYStack yystack = new YYStack();

    /* Error handling.  */
        int yynerrs_ = 0;


        /// Semantic value of the lookahead.
        Object yylval = null;

        int yyresult;

        yycdebug("Starting parse\n");
        yyerrstatus_ = 0;


    /* Initialize the stack.  */
        yystack.push(yystate, yylval);

        int label = YYNEWSTATE;
        for (; ; )
            switch (label) {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
       pushed when we come here.  */
                case YYNEWSTATE:
                    yycdebug("Entering state " + yystate + "\n");
                    if (yydebug > 0)
                        yystack.print(yyDebugStream);

        /* Accept?  */
                    if (yystate == yyfinal_)
                        return true;

        /* Take a decision.  First try without lookahead.  */
                    yyn = yypact_[yystate];
                    if (yy_pact_value_is_default_(yyn)) {
                        label = YYDEFAULT;
                        break;
                    }

        /* Read a lookahead token.  */
                    if (yychar == yyempty_) {
                        yycdebug("Reading a token: ");
                        yychar = yylex();

                        yylval = yylexer.getLVal();
                    }

        /* Convert token to internal form.  */
                    if (yychar <= EOF) {
                        yychar = yytoken = EOF;
                        yycdebug("Now at end of input.\n");
                    } else {
                        yytoken = yytranslate_(yychar);
                        yy_symbol_print("Next token is", yytoken,
                                yylval);
                    }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
                    yyn += yytoken;
                    if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
                        label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
                    else if ((yyn = yytable_[yyn]) <= 0) {
                        if (yy_table_value_is_error_(yyn))
                            label = YYERRLAB;
                        else {
                            yyn = -yyn;
                            label = YYREDUCE;
                        }
                    } else {
            /* Shift the lookahead token.  */
                        yy_symbol_print("Shifting", yytoken,
                                yylval);

            /* Discard the token being shifted.  */
                        yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
                        if (yyerrstatus_ > 0)
                            --yyerrstatus_;

                        yystate = yyn;
                        yystack.push(yystate, yylval);
                        label = YYNEWSTATE;
                    }
                    break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
                case YYDEFAULT:
                    yyn = yydefact_[yystate];
                    if (yyn == 0)
                        label = YYERRLAB;
                    else
                        label = YYREDUCE;
                    break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
                case YYREDUCE:
                    yylen = yyr2_[yyn];
                    label = yyaction(yyn, yystack, yylen);
                    yystate = yystack.stateAt(0);
                    break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
                case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
                    if (yyerrstatus_ == 0) {
                        ++yynerrs_;
                        if (yychar == yyempty_)
                            yytoken = yyempty_;
                        yyerror(yysyntax_error(yystate, yytoken));
                    }


                    if (yyerrstatus_ == 3) {
        /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */

                        if (yychar <= EOF) {
	      /* Return failure if at end of input.  */
                            if (yychar == EOF)
                                return false;
                        } else
                            yychar = yyempty_;
                    }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
                    label = YYERRLAB1;
                    break;

      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
                case YYERROR:


        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
                    yystack.pop(yylen);
                    yylen = 0;
                    yystate = yystack.stateAt(0);
                    label = YYERRLAB1;
                    break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
                case YYERRLAB1:
                    yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */

                    for (; ; ) {
                        yyn = yypact_[yystate];
                        if (!yy_pact_value_is_default_(yyn)) {
                            yyn += yyterror_;
                            if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_) {
                                yyn = yytable_[yyn];
                                if (0 < yyn)
                                    break;
                            }
                        }

	    /* Pop the current state because it cannot handle the error token.  */
                        if (yystack.height == 1)
                            return false;


                        yystack.pop();
                        yystate = yystack.stateAt(0);
                        if (yydebug > 0)
                            yystack.print(yyDebugStream);
                    }



        /* Shift the error token.  */
                    yy_symbol_print("Shifting", yystos_[yyn],
                            yylval);

                    yystate = yyn;
                    yystack.push(yyn, yylval);
                    label = YYNEWSTATE;
                    break;

        /* Accept.  */
                case YYACCEPT:
                    return true;

        /* Abort.  */
                case YYABORT:
                    return false;
            }
    }

    // Generate an error message.
    private String yysyntax_error(int yystate, int tok) {
        if (errorVerbose) {
        /* There are many possibilities here to consider:
           - Assume YYFAIL is not used.  It's too flawed to consider.
             See
             <http://lists.gnu.org/archive/html/bison-patches/2009-12/msg00024.html>
             for details.  YYERROR is fine as it does not invoke this
             function.
           - If this state is a consistent state with a default action,
             then the only way this function was invoked is if the
             default action is an error action.  In that case, don't
             check for expected tokens because there are none.
           - The only way there can be no lookahead present (in tok) is
             if this state is a consistent state with a default action.
             Thus, detecting the absence of a lookahead is sufficient to
             determine that there is no unexpected or expected token to
             report.  In that case, just report a simple "syntax error".
           - Don't assume there isn't a lookahead just because this
             state is a consistent state with a default action.  There
             might have been a previous inconsistent state, consistent
             state with a non-default action, or user semantic action
             that manipulated yychar.  (However, yychar is currently out
             of scope during semantic actions.)
           - Of course, the expected token list depends on states to
             have correct lookahead information, and it depends on the
             parser not to perform extra reductions after fetching a
             lookahead from the scanner and before detecting a syntax
             error.  Thus, state merging (from LALR or IELR) and default
             reductions corrupt the expected token list.  However, the
             list is correct for canonical LR with one exception: it
             will still contain any token that will not be accepted due
             to an error action in a later state.
        */
            if (tok != yyempty_) {
                // FIXME: This method of building the message is not compatible
                // with internationalization.
                StringBuffer res =
                        new StringBuffer("syntax error, unexpected ");
                res.append(yytnamerr_(yytname_[tok]));
                int yyn = yypact_[yystate];
                if (!yy_pact_value_is_default_(yyn)) {
                /* Start YYX at -YYN if negative to avoid negative
                   indexes in YYCHECK.  In other words, skip the first
                   -YYN actions for this state because they are default
                   actions.  */
                    int yyxbegin = yyn < 0 ? -yyn : 0;
                /* Stay within bounds of both yycheck and yytname.  */
                    int yychecklim = yylast_ - yyn + 1;
                    int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
                    int count = 0;
                    for (int x = yyxbegin; x < yyxend; ++x)
                        if (yycheck_[x + yyn] == x && x != yyterror_
                                && !yy_table_value_is_error_(yytable_[x + yyn]))
                            ++count;
                    if (count < 5) {
                        count = 0;
                        for (int x = yyxbegin; x < yyxend; ++x)
                            if (yycheck_[x + yyn] == x && x != yyterror_
                                    && !yy_table_value_is_error_(yytable_[x + yyn])) {
                                res.append(count++ == 0 ? ", expecting " : " or ");
                                res.append(yytnamerr_(yytname_[x]));
                            }
                    }
                }
                return res.toString();
            }
        }

        return "syntax error";
    }

    /**
     * Whether the given <code>yypact_</code> value indicates a defaulted state.
     *
     * @param yyvalue the value to check
     */
    private static boolean yy_pact_value_is_default_(int yyvalue) {
        return yyvalue == yypact_ninf_;
    }

    /**
     * Whether the given <code>yytable_</code> value indicates a syntax error.
     *
     * @param yyvalue the value to check
     */
    private static boolean yy_table_value_is_error_(int yyvalue) {
        return yyvalue == yytable_ninf_;
    }

    /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
    private static final short yypact_ninf_ = -78;
    private static final short yypact_[] =
            {
                    2, -47, 31, 92, -78, -14, 7, -78, -78, -78,
                    -78, 120, -78, 9, 15, -78, 0, -78, 34, -14,
                    -78, 46, 52, 5, -78, 37, -14, -78, 104, -14,
                    33, 104, 104, 53, -78, -78, 96, -78, -6, 102,
                    36, 94, -78, -14, 169, -78, 9, 95, -78, 104,
                    104, -78, -78, -78, -78, -78, 162, -78, 124, -78,
                    122, 125, 121, -78, 162, 103, 104, -4, -78, 107,
                    -78, -78, 40, 20, -78, 25, 101, 105, 115, -78,
                    49, -78, 150, 116, 104, 104, 104, 104, 104, 104,
                    104, 104, 104, 104, 104, 104, 104, 104, 104, 104,
                    -14, 104, 221, 87, 67, 104, 162, -78, 148, 145,
                    -78, -78, 20, 117, -78, 126, 127, -78, 104, 142,
                    152, -78, 202, 202, 191, 191, 116, 32, 32, 32,
                    32, 32, 32, 41, 41, 116, 116, 116, 180, 188,
                    181, 204, 197, 172, 199, -78, 211, 222, -78, 193,
                    -78, -78, -78, 19, -78, 49, -14, -14, -14, 226,
                    -14, -78, -78, -78, -78, -78, -78, 229, -14, 230,
                    -78, 231, -78, -78
            };

    /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
    private static final byte yydefact_[] =
            {
                    0, 0, 0, 0, 1, 0, 0, 9, 10, 11,
                    12, 0, 7, 0, 0, 26, 0, 5, 0, 0,
                    6, 0, 17, 0, 14, 15, 0, 27, 0, 0,
                    0, 0, 0, 0, 34, 33, 0, 48, 0, 0,
                    0, 0, 4, 0, 0, 8, 0, 0, 3, 0,
                    0, 61, 60, 59, 58, 56, 0, 53, 54, 55,
                    0, 0, 0, 54, 46, 0, 0, 0, 32, 0,
                    35, 31, 0, 0, 2, 58, 56, 0, 55, 13,
                    0, 16, 0, 78, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0, 0, 37, 45, 49, 0,
                    36, 30, 0, 0, 19, 0, 0, 18, 0, 0,
                    25, 57, 68, 70, 69, 71, 72, 66, 67, 63,
                    62, 65, 64, 73, 74, 75, 76, 77, 38, 54,
                    58, 0, 0, 0, 0, 43, 0, 54, 44, 0,
                    29, 21, 20, 55, 23, 0, 0, 0, 0, 0,
                    0, 42, 47, 28, 24, 39, 41, 0, 0, 0,
                    50, 0, 52, 51
            };

    /* YYPGOTO[NTERM-NUM].  */
    private static final short yypgoto_[] =
            {
                    -78, -78, -32, -10, -78, 195, 217, -78, 163, -78,
                    109, 255, 39, -78, -5, -78, 232, -78, -78, -78,
                    24, -77, -26, -38
            };

    /* YYDEFGOTO[NTERM-NUM].  */
    private static final short
            yydefgoto_[] =
            {
                    -1, 2, 11, 12, 13, 23, 24, 25, 77, 81,
                    119, 14, 15, 41, 37, 38, 39, 109, 104, 146,
                    56, 57, 63, 59
            };

    /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
    private static final short yytable_ninf_ = -41;
    private static final short
            yytable_[] =
            {
                    17, 20, 58, 120, 28, 1, 78, 29, 72, 30,
                    28, 3, 31, 29, 42, 30, 32, 33, 31, 26,
                    6, 48, 32, 33, 60, 16, 7, 8, 9, 10,
                    34, 4, 107, 16, 68, 45, -22, 46, 74, 16,
                    35, 112, 7, 8, 9, 10, 7, 8, 9, 10,
                    43, 6, 36, 27, 22, 62, 64, -22, 36, 16,
                    27, 88, 20, 114, 78, 18, 115, 22, 113, 40,
                    88, 47, 71, 82, 83, 139, 111, 65, 120, 147,
                    153, 95, 96, 97, 98, 99, 143, 144, 145, 44,
                    106, 61, 97, 98, 99, 138, 5, 6, 7, 8,
                    9, 10, 20, 51, 52, 53, 54, 149, 122, 123,
                    124, 125, 126, 127, 128, 129, 130, 131, 132, 133,
                    134, 135, 136, 137, 19, 6, 7, 8, 9, 10,
                    66, 67, 70, 73, 80, 100, 101, 110, 105, 49,
                    103, 102, 116, 117, 142, 88, 84, 85, 86, 87,
                    88, 165, 166, 167, 50, 169, 118, 150, 51, 52,
                    53, 54, 55, 171, 89, 90, 91, 92, 93, 94,
                    95, 96, 97, 98, 99, 84, 85, 86, 87, 88,
                    46, 148, 154, 151, 155, 152, 121, 84, 85, 86,
                    87, 88, 156, 89, 90, 91, 92, 93, 94, 95,
                    96, 97, 98, 99, 49, 89, 90, 91, 92, 93,
                    94, 95, 96, 97, 98, 99, 84, 85, -40, 50,
                    88, 157, 115, 51, 52, 53, 75, 76, 158, 159,
                    160, 88, 161, 163, 89, 90, 91, 92, 93, 94,
                    95, 96, 97, 98, 99, 89, 90, 91, 92, 93,
                    94, 95, 96, 97, 98, 99, 49, 168, 162, 170,
                    172, 173, 108, 79, 164, 141, 21, 0, 0, 0,
                    69, 50, 0, 0, 0, 51, 52, 53, 140, 76
            };

    /* YYCHECK.  */
    private static final short
            yycheck_[] =
            {
                    5, 11, 28, 80, 10, 3, 44, 13, 40, 15,
                    10, 58, 18, 13, 19, 15, 22, 23, 18, 4,
                    5, 26, 22, 23, 29, 39, 6, 7, 8, 9,
                    30, 0, 36, 39, 40, 30, 17, 32, 43, 39,
                    40, 73, 6, 7, 8, 9, 6, 7, 8, 9,
                    4, 5, 58, 14, 58, 31, 32, 38, 58, 39,
                    21, 29, 72, 38, 102, 58, 41, 58, 73, 35,
                    29, 34, 36, 49, 50, 101, 36, 24, 155, 105,
                    118, 49, 50, 51, 52, 53, 19, 20, 21, 37,
                    66, 58, 51, 52, 53, 100, 4, 5, 6, 7,
                    8, 9, 112, 54, 55, 56, 57, 112, 84, 85,
                    86, 87, 88, 89, 90, 91, 92, 93, 94, 95,
                    96, 97, 98, 99, 4, 5, 6, 7, 8, 9,
                    34, 35, 30, 39, 39, 11, 14, 30, 35, 35,
                    19, 16, 41, 38, 57, 29, 25, 26, 27, 28,
                    29, 156, 157, 158, 50, 160, 41, 40, 54, 55,
                    56, 57, 58, 168, 43, 44, 45, 46, 47, 48,
                    49, 50, 51, 52, 53, 25, 26, 27, 28, 29,
                    32, 36, 40, 57, 32, 58, 36, 25, 26, 27,
                    28, 29, 12, 43, 44, 45, 46, 47, 48, 49,
                    50, 51, 52, 53, 35, 43, 44, 45, 46, 47,
                    48, 49, 50, 51, 52, 53, 25, 26, 30, 50,
                    29, 17, 41, 54, 55, 56, 57, 58, 31, 57,
                    31, 29, 21, 40, 43, 44, 45, 46, 47, 48,
                    49, 50, 51, 52, 53, 43, 44, 45, 46, 47,
                    48, 49, 50, 51, 52, 53, 35, 31, 36, 30,
                    30, 30, 67, 46, 155, 102, 11, -1, -1, -1,
                    38, 50, -1, -1, -1, 54, 55, 56, 57, 58
            };

    /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
    private static final byte
            yystos_[] =
            {
                    0, 3, 61, 58, 0, 4, 5, 6, 7, 8,
                    9, 62, 63, 64, 71, 72, 39, 74, 58, 4,
                    63, 71, 58, 65, 66, 67, 4, 72, 10, 13,
                    15, 18, 22, 23, 30, 40, 58, 74, 75, 76,
                    35, 73, 74, 4, 37, 30, 32, 34, 74, 35,
                    50, 54, 55, 56, 57, 58, 80, 81, 82, 83,
                    74, 58, 80, 82, 80, 24, 34, 35, 40, 76,
                    30, 36, 62, 39, 74, 57, 58, 68, 83, 66,
                    39, 69, 80, 80, 25, 26, 27, 28, 29, 43,
                    44, 45, 46, 47, 48, 49, 50, 51, 52, 53,
                    11, 14, 16, 19, 78, 35, 80, 36, 65, 77,
                    30, 36, 62, 74, 38, 41, 41, 38, 41, 70,
                    81, 36, 80, 80, 80, 80, 80, 80, 80, 80,
                    80, 80, 80, 80, 80, 80, 80, 80, 74, 82,
                    57, 68, 57, 19, 20, 21, 79, 82, 36, 74,
                    40, 57, 58, 83, 40, 32, 12, 17, 31, 57,
                    31, 21, 36, 40, 70, 74, 74, 74, 31, 74,
                    30, 74, 30, 30
            };

    /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
    private static final short
            yytoken_number_[] =
            {
                    0, 256, 257, 258, 259, 260, 261, 262, 263, 264,
                    265, 266, 267, 268, 269, 270, 271, 272, 273, 274,
                    275, 276, 277, 278, 279, 280, 281, 282, 283, 284,
                    285, 286, 287, 288, 289, 290, 291, 292, 293, 294,
                    295, 296, 297, 298, 299, 300, 301, 302, 303, 304,
                    305, 306, 307, 308, 309, 310, 311, 312, 313, 314
            };

    /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
    private static final byte
            yyr1_[] =
            {
                    0, 60, 61, 61, 61, 61, 62, 62, 63, 64,
                    64, 64, 64, 65, 65, 66, 66, 67, 67, 67,
                    68, 68, 68, 69, 70, 70, 71, 71, 72, 72,
                    73, 73, 74, 74, 75, 75, 75, 76, 76, 76,
                    76, 76, 76, 76, 76, 76, 76, 76, 76, 77,
                    78, 78, 79, 80, 80, 80, 80, 80, 81, 81,
                    81, 81, 82, 82, 82, 82, 82, 82, 82, 82,
                    82, 82, 82, 83, 83, 83, 83, 83, 83
            };

    /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
    private static final byte
            yyr2_[] =
            {
                    0, 2, 6, 5, 5, 4, 2, 1, 3, 1,
                    1, 1, 1, 3, 1, 1, 3, 1, 4, 4,
                    3, 3, 3, 3, 3, 1, 1, 2, 7, 6,
                    3, 2, 3, 2, 1, 2, 3, 3, 4, 6,
                    4, 6, 5, 4, 4, 3, 2, 5, 1, 1,
                    5, 6, 4, 1, 1, 1, 1, 3, 1, 1,
                    1, 1, 3, 3, 3, 3, 3, 3, 3, 3,
                    3, 3, 3, 3, 3, 3, 3, 3, 2
            };

    /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
    private static final String yytname_[] =
            {
                    "$end", "error", "$undefined", "PROGRAM_KW", "MAIN_KW", "PROCEDURE_KW",
                    "INTEGER_KW", "REAL_KW", "CHAR_KW", "BOOLEAN_KW", "IF_KW", "THEN_KW",
                    "ELSE_KW", "DO_KW", "WHILE_KW", "FOR_KW", "IN_KW", "REPEAT_KW",
                    "SWITCH_KW", "CASE_KW", "DEFAULT_KW", "END_KW", "RETURN_KW", "EXIT_KW",
                    "WHEN_KW", "AND_KW", "AND_THEN_KW", "OR_KW", "OR_ELSE_KW", "NOT_KW",
                    "SEMICOLON_KW", "COLON_KW", "COMMA_KW", "SINGLE_QUOTE_KW", "ASS_KW",
                    "LP_KW", "RP_KW", "LB_KW", "RB_KW", "LCB_KW", "RCB_KW", "TWO_DOTS_KW",
                    "DOT_KW", "EQ_KW", "NE_KW", "LE_KW", "LT_KW", "GE_KW", "GT_KW", "ADD_KW",
                    "SUB_KW", "MUL_KW", "DIV_KW", "MOD_KW", "BOOLEAN_CONSTANT",
                    "CHAR_CONSTANT", "REAL_CONSTANT", "INTEGER_CONSTANT", "IDENTIFIER",
                    "usub", "$accept", "program", "declarations_list", "declarations",
                    "type_specifiers", "declarator_list", "declarator", "dec", "range",
                    "initializer", "initializer_list", "procedure_list", "procedure",
                    "parameters", "block", "statement_list", "statement", "arguments",
                    "caseelement", "default", "expressions", "constant_expressions",
                    "bool_expressions", "arithmatic_expressions", null
            };

    /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
    private static final byte yyrhs_[] =
            {
                    61, 0, -1, 3, 58, 62, 71, 4, 74, -1,
                    3, 58, 71, 4, 74, -1, 3, 58, 62, 4,
                    74, -1, 3, 58, 4, 74, -1, 62, 63, -1,
                    63, -1, 64, 65, 30, -1, 6, -1, 7, -1,
                    8, -1, 9, -1, 65, 32, 66, -1, 66, -1,
                    67, -1, 67, 34, 69, -1, 58, -1, 58, 37,
                    68, 38, -1, 58, 37, 57, 38, -1, 58, 41,
                    58, -1, 57, 41, 57, -1, 83, 41, 83, -1,
                    39, 70, 40, -1, 81, 32, 70, -1, 81, -1,
                    72, -1, 71, 72, -1, 5, 58, 73, 39, 62,
                    74, 40, -1, 5, 58, 73, 39, 74, 40, -1,
                    35, 62, 36, -1, 35, 36, -1, 39, 75, 40,
                    -1, 39, 40, -1, 30, -1, 76, 30, -1, 75,
                    76, 30, -1, 58, 34, 80, -1, 10, 82, 11,
                    74, -1, 10, 82, 11, 74, 12, 74, -1, 13,
                    74, 14, 82, -1, 15, 58, 16, 68, 17, 74,
                    -1, 18, 80, 78, 79, 21, -1, 18, 80, 78,
                    21, -1, 58, 35, 77, 36, -1, 58, 35, 36,
                    -1, 22, 80, -1, 23, 24, 35, 82, 36, -1,
                    74, -1, 65, -1, 19, 57, 31, 74, 30, -1,
                    78, 19, 57, 31, 74, 30, -1, 20, 31, 74,
                    30, -1, 81, -1, 82, -1, 83, -1, 58, -1,
                    35, 80, 36, -1, 57, -1, 56, -1, 55, -1,
                    54, -1, 80, 46, 80, -1, 80, 45, 80, -1,
                    80, 48, 80, -1, 80, 47, 80, -1, 80, 43,
                    80, -1, 80, 44, 80, -1, 80, 25, 80, -1,
                    80, 27, 80, -1, 80, 26, 80, -1, 80, 28,
                    80, -1, 80, 29, 80, -1, 80, 49, 80, -1,
                    80, 50, 80, -1, 80, 51, 80, -1, 80, 52,
                    80, -1, 80, 53, 80, -1, 50, 80, -1
            };

    /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
    private static final short yyprhs_[] =
            {
                    0, 0, 3, 10, 16, 22, 27, 30, 32, 36,
                    38, 40, 42, 44, 48, 50, 52, 56, 58, 63,
                    68, 72, 76, 80, 84, 88, 90, 92, 95, 103,
                    110, 114, 117, 121, 124, 126, 129, 133, 137, 142,
                    149, 154, 161, 167, 172, 177, 181, 184, 190, 192,
                    194, 200, 207, 212, 214, 216, 218, 220, 224, 226,
                    228, 230, 232, 236, 240, 244, 248, 252, 256, 260,
                    264, 268, 272, 276, 280, 284, 288, 292, 296
            };

    /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
    private static final short yyrline_[] =
            {
                    0, 57, 57, 61, 65, 69, 75, 79, 85, 91,
                    95, 99, 103, 109, 113, 119, 123, 129, 133, 137,
                    143, 147, 151, 157, 163, 167, 173, 177, 183, 187,
                    193, 197, 203, 207, 213, 217, 221, 227, 231, 235,
                    239, 243, 247, 251, 255, 259, 263, 267, 271, 277,
                    283, 287, 293, 299, 303, 307, 311, 315, 321, 325,
                    329, 333, 339, 343, 347, 351, 355, 359, 363, 367,
                    371, 375, 379, 385, 389, 393, 397, 401, 405
            };

    // Report on the debug stream that the rule yyrule is going to be reduced.
    private void yy_reduce_print(int yyrule, YYStack yystack) {
        if (yydebug == 0)
            return;

        int yylno = yyrline_[yyrule];
        int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
        yycdebug("Reducing stack by rule " + (yyrule - 1)
                + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
        for (int yyi = 0; yyi < yynrhs; yyi++)
            yy_symbol_print("   $" + (yyi + 1) + " =",
                    yyrhs_[yyprhs_[yyrule] + yyi],
                    ((yystack.valueAt(yynrhs - (yyi + 1)))));
    }

    /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
    private static final byte yytranslate_table_[] =
            {
                    0, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
                    2, 2, 2, 2, 2, 2, 1, 2, 3, 4,
                    5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
                    15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                    25, 26, 27, 28, 29, 30, 31, 32, 33, 34,
                    35, 36, 37, 38, 39, 40, 41, 42, 43, 44,
                    45, 46, 47, 48, 49, 50, 51, 52, 53, 54,
                    55, 56, 57, 58, 59
            };

    private static final byte yytranslate_(int t) {
        if (t >= 0 && t <= yyuser_token_number_max_)
            return yytranslate_table_[t];
        else
            return yyundef_token_;
    }

    private static final int yylast_ = 279;
    private static final int yynnts_ = 24;
    private static final int yyempty_ = -2;
    private static final int yyfinal_ = 4;
    private static final int yyterror_ = 1;
    private static final int yyerrcode_ = 256;
    private static final int yyntokens_ = 60;

    private static final int yyuser_token_number_max_ = 314;
    private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */

/* Line 927 of lalr1.java  */
/* Line 8 of "SHLang.yac"  */

    static PrintStream writer;

    public static void main(String args[]) throws IOException, FileNotFoundException {
        YYParser yyparser;
        final Yylex lexer;

        writer = new PrintStream(new File("output.txt"));
        lexer = new Yylex(new InputStreamReader(new FileInputStream(".\\files\\Code.shl")));

        yyparser = new YYParser(new Lexer() {

            @Override
            public int yylex() {
                int yyl_return = -1;
                try {

                    yyl_return = lexer.yylex();
                } catch (IOException e) {
                    System.err.println("IO error :" + e);
                }
                return yyl_return;
            }

            @Override
            public void yyerror(String error) {
                System.err.println("Error : " + error);
            }

            @Override
            public Object getLVal() {
                return null;
            }
        });
        yyparser.parse();

        return;
    }



/* Line 927 of lalr1.java  */
/* Line 2133 of "SHLang.cac"  */

}


