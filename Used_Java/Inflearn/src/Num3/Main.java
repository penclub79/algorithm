package Inflearn.src.Num3;

import java.util.Scanner;

public class Main {

    public String solution(String str)
    {
        String answer = new String();
        String[] arr;
        int max = Integer.MIN_VALUE;
        int len = 0;
        arr = str.split(" ");

        for (String x : arr)
        {
            len = x.length();
            if (len > max)
            {
                max = len;
                answer = x;
            }
        }
//		answer 	= arr[0].length() > arr[1].length() ? arr[0] : arr[1];
//
//		for (int i = 2; i < arr.length; i++)
//		{
//			if (arr[i].length() > answer.length())
//				answer = arr[i];
//		}


        return answer;
    }

    public static void main(String[] args)
    {
        Main N = new Main();
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        System.out.println(N.solution(str));
    }

}
