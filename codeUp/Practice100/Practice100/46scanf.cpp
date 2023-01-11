#include <stdio.h>

int main()
{
	// 거듭제곱으로 나타내는 문제이다.
	int num1 = 0;
	int num2 = 0;

	scanf("%d %d", &num1, &num2);

	printf("%d", num1<<num2);

	return 0;
}