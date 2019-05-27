%{
    #include "y.tab.h"
%}

%%
[0-9] {return NUMBER;}
[\n] {return NL;}
. {return yytext[0];}
%%