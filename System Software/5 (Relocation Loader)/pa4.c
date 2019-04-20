//Relocating loader using bit mask
#include <stdio.h>
#include <string.h>

char bitmask[20];

void convert(char hex[12])
{
	strcpy(bitmask, "");
	for (int i = 0; i < strlen(hex); i++)
	{
		switch (hex[i])
		{
		case '0':
			strcat(bitmask, "0000");
			break;
		case '1':
			strcat(bitmask, "0001");
			break;
		case '2':
			strcat(bitmask, "0010");
			break;
		case '3':
			strcat(bitmask, "0011");
			break;
		case '4':
			strcat(bitmask, "0100");
			break;
		case '5':
			strcat(bitmask, "0101");
			break;
		case '6':
			strcat(bitmask, "0110");
			break;
		case '7':
			strcat(bitmask, "0111");
			break;
		case '8':
			strcat(bitmask, "1000");
			break;
		case '9':
			strcat(bitmask, "1001");
			break;
		case 'A':
			strcat(bitmask, "1010");
			break;
		case 'B':
			strcat(bitmask, "1011");
			break;
		case 'C':
			strcat(bitmask, "1100");
			break;
		case 'D':
			strcat(bitmask, "1101");
			break;
		case 'E':
			strcat(bitmask, "1110");
			break;
		case 'F':
			strcat(bitmask, "1111");
			break;
		}
	}
}

void main()
{
	FILE *f1;
	f1 = fopen("input.txt", "r");
	char type, objcode[20], progname[20], input[20], mask[20];
	int psa, sa, addr, len, c = 0;
	fscanf(f1, "%c %s %X %X", &type, progname, &psa, &len);

	printf("\nEnter Starting Address: ");
	scanf("%x", &sa);

	printf("Loading Program %s of length %06X starting at Address %06X :-\n", progname, len, (psa + sa));

	fscanf(f1, "%s", input);
	while (strcmp(input, "E") != 0)
	{
		if (strcmp(input, "T") == 0)
		{
			c = 0;
			fscanf(f1, "%X", &addr);
			fscanf(f1, "%s", mask);
			addr += sa;
		}
		convert(mask);
		fscanf(f1, "%s", input);
		if (strcmp(input, "T") == 0)
			continue;
		if (strcmp(input, "E") == 0)
			break;
		char sub[20];
		strcpy(sub, &input[2]);
		int add = strtol(sub, NULL, 16);
		if (bitmask[c] == '1')
			add = add + sa;

		printf("%06X\t%c%c%X\n", addr, input[0], input[1], add);
		c++;
		addr += 3;
	}
	fclose(f1);
}
