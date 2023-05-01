package Inflearn.src.practiceWork;

import java.util.Scanner;

public class Note {

	public String solution(String str)
	{
<<<<<<< HEAD
		String answer = "YES";
		char[] arr = new char[str.length() - 1];
		arr = str.toCharArray();


=======
		String answer = new String();
		char[] arr = null;
		arr = str.toCharArray();
		int len = str.length() - 1;

		for (int i = 0; i < str.length(); i++)
		{
			if ( !(97 <= (int)arr[i] && (int)arr[i] <= 122) && !(65 <= (int)arr[i] && (int)arr[i] <= 90))
			{
				answer += arr[i];
			}
			else
			{
				while(len >= 0)
				{
					if ( !(97 <= (int)arr[len] && (int)arr[len] <= 122) && !(65 <= (int)arr[len] && (int)arr[len] <= 90))
					{
						len--;
					}
					else
					{
						answer += arr[len];
						len--;
						break;
					}
				}
			}
		}
>>>>>>> f7dea9c6baa9ad863123d912293614ad485dc8b7
		return answer;
	}

	public static void main(String[] args)
	{
		Note N = new Note();
		Scanner sc = new Scanner(System.in);
		String str = new String();
<<<<<<< HEAD
		str = sc.nextLine();

		System.out.println(N.solution(str));

=======

		str = sc.nextLine();

		System.out.println(N.solution(str));
>>>>>>> f7dea9c6baa9ad863123d912293614ad485dc8b7
	}
}
