%{
#include "y.tab.h"
%}
%%
[0-9]+ {yylval=atoi(yytext); return NUMBER;}
\n {return NL;}
. {return yytext[0];}
%%