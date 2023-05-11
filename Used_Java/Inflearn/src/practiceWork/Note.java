package Inflearn.src.practiceWork;

import java.util.Scanner;

public class Note {

	public static int solution(int n)
	{
		int answer = 0;
		int cnt = 0;
		int totalCnt = 0;

		for (int i = 2; i <= n; i++)
		{
			if (n % i == 0)
				continue;
			else
				answer++;
		}

		return answer;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(solution(num));
	}
}
