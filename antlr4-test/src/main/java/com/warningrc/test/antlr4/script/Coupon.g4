grammar Coupon;

build : matchOrder1;

matchOrder1 : '{' matchOrder '}';
matchOrder : rangeType 
			|| rangeType ',' productLines ',' productTypes 
			|| rangeType ',' productTypes ',' productLines
			|| productLines ',' rangeType ',' productTypes 
			|| productLines ',' productTypes ',' rangeType
			|| productTypes ',' rangeType ',' productLines 
			|| productTypes ',' productLines ',' rangeType ;

rangeType: '"rangeType"' ':' rangeType;

productLines: '"productLines"' ':' '[' (STRING)? ']';
productTypes: '"productTypes"' ':' '[' (STRING)? ']';

OR  :  'or'  | 'OR'  | '||' ;
AND :  'and' | 'AND' | '&&' ;
STRING:	(~[\: \t\(\)])+;
NUMBER:	(~[\: \t\(\)])+;
WS  : [ \t\r\n]+ -> skip ;   