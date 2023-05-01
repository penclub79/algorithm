package Inflearn.src.practiceWork;

import java.util.Scanner;

public class Note {

	public String solution(String str)
	{
		String answer = "YES";
		char[] arr = new char[str.length() - 1];
		arr = str.toCharArray();


		return answer;
	}

	public static void main(String[] args)
	{
		Note N = new Note();
		Scanner sc = new Scanner(System.in);
		String str = new String();
		str = sc.nextLine();

		System.out.println(N.solution(str));

	}
}
