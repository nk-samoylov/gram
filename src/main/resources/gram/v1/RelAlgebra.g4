grammar RelAlgebra;

//importing the lexer rules defined in MongoLex.g4
import RelLex;

/*
 * This file defines the grammar rules required to parse
 * the relational algebra expressions from the input
 * accepted by the user
 */

complex_query
:
    simple_query ((UNION | MINUS | INTERSECT) simple_query)+
;

simple_query
:
	select | project | natural | cartesian
;

// select rule to parse selection expression consisting of
// select token, predicate and relation in parentheses
select
:
	SELECT where_clause '(' relation ')'
;

// project rule to parse projection expression consisting of
// project token, list of attribute names taken as a predicate
// and relation in parentheses
project
:
	PROJECT attr_list '(' relation ')'
;

// natural rule to parse natural join expression consisting of
// natural token, relation 1 and relation 2
natural
:
	NATURAL predicate '(' relation ',' relation ')'
;

// cartesian rule to parse cartesian product expression consisting
// of cartesian token followed by list of relations
cartesian
:
	CARTESIAN '(' relation (',' relation)* ')'
;

// relation rule saying that relation can be a simple name of a relation
// or it can be an expression in itself
relation
:
	relation_name #simple | simple_query #nested
	
;

attr_list:
	'[' attr (',' attr)* ']'
;

where_clause
:
	'[' predicate? ']'
;

predicate
:
	expression (log_op expression)*
;

expression:
	operand cmp_op operand
;

operand:
	attr | const_operand
;

const_operand:
	INT_NUMBER | FLOAT_NUMBER | STRING
;

//attribute token to recognize valid attribute names
attr:
	(relation_name'.')?ID
;

relation_name:
    ID
;

log_op
:
	crisp_log_op | fuzzy_log_op
;

crisp_log_op
:
	'and' | 'or'
;

fuzzy_log_op
:
	fz_and | fz_or
;


fz_and
:
	'~and'
;

fz_or
:
	'~or'
;

cmp_op
:
	crisp_cmp_op | fuzzy_cmp_op
;

crisp_cmp_op
:
	'>' | '<' | '=' | '!=' | '>=' | '<='
;

fuzzy_cmp_op
:
	fz_gt | fz_lt | fz_eq | fz_neq | fz_gte | fz_lte
;

fz_gt
:
	'~>'
;

fz_lt
:
	'~<'
;

fz_eq
:
	'~='
;

fz_neq
:
	'~!='
;

fz_gte
:
	'~>='
;

fz_lte
:
	'~<='
;