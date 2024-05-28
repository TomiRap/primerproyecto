grammar compiladores;

@header {
package primerproyecto;
}
fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

WS : [ \t\n\r] -> skip ;
// OTRO : . ;

PA : '(' ;
PC : ')' ;
LLA : '{' ;
LLC : '}' ;
PYC : ';' ;
IGUAL : '=' ;
SUMA:  '+';
RESTA: '-';
MULTIPLICACION: '*';
DIVISION : '/';
MODULO : '%';

// Variables
INT : 'int' ;
DOUBLE: 'double';
BOOL: 'boolean';


NUMERO : DIGITO+ ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : LLA instrucciones LLC PYC
            | declaracion 
            | asignacion 
            ;

declaracion : variable ID PYC 
            | variable ID IGUAL exp PYC
            ;

variable : INT
         | DOUBLE
         | BOOL
         ;

asignacion : ID IGUAL exp PYC ;

expresiones : exp PYC expresiones 
            | EOF
 ;

exp : e ;

e : term t ;

term : factor t ;

t : SUMA term
  | RESTA term
  | 
  ;

factor : NUMERO
       | ID
       | PA exp PC
       ;

f : MULTIPLICACION factor f
  | DIVISION factor f
  | MODULO factor f
  |
  ;