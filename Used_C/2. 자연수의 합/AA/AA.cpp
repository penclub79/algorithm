#include <iostream>
using namespace std;

int main()
{
	// Ǯ�� 1
	int a = 0;
	int b = 0;
	int sum = 0;

	cin >> a >> b;

	for (int i = 1; a < b; i++)
	{
		sum = sum + a;
		cout << a << "+";
		a++;
	}
	sum = sum + b;
	cout << b << "=" << sum;

	// Ǯ�� 2
	// 
	//int a = 0;
	//int b = 0;
	//int i = 0;
	//int sum = 0;

	//cin >> a >> b;

	//for (i = a; i < b; i++)
	//{
	//	cout << i << "+";
	//	sum += i;
	//}

	//cout << b << "=";
	//cout << sum + i;


	return 0;
}