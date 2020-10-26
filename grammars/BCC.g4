grammar BCC; // Define a grammar called

prog: fndeclList* mainProg | EOF; // match keyword
varDecl:
	ID TK_DOSPUNTOS DATATYPE (TK_COMA ID TK_DOSPUNTOS DATATYPE)*;
fndeclList:
	FUNCTION FID TK_DOSPUNTOS DATATYPE TK_PAR_IZQ (varDecl)? TK_PAR_DER (
		VAR varDecl TK_PUNTOYCOMA
	)? stmtBlock;
stmtBlock: TK_LLAVE_IZQ stmt+ TK_LLAVE_DER | stmt;
stmt:
	PRINT lexpr TK_PUNTOYCOMA
	| INPUT ID TK_PUNTOYCOMA
	| WHEN TK_PAR_IZQ lexpr TK_PAR_DER DO stmtBlock
	| IF TK_PAR_IZQ lexpr TK_PAR_DER DO stmtBlock ELSE stmtBlock
	| UNLESS TK_PAR_IZQ lexpr TK_PAR_DER DO stmtBlock
	| WHILE TK_PAR_IZQ lexpr TK_PAR_DER DO stmtBlock
	| RETURN lexpr TK_PUNTOYCOMA
	| UNTIL TK_PAR_IZQ lexpr TK_PAR_DER DO stmtBlock
	| LOOP stmtBlock
	| DO stmtBlock WHILE TK_PAR_IZQ lexpr TK_PAR_DER
	| DO stmtBlock UNTIL TK_PAR_IZQ lexpr TK_PAR_DER
	| REPEAT NUM TK_DOSPUNTOS stmtBlock
	| FOR TK_PAR_IZQ assignexpr TK_PUNTOYCOMA lexpr TK_PUNTOYCOMA lexpr TK_PAR_DER DO stmtBlock
	| NEXT TK_PUNTOYCOMA
	| BREAK TK_PUNTOYCOMA
	| ID TK_ASIGNACION lexpr TK_PUNTOYCOMA //lexp
	| ID TK_SUM_ASIG lexpr TK_PUNTOYCOMA
	| ID TK_RES_ASIG lexpr TK_PUNTOYCOMA
	| ID TK_MUL_ASIG lexpr TK_PUNTOYCOMA
	| ID TK_DIV_ASIG lexpr TK_PUNTOYCOMA
	| ID TK_MOD_ASIG lexpr TK_PUNTOYCOMA
	| ID TK_INCREMENTO TK_PUNTOYCOMA
	| ID TK_DECREMENTO TK_PUNTOYCOMA
	| TK_DECREMENTO ID TK_PUNTOYCOMA
	| TK_INCREMENTO ID TK_PUNTOYCOMA;

assignexpr: ID TK_ASIGNACION lexpr;
lexpr: nexpr ((AND nexpr)* | (OR nexpr)*)?;
nexpr: NOT TK_PAR_IZQ lexpr TK_PAR_DER | rexpr;
rexpr:
	simpleExpr (
		(
			TK_MENOR
			| TK_IGUALDAD
			| TK_MENOR_IGUAL
			| TK_MAYOR
			| TK_MAYOR_IGUAL
			| TK_DIFERENTE
		) simpleExpr
	)?;
simpleExpr: term ((TK_MAS | TK_MENOS) term)*;
term: factor ((TK_MUL | TK_DIV | TK_MOD) factor)*;
factor:
	NUM
	| BOOL
	| ID (TK_INCREMENTO | TK_DECREMENTO)
	| (TK_INCREMENTO | TK_DECREMENTO) ID
	| ID
	| TK_PAR_IZQ lexpr TK_PAR_DER
	| FID TK_PAR_IZQ (lexpr (TK_COMA lexpr)*)? TK_PAR_DER;
mainProg: (VAR varDecl TK_PUNTOYCOMA)? stmt* END;

BOOL: 'true' | 'false';
DATATYPE: 'num' | 'bool';

TK_DOSPUNTOS: ':';
TK_COMA: ',';
TK_PUNTOYCOMA: ';';
TK_ASIGNACION: ':=';
TK_PAR_IZQ: '(';
TK_PAR_DER: ')';
TK_MENOR: '<';
TK_MENOR_IGUAL: '<=';
TK_SUM_ASIG: '+=';
TK_RES_ASIG: '-=';
TK_MUL_ASIG: '*=';
TK_DIV_ASIG: '/=';
TK_MOD_ASIG: '%=';
TK_DIFERENTE: '!=';
TK_IGUALDAD: '==';
TK_MAYOR: '>';
TK_MAYOR_IGUAL: '>=';
TK_LLAVE_IZQ: '{';
TK_LLAVE_DER: '}';
TK_MAS: '+';
TK_MENOS: '-';
TK_MUL: '*';
TK_DIV: '/';
TK_MOD: '%';
TK_INCREMENTO: '++';
TK_DECREMENTO: '--';
FUNCTION: 'function';
VAR: 'var';
PRINT: 'print';
INPUT: 'input';
WHEN: 'when';
DO: 'do';
IF: 'if';
ELSE: 'else';
UNLESS: 'unless';
WHILE: 'while';
RETURN: 'return';
UNTIL: 'until';
LOOP: 'loop';
REPEAT: 'repeat';
FOR: 'for';
END: 'end';
NEXT: 'next';
BREAK: 'break';
AND: 'and';
OR: 'or';
NOT: 'not';

NUM: [0-9]+ '.'? [0-9]*;

FID: '@' [a-zA-Z_][a-zA-Z0-9_]*; //Creo q ya esta
ID: [a-zA-Z_][a-zA-Z0-9_]*; // match lower-case identifiers
WS:
	[ \t\r\n]+ -> skip; // skip spaces, tabs, newlines, \r (Windows)
COMMENT: '#' ~[\r\n\f]* -> skip; //commentaries