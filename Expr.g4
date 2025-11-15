grammar Expr;

document:
    (decs+=declaration+) EOF;


declaration:
        'object' objectName=ID '{'
            'type' ':' type=TYPES ';'
            ('language' ':' language=LANGUAGES ';' )?
            ('framework'  ':' server=FRAMEWORKSERVER ';')?
            ('mainFile' ':' mainFile=ID ';')?
            ('path' ':' path=PATH ';')?
        '}' ';' #objectDeclaration
    |
        'test' TYPETEST objectName+=ID (((',' objectName+=ID) | (objectName+=ID))*) (serverport=INT)? (serverapp=ID)? (args=argsSpec)? (argBulk=argsBulkSpec)? ';' #testDeclaration
    ;

// Parser rule para argumentos do teste (IDs ou INTs, separados por espaco ou vedrgula)
argsSpec:
    'args' '=' '[' args+=(ID|INT) ( (',' args+=(ID|INT)) | (args+=(ID|INT)) )* ']'
    ;

argsBulkSpec:
    'args' '=' '[' args+=argsBulkBody ((',' args+=argsBulkBody) | (args+=argsBulkBody))* ']';

argsBulkBody:
    '[' args+=(ID|INT) ( (',' args+=(ID|INT)) | (args+=(ID|INT)) )* ']'
    ;



TYPETEST: 'run' | 'runBulk';
FRAMEWORKSERVER: 'fastapi' | 'express' | 'rails' ;
LANGUAGES: 'python' | 'node' | 'ruby' ;

TYPES: 'script' | 'server' ;
ID:   [a-zA-Z]+ ;
INT:  [0-9]+ ;
PATH: [a-zA-Z0-9/\-_.]+ ;
WS: [ \t\r\n]+ -> skip;

