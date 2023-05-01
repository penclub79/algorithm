package Inflearn.src.Num4;

import java.util.Scanner;

public class Main {

    public String solution(String str)
    {
        int num 		= str.length() - 1;
        String answer 	= new String();
        char[] arr 		= null;

        arr = str.toCharArray();

        for (int i = 0; i < str.length(); i++)
        {
            answer += arr[num--];
//			num--;
        }
        return answer;
    }

    public static void main(String[] args)
    {
        Main N = new Main();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();

        String[] str = new String[n];

        for (int i = 0; i < n; i++)
        {
            str[i] = sc.next();
        }

        for (int j = 0; j < n; j++)
        {
            System.out.println(N.solution(str[j]));
        }
    }
}
