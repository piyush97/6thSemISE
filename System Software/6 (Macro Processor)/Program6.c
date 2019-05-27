//One-pass macroprocessor
#include <stdio.h>
#include <string.h>

void main()
{
	FILE *f1, *f2, *f3;
	char label[20], opcode[20], operand[20], macroname[20];
	strcpy(macroname, "");
	f1 = fopen("input.txt", "r");
	f2 = fopen("output.txt", "w");
	fscanf(f1, "%s %s %s", label, opcode, operand);

	while (strcmp(opcode, "END") != 0)
	{
		if ((strcmp(opcode, "MACRO") != 0) && (strcmp(opcode, macroname) != 0))
			fprintf(f2, "%s\t%s\t%s\n", label, opcode, operand);

		else if (strcmp(opcode, macroname) == 0)
		{
			f3 = fopen("deftab.txt", "r");
			fprintf(f2, ".%s\t", label);
			fscanf(f3, "%s %s %s", label, opcode, operand);
			fprintf(f2, "%s\t%s\n", label, operand);
			fscanf(f3, "%s %s %s", label, opcode, operand);
			while (strcmp(opcode, "MEND") != 0)
			{
				fprintf(f2, "%s\t%s\t%s\n", label, opcode, operand);
				fscanf(f3, "%s %s %s", label, opcode, operand);
			}
			fclose(f3);
		}
		else if (strcmp(opcode, "MACRO") == 0)
		{
			f3 = fopen("deftab.txt", "w");
			strcpy(macroname, label);

			while (strcmp(opcode, "MEND") != 0)
			{
				fprintf(f3, "%s\t%s\t%s\n", label, opcode, operand);
				fscanf(f1, "%s %s %s", label, opcode, operand);
			}
			fprintf(f3, "%s\t%s\t%s\n", label, opcode, operand);
			fclose(f3);
		}
		fscanf(f1, "%s %s %s", label, opcode, operand);
	}
	fprintf(f2, "%s\t%s\t%s\n", label, opcode, operand);

	printf("\nOutput file generated as output.txt and DEFTAB as deftab.txt\n");

	fclose(f1);
	fclose(f2);
}
