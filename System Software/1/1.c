#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void main()
{
 char label[10],opcode[10],operand[10],code[10][10],ch;
 char mnemonic[10][10]={"START","LDA","LDCH","STA","STCH","LDT","END"};
 int locctr,start,end,length,i=0,j=0;
 FILE *fp1,*fp2,*fp3;
 
 fp1=fopen("input.dat","r");
 fp2=fopen("symtab.dat","w");
 fp3=fopen("out.dat","w");

 fscanf(fp1,"%s%s%s",label,opcode,operand);
 
 if(strcmp(opcode,"START")==0)
 {
    start=(int) strtol(operand,NULL,16);
    locctr=start;
    fprintf(fp3,"\t%s\t%s\t%s\n",label,opcode,operand);
    fscanf(fp1,"%s%s%s",label,opcode,operand);
 }
 else
 locctr=0;

 while(strcmp(opcode,"END")!=0)
 {
    i=0;
    j=0;
    fprintf(fp3,"%x",locctr);
    if(strcmp(label,"**")!=0)
    fprintf(fp2,"%s\t%x\n",label,locctr);

    strcpy(code[i],mnemonic[j]);
    while(strcmp(mnemonic[j],"END")!=0)
    {
     if(strcmp(opcode,mnemonic[j])==0)
     {
        locctr+=3;
        break;
     }
     strcpy(code[i],mnemonic[j]);
     j++;
    }

    if(strcmp(opcode,"WORD")==0)
    locctr+=3;
    else if(strcmp(opcode,"RESW")==0)
    locctr+=(3*(atoi(operand)));
    else if(strcmp(opcode,"RESB")==0)
    locctr+=(atoi(operand));
    else if(strcmp(opcode,"BYTE")==0)
    locctr++;
    
    fprintf(fp3,"\t%s\t%s\t%s\n",label,opcode,operand);
    fscanf(fp1,"%s%s%s",label,opcode,operand);
 }

 fprintf(fp3,"%x\t%s\t%s\t%s\n",locctr,label,opcode,operand);
fclose(fp1);
fclose(fp2);
fclose(fp3);

 fp3=fopen("out.dat","r");
 ch=fgetc(fp3);
 while(ch!=EOF)
 {
    printf("%c",ch);
    ch=fgetc(fp3);
 }
}
