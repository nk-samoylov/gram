lexer grammar MongoLex;

/*
 * This file defines the valid lexicons which the relational
 * algebra interpreter will recognize and tokenize.
 * Care has been taken to make the lexicons case-insensitive
 * just the way tokens are treated by PostgreSQL
 */

//select token for the selection expression
SELECT
:
	S E L E C T
;

FROM
:
    F R O M
;

WHERE
:
    W H E R E
;

AND
:
    A N D
;

OR
:
    O R
;

NOT
:
    N O T
;

ALL_ATTRS
:
    '*'
;

GT
:
    '>'
;

LT
:
    '<'
;

EQ
:
    '='
;

NEQ
:
    '!='
;

GTE
:
    '>='
;

LTE
:
    '<='
;

FGT
:
    '~>'
;

FLT
:
    '<~'
;

FEQ
:
    '~='
;

FNEQ
:
    '~!='
;

FGTE
:
    '~>='
;

FLTE
:
    '<=~'
;

LPAREN
:
    '('
;

RPAREN
:
    ')'
;
//relation token to recognize valid relation names
ID: LETTER (LETTER|DIGIT)*;

LETTER: [a-zA-Z_];

STRING: 'N'? '\'' (~'\'' | '\'\'')* '\'';

FLOAT_NUMBER:  (INT_NUMBER '.' INT_NUMBER);

INT_NUMBER: DIGIT+;

DIGIT: [0-9];

//lexer rule to skip whitespaces, newlines and carriage returns
WS
:
	[ \t\r\n]+ -> skip
;


//fragments defined to make the input case-insensitive
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');
