//Absolute loader
#include <stdio.h>
#include <string.h>

void main()
{
	FILE *input;
	input = fopen("input.txt", "r");
	char type, objcode[20], progname[20], input[20];
	int sa, addr, len;
	fscanf(input, "%c %s %x %x", &type, progname, &sa, &len);

	printf("Loading Program %s of length %06X starting at Address %06X :-\n", progname, len, sa);

	fscanf(input, "%s", input);

	while (strcmp(input, "E") != 0)
	{
		if (strcmp(input, "T") == 0)
		{
			fscanf(input, "%X", &addr);
			fscanf(input, "%X", &len);
			fscanf(input, "%s", input);
		}

		int i = 0;
		while (i < strlen(input) - 1)
		{
			printf("%06X\t%c%c\n", addr, input[i], input[i + 1]);
			addr++;
			i += 2;
		}
		fscanf(input, "%s", input);
	}
	fclose(input);
}
