# Compiler-Project (SHLang)
Project of Compiler Design Course (BSc)

Contributors:
    -Saeid Dadkhah (saeid.dadkhah@live.com)
    -Hasti Sharifi (hastisharifi75@gmail.com)

Base input grammer is in the repository but it has some changes.
    -statements -> IDENTIFER[expressions] := expressions
    -expressions -> IDENTIFIER[expressions]

1. Use JFlex to process "SHLang.lex".
    Outputs:    -Yylex.java

2. Use this command with bison to process "SHLang.yac"
    Command: bison -L JAVA SHLang.yac -v
        -v will generate *.output file.
    Outputs:    -SHLang.cac (Rename this to "SHLang.java")
                -SHLang.output (It's optional output made by bison. This file can be generated with -v option.)

3. Build Yylex.java and SHLang.java (Rename *.cac output of bison to *.java).

4. File address of input and output codes are hard coded in first lines of SHLang.java.

5. Compile output.c file with GCC.
