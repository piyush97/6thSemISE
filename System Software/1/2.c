#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void main()
{
 char label[10],opcode[10],operand[10],ch,symbol[10],a[10],ad[10];
 char mnemonic[10][10]={"LDA","STA","LDT","LDCH","STCH"};
 char code[10][10]={"00","14","17","43","34"};
 int address,add,prevaddr,i,j=0,finaladdr,len,actual_len;
 FILE *fp1,*fp2,*fp3;

 fp1=fopen("ASSLIST.dat","w");
 fp2=fopen("SYMTAB.DAT","r");
 fp3=fopen("OUT.DAT","r");

 fscanf(fp3,"%s%s%s",label,opcode,operand);

 while(strcmp(opcode,"END")!=0)
 {
 	prevaddr=address;
	fscanf(fp3,"%x%s%s%s",&address,label,opcode,operand);
 }
 finaladdr=address;
 fclose(fp3);

 fp3=fopen("OUT.DAT","r");
 fscanf(fp3,"%s%s%s",label,opcode,operand);

 if(strcmp(opcode,"START")==0)
 {
	fprintf(fp1,"\t%s\t%s\t%s\n",label,opcode,operand);
	fscanf(fp3,"%x%s%s%s",&address,label,opcode,operand);
 }

 while(strcmp(opcode,"END")!=0)
 {
	if(strcmp(opcode,"BYTE")==0)
	{
		fprintf(fp1,"%x\t%s\t%s\t%s\t",address,label,opcode,operand);
		len=strlen(operand);
		actual_len=len-3;
		for(i=2;i<(actual_len+2);i++)
		{
			sprintf(ad,"%x",operand[i]);
			fprintf(fp1,"%s",ad);
		}
		fprintf(fp1,"\n");
	}

	else if(strcmp(opcode,"WORD")==0)
	{
		sprintf(a,"%x",atoi(operand));
		fprintf(fp1,"%x\t%s\t%s\t%s\t00000%s\n",address,label,opcode,operand,a);
	}

	else if((strcmp(opcode,"RESB")==0) || (strcmp(opcode,"RESW")==0))
		fprintf(fp1,"%x\t%s\t%s\t%s\n",address,label,opcode,operand);

	else
	{	
		j=0;
		while(strcmp(opcode,mnemonic[j])!=0)
		j++;
		rewind(fp2);
		fscanf(fp2,"%s%x",symbol,&add);
		while(strcmp(operand,symbol)!=0)
		fscanf(fp2,"%s%x",symbol,&add);
		fprintf(fp1,"%x\t%s\t%s\t%s\t%s%x\n",address,label,opcode,operand,code[j],add);
	}
	fscanf(fp3,"%x%s%s%s",&address,label,opcode,operand);
 }
 fprintf(fp1,"%x\t%s\t%s\t%s\n",address,label,opcode,operand);
 fclose(fp1);
 fclose(fp2);
 fclose(fp3);

 fp1=fopen("ASSLIST.dat","r");
 ch=fgetc(fp1);
 while(ch!=EOF)
 {
	printf("%c",ch);
	ch=fgetc(fp1);
 } 
}

