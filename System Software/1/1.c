#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
FILE *fp,*fp1,*fp2;
fp=fopen("INPUT.DAT","r");
fp1=fopen("OUT.DAT","w");
fp2=fopen("SYMTAB.DAT","w");
char ch='a',a[10],b[10],c[10];

printf("%s\n",b);

int l=0;

if(fp==NULL || fp1==NULL || fp2==NULL)
{
printf("error opening a file\n");
exit(0);
}

unsigned int loc;
while(strcmp(b,"END")!=0)
{
	//printf("%s\n",b);
	fscanf(fp,"%s %s",a,b);
	printf("%s %s\n",a,b);
	if(strcmp(a,"**")==0)
	{
		if(strcmp(b,"START")==0)
		{
			fscanf(fp,"%X",&loc);
			//loc=c;
			fprintf(fp1,"\t\t%s %s %X\n",a,b,loc);
		}
		else
		{
			fscanf(fp,"%s",c);
			fprintf(fp1,"%X\t%s %s %s\n",loc,a,b,c);
			loc=loc+3;
		}
	}

	else
	{
		int temp;
		if(strcmp(b,"RESB")==0)
		{
			fscanf(fp,"%d",&temp);
			fprintf(fp1,"%X\t%s %s %d\n",loc,a,b,temp);
			fprintf(fp2,"%X %s\n",loc,a);
			loc=loc+temp;
		}
		else if(strcmp(b,"BYTE")==0)
		{
			fscanf(fp,"%s",c);
			fprintf(fp1,"%X\t%s %s %s\n",loc,a,b,c);
			fprintf(fp2,"%X %s\n",loc,a);
			loc=loc+(strlen(c)-3);
		}
		else
		{
			fscanf(fp,"%s",c);
			fprintf(fp1,"%X\t%s %s %s\n",loc,a,b,c);
			fprintf(fp2,"%X %s\n",loc,a);
			loc=loc+3;
		}
	}

}
fclose(fp);
fclose(fp1);
fclose(fp2);
}

