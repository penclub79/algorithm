package Inflearn.src.Num7;

import java.util.Scanner;

public class Main {

    public String solution(String str)
    {
        String answer = "NO";
        String lowStr = new String();
        String hm = new String();
        char[] arr = new char[str.length() - 1];
        lowStr = str.toLowerCase();
        arr = lowStr.toCharArray();

        for (int i = str.length() - 1; i >= 0; i--)
        {
            hm += arr[i];
        }

        if (lowStr.equals(hm))
            answer = "YES";
        else
            answer = "NO";

        return answer;
    }

    public static void main(String[] args)
    {
        Main N = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(N.solution(str));
    }
}
