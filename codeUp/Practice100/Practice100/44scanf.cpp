#include <stdio.h>

int main()
{
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;

	scanf("%d %d %d", &num1, &num2, &num3);

	printf("%d\n", num1 + num2 + num3);
	printf("%0.1f", (float)(num1 + num2 + num3) / 3);


	return 0;
}