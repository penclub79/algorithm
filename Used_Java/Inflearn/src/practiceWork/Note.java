package Inflearn.src.practiceWork;

import java.util.Scanner;

public class Note {

	public String solution(String str)
	{
		String answer = "NO";
		String lowStr = new String();
		String hm = new String();
		char[] frontArr = new char[str.length() - 1];
		char[] backArr = new char[str.length() - 1];

		lowStr = str.toLowerCase();
		frontArr = lowStr.toCharArray();

		for (int i = 0; i < frontArr.length; i++)
		{

		}


		for (int j = str.length() - 1; j >= 0; j--)
		{

		}


		return answer;
	}

	public static void main(String[] args)
	{
		Note N = new Note();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(N.solution(str));
	}
}
