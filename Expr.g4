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
        'test' TYPETEST objectName+=ID (((',' objectName+=ID) | (objectName+=ID))*) (testargs+=testArguments)* ';' #testDeclaration
    ;

testArguments:
    'serverports' ':' '[' serverports+=INT ']' #serverPorts |
    'serverApps' ':' '[' serverapps+=ID ']' #serverApps |
    argsValues = argsSpec #args |
    argsValues = argsBulkSpec #argsBulk;

argsSpec:
    'args' ':' '[' args+=(ID|INT|PATH) ( (',' args+=(ID|INT|PATH)) | (args+=(ID|INT|PATH)) )* ']'
    ;

argsBulkSpec:
    'args' ':' '[' args+=argsBulkBody ((',' args+=argsBulkBody) | (args+=argsBulkBody))* ']';

argsBulkBody:
    '[' args+=(ID|INT|PATH) ( (',' args+=(ID|INT|PATH)) | (args+=(ID|INT|PATH)) )* ']'
    ;

TYPETEST: 'run' | 'runBulk';
FRAMEWORKSERVER: 'fastapi' | 'express' | 'rails' ;
LANGUAGES: 'python' | 'node' | 'ruby' ;

TYPES: 'script' | 'server' ;
ID:   [a-zA-Z]+ ;
INT:  [0-9]+ ;
PATH: [a-zA-Z0-9/\-_.]+ ;
WS : (' ' | '\t' | '\r' | '\n')+ -> skip ;

