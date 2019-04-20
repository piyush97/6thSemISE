#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main()
{
	FILE *f1, *f2, *f3, *f4;
	f1 = fopen("input.txt", "r");
	f3 = fopen("symtab.txt", "w");
	f4 = fopen("output.txt", "w");
	int lc, sa;
	char label[20], opcode[20], operand[20];
	fscanf(f1, "%s %s %s", label, opcode, operand);

	if (strcmp(opcode, "START") == 0)
	{
		sa = strtol(operand, NULL, 16);
		fprintf(f4, "%X\t%s\t%s\t%s\n", sa, label, opcode, operand);
	}
	else
		sa = 0;
	lc = sa;

	fscanf(f1, "%s %s %s", label, opcode, operand);
	while (strcmp(opcode, "END") != 0)
	{
		fprintf(f4, "%X\t%s\t%s\t%s\n", lc, label, opcode, operand);

		if (strcmp(label, "-") != 0)
		{
			fprintf(f3, "%s\t%X\n", label, lc);
		}

		if (strcmp(opcode, "WORD") == 0)
		{
			lc += 3;
		}

		if (strcmp(opcode, "RESW") == 0)
		{
			lc = lc + (3 * (strtol(operand, NULL, 10)));
		}

		if (strcmp(opcode, "RESB") == 0)
		{
			lc = lc + strtol(operand, NULL, 10);
		}

		if (strcmp(opcode, "BYTE") == 0)
		{
			if (operand[0] == 'X')
				lc++;
			else
				lc = lc + strlen(operand) - 3;
		}
		fscanf(f1, "%s %s %s", label, opcode, operand);
	}
	fprintf(f4, "%X\t%s\t%s\t%s\n", lc, label, opcode, operand);

	printf("\nOutput File generated as output.txt\n");
	fclose(f1);
	fclose(f4);
	fclose(f3);
	return 0;
}
