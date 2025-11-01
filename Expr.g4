grammar Expr;

document: 
    (decs+=declaration+) EOF; 


declaration:
        'object' ID '{' 
            'type' ':' type=TYPES ';'
            ('language' ':' language=LANGUAGES ';' )?
            ('framework'  ':' server=FRAMEWORKSERVER ';')?
        
        '}' ';' #objectDeclaration |
        'test' TYPETEST ID ';' #testDeclaration ;


TYPETEST: 'run';
FRAMEWORKSERVER: 'fastapi' | 'express' | 'rails' ;
LANGUAGES: 'python' | 'node' | 'ruby' ;

TYPES: 'script' | 'server' ;
ID:   [a-zA-Z]+ ;

WS: [ \t\r\n]+ -> skip;
