%{
    #include <stdio.h>
    #include <stdlib.h>
%}

%token NUMBER NL

%%
stmt : NUMBER NUMBER exp NL {printf("Valid Integer \n"); exit (0);}
;

exp : NUMBER exp
| NUMBER
;

%%

int yyerror (char *msg) {
    printf ("Invalid Integer");
    exit(0);
}

int main() {
    yyparse();
    return 0;
}