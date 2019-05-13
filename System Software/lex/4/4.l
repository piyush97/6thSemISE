%{
int vc=0,cc=0,lc=0,sc=0;
%}

%%
[ \t]	{;}
[aeiouAEIOU] {vc++;}
[a-zA-Z] {cc++;}
\n lc++;
. sc++;
%%


int yywrap(){return 1;}
main()
{
  yyin=fopen("input.txt","r");
  yylex();
  printf("The number of vowels are:  %d\n",vc);
  printf("The number of consonants are:  %d\n",cc);
  printf("The number lines are:  %d\n",lc);
  printf("The number special characters are:  %d\n",sc);
return 0;
} 

