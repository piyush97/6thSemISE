%{
#include "y.tab.h"
%}

%%
[0-9]+	{return number;}
[a-zA-Z][a-zA-Z0-9_]*	{return id;}
\n	{return nl;}
.	{return yytext[0];}
%%
int yywrap(void){return 1;}
