#include <stdio.h>

int main()
{
	long long int num1 = 0;
	long long int num2 = 0;

	scanf("%lld %lld", &num1, &num2);

	if (num1 > num2)
	{
		printf("1");
	}
	else if (num1 == num2)
	{
		printf("0");
	}
	else
		printf("0");

	

	return 0;
}