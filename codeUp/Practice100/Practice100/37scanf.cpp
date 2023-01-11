#include <stdio.h>

long long int add(long long int num1, long long int num2)
{
	return num1 + num2;
}

int main()
{
	long long int num1 = 0;
	long long int num2 = 0;
	long long int sum = 0;
	
	scanf("%lld %lld", &num1, &num2);

	sum = add(num1, num2);

	printf("%lld", sum);

	return 0;
}