grammar Titan;
/*
 * Parser Rules
 */

@header {
    import com.titan.intermediate.*;
    import com.titan.intermediate.symtabimpl.*;
}

className : 'program' ID NEWLINE*  prog ;
prog : 'main' '{' block '}' NEWLINE* (functionDeclaration NEWLINE*)*;

block : stat+ ;

stat  : expr NEWLINE
      | assignment
      | declaration
      | conditional
      | retStat
      | loop
      | NEWLINE
      ;

expr locals [ TypeSpec type = null ]
     : simpleExpression             #SimpleExpr
     | boolExprs                    #BoolExpr
     | '(' expr ')'                 #ParenExpr
     ;

simpleExpression locals [ TypeSpec type = null ]
           : simpleExpression op=(MUL|DIV) simpleExpression  #MulDivOp
           | simpleExpression op=(ADD|SUB) simpleExpression        #AddSubOp
           | simpleExpression MOD simpleExpression                 #ModOp
           | stringExpr                                            #String
           | '(' simpleExpression ')'                              #SimpleExprParen
           | functionCall                                          #FuncCall
           | number                                                #Literal
           | ID                                                    #Identifier
           ;

comparison :     simpleExpression COMPARISON_OP simpleExpression
           | '(' simpleExpression COMPARISON_OP simpleExpression ')'
           ;

boolExprs locals [ TypeSpec type = null ]
          : '(' boolExprs ')'              #BoolParen
          | boolExprs op=BOOLAND boolExprs #BoolAnd
          | boolExprs op=BOOLOR boolExprs  #BoolOr
          | BOOLVALUES                     #BoolLiteral
          | ID                             #BoolIdentifier
          | comparison                     #ComparisonExpr
          ;

conditional : 'if' boolExprs NEWLINE? '{' block '}' (NEWLINE? 'else' NEWLINE? '{' block '}')?     #IfElseBrackets
            | 'if' boolExprs NEWLINE? stat (NEWLINE? 'else' NEWLINE? stat)?                       #IfElseNoBrackets
            ;

loop : 'for' ID 'from' simpleExpression 'to' simpleExpression NEWLINE? '{' block '}' ;

functionDeclaration : 'function' funcReturnTypes ID '(' args ')' NEWLINE? '{' block '}' ;

args : argDecl
     | args ',' argDecl;

argDecl : primitives ref='&'? ID ;

declaration : CONST? primitives ID ('=' expr)? NEWLINE;

assignment : ID '=' expr NEWLINE
           | shorthandAssignment NEWLINE
           | ID AssignmentOp expr NEWLINE
           ;

shorthandAssignment : ID SHORTHANDASSIGNOP ;
primitives : (INT|BOOL|STRING|FLOAT) ;
funcReturnTypes : primitives | 'void' ;

retStat: 'return' expr NEWLINE;

functionCall locals [ TypeSpec type = null ]
             : 'printf(' printfexprList ')'      #Printf
             | ID '('exprList ')'                #RegularFunction
             ;

stringExpr : STRINGLIT;

printfexprList : expr
               | printfexprList ',' expr ;

exprList : expr
         | exprList ',' expr ;

number locals [ TypeSpec type = null ]
       : DIGITS          #Integer
       | FLOATINGNUMBER  #Float
       | EXPNUM          #Exponential
       ;

/*
 * Lexer Rules
 */


MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
MOD : '%' ;

CONST : 'const' ;
INT : 'int' ;
BOOL : 'bool' ;
CHAR : 'char' ;
FLOAT : 'float' ;
STRING: 'string' ;
BOOLVALUES: 'true'|'false' ;
BOOLAND: '&&' ;
BOOLOR: '||' ;
AssignmentOp : PLUS_EQ|MINUS_EQ|MUL_EQ|DIV_EQ ;

PLUS_EQ : '+=' ;
MINUS_EQ : '-=' ;
MUL_EQ : '*=' ;
DIV_EQ : '/=' ;

EXPNUM : (FLOATINGNUMBER|DIGITS) [Ee] DIGITS ;
SHORTHANDASSIGNOP : PLUSPLUS|MINUSMINUS;
PLUSPLUS : '++' ;
MINUSMINUS : '--' ;
COMPARISON_OP : '<'|'<='|'>'|'>='|'=='|'!=';
ID : WORD+ (DIGITS|WORD)* ;
WORD : [a-zA-Z_] ;
FLOATINGNUMBER : DIGITS? '.' DIGITS
               | DIGITS '.'
               ;
DIGITS : [0-9]+ ;


NEWLINE : '\r'? '\n' ;
WHITESPACE : (' '|'\t') -> skip ;
LINECOMMENT :   '//' ~[\r\n]* -> skip ;
BLOCKCOMMENT :   '/*' .*? '*/' -> skip ;

STRINGLIT: '"' ( '\\' [btnfr"'\\] | ~[\r\n\\"] )* '"';
