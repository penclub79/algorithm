#include <stdio.h>

int main()
{
	int a, b, c, d, e = 0;
	scanf("%1d%1d%1d%1d%1d", &a, &b, &c ,&d, &e);
	printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]\n", a*10000, b*1000, c*100, d*10, e*1);

	return 0;
}