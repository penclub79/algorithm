package Inflearn.src.practiceWork;

import java.util.Scanner;

public class Note {

	public static String solution(int idx, int[][] arr)
	{
		String answer = "";

		if (arr[0][idx] == 1 && arr[1][idx] == 3 || arr[0][idx] == 2 && arr[1][idx] == 1 || arr[0][idx] == 3 && arr[1][idx] == 2)
			answer = "A";
		else if (arr[0][idx] == 3 && arr[1][idx] == 1 || arr[0][idx] == 1 && arr[1][idx] == 2 || arr[0][idx] == 2 && arr[1][idx] == 3)
			answer = "B";
		else
			answer = "D";

		return answer;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String A = sc.nextLine();
		String B = sc.nextLine();

		int[][] arr = new int[2][N];
		String[] spl = new String[N];

		for (int i = 0; i < 2; i++)
		{
			if (i == 0)
				spl = A.split(" ");
			else
				spl = B.split(" ");

			for (int j = 0; j < spl.length; j++)
			{
				arr[i][j] = Integer.parseInt(spl[j]);
			}
		}

		for (int x = 0; x < N; x++)
		{
			System.out.println(solution(x, arr));
		}
	}
}
