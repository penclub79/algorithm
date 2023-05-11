package Inflearn.src.practiceWork;

import java.util.Scanner;

public class Note {

	public static int Fibo(int n)
	{
		if (n <= 1)
			return n;

		return Fibo(n );
	}

	public static void main(String[] args)
	{
		System.out.println(	Fibo(5) );
	}
}
