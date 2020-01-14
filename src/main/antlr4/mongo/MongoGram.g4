grammar MongoGram;

import MongoLex;

select
:
	SELECT attrList FROM collectionName whereClause?
;

attrList
:
	allAttrsClause | attr (',' attr)*
;

allAttrsClause
:
    (collectionName'.')?ALL_ATTRS
;

whereClause
:
	WHERE predicate
;

predicate
:
    expression
	| notOp predicate
	| predicate andOp predicate
	| predicate orOp predicate
	| LPAREN predicate RPAREN
;

expression
:
    operand (cCmpOp | fCmpOp) operand
;

operand
:
	attr | constOperand
;

constOperand
:
	INT_NUMBER | FLOAT_NUMBER | STRING
;

attr
:
	(collectionName'.')?ID
;

collectionName
:
    ID
;

notOp
:
    NOT
;

andOp
:
    AND
;

orOp
:
    OR
;

cCmpOp
:
	GT | LT | EQ | NEQ | GTE | LTE
;

fCmpOp
:
	FGT | FLT | FEQ | FNEQ | FGTE | FLTE
;