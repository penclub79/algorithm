#include <stdio.h>

int main()
{
	long long int num1 = 0;
	long long int num2 = 0;

	scanf("%lld %lld", &num1, &num2);

	printf("%lld\n", num1 + num2);
	printf("%lld\n", num1 - num2);
	printf("%lld\n", num1 * num2);
	printf("%lld\n", num1 / num2);
	printf("%lld\n", num1 % num2);
	printf("%0.2lf", (float)num1 / (float)num2);


	return 0;
}