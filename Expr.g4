grammar Expr;

document: 
    (decs+=declaration+) EOF; 


declaration:
        'object' objectName=ID '{' 
            'type' ':' type=TYPES ';'
            ('language' ':' language=LANGUAGES ';' )?
            ('framework'  ':' server=FRAMEWORKSERVER ';')?
            ('servermain' ':' servermain=ID ';')?
            ('path' ':' path=PATH ';')?
        
        '}' ';' #objectDeclaration |
        'test' TYPETEST objectName=ID (serverport= INT)? (serverapp=ID)?';' #testDeclaration ;


TYPETEST: 'run';
FRAMEWORKSERVER: 'fastapi' | 'express' | 'rails' ;
LANGUAGES: 'python' | 'node' | 'ruby' ;

TYPES: 'script' | 'server' ;
ID:   [a-zA-Z]+ ;
INT:  [0-9]+ ;
PATH: [a-zA-Z0-9/\-_.]+ ;
WS: [ \t\r\n]+ -> skip;