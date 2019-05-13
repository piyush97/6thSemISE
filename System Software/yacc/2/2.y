%{
  #include<stdio.h>
  #include<stdlib.h>
%}
%token DIGIT LETTER NL UND
%%
  stmt : var NL {printf("Valid\n"); exit(0);}
       ;
  var : LETTER alpha
      ;
  alpha : LETTER alpha
        |DIGIT alpha
        |UND alpha
        |LETTER
        |DIGIT
        |UND
        ;
%%
int yyerror(char*msg){
    printf("Invalid\n");
    exit(0);
}

int main(){
    yyparse();
    return 0;
}