grammar AlgebraGram;

import AlgebraLex;

query
:
    simpleQuery (setOp simpleQuery)*
;

simpleQuery
:
 	minus | intersect | union | times | project | natural | select
;

times
:
	relationName TIMES relationName
;

union
:
	relationName UNION relationName
;

minus
:
	relationName MINUS relationName
;

intersect
:
	relationName INTERSECT relationName
;

setOp
:
    UNION | MINUS | INTERSECT | TIMES
;

select
:
	relationName whereClause?
;

project
:
	relationName PROJECT attrList
;

natural
:
	relationName NATURAL relationName whereClause
;

attrList:
	attr (',' attr)*
;

whereClause
:
	'where' predicate
;

predicate
:
	expression (log_op expression)*
;

expression:
	operand cmp_op operand
;

operand:
	attr | constOperand
;

constOperand:
	INT_NUMBER | FLOAT_NUMBER | STRING
;

attr:
	(relationName'.')?ID
;

relationName:
    ID
;

log_op
:
	crisp_log_op
;

crisp_log_op
:
	AND | OR | NOT
;

cmp_op
:
	crisp_cmp_op
;

crisp_cmp_op
:
	GT | LT | EQ | NEQ | GTE | LTE
;