%{
#include<stdio.h>
int id=0, com=0, oper=0;
%}
%%
\/\/.* {com++;}
"/*"[^"*/"]*"*/" {com++;}
[\+\-\*\/] oper++;
= ;
[ \t\n] ;
[0-9]+[a-zA-Z0-9_]* ;
[a-zA-Z_][a-zA-Z0-9_]* {id++; ECHO; printf("\n");}
[!@#$^&()}{|;.<>?:"'~`\[\]]+[a-zA-Z0-9_]* ; 
. ;
%%
int yywrap(){return 1;
fclose(yyin);}
void main()
{
  yyin=fopen("input.txt","r");
  yylex();
  printf("No. of identifiers=%d\n", id);
  printf("No. of comments=%d\n", com);
  printf("No. of operators=%d\n", oper);
  }

