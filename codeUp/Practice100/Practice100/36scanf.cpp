#include <stdio.h>

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int denum1, int num1, int denum2, int num2) {
    // return ���� malloc �� ���� �Ҵ��� ������ּ���. �Ҵ� ���̴� ��Ȳ�� �°� �������ּ���.
    int* answer = (int*)malloc(2);
    int denum = 0, num = 0;
    int yunsan = 0;

    denum = denum1 * num2 + denum2 * num1;
    num = num1 * num2;

    for (int i = 1; i < denum; i++)
    {
        if (denum % i == 0 && num % i == 0)
        {
            yunsan = i;
        }
    }

    answer[0] = denum / yunsan;
    answer[1] = num / yunsan;

    for (int i = 0; i < 2; i++)
    {
        printf("%d\n", answer[i]);
    }
    return answer;

}

int main()
{
	solution(9, 2, 1, 3);

	return 0;
}