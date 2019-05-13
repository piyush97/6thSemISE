
%{
  #include<stdio.h>
  #include<stdlib.h>
%}

%token number id nl
%left '+' '-'
%left '*' '/'

%%
stmt:exp nl {printf("Valid exp\n");exit(0);}
;
exp:exp '+' exp
|exp '-' exp
|exp '*' exp
|exp '/' exp
|'('exp')'
|id
|number
;
%%

int yyerror(char *msg) {
  printf("Invalid\n");
  exit(0);
}

main() {
  printf("Enter the exp\n");
  yyparse();
}



