
%{
  #include<stdio.h>
  int pnum=0;
  int nnum=0;
  int pf=0;
  int nf=0;
%}

%%
[-][0-9]+ 	{nnum++;}
[+]?[0-9]+	{pnum++;}	
[-][0-9]*\.[0-9]+	 {nf++;}
[+]?[0-9]*\.[0-9]+ 	{pf++;}
. ;    
%%

int yywrap(){return 1;}
main()
{
  yyin=fopen("inp5.txt","r");
  yylex();
  printf("The +ve number are:  %d\n",pnum);
  printf("The -ve number are:  %d\n",nnum);
  printf("\nNo. of Positive fractions: %d",pf);
  printf("\nNo. of Negative fractions: %d\n",nf);
  return 0;
} 
