package Inflearn.src.Num8;

import java.util.Scanner;

public class Main {

    public String solution(String str)
    {
        String answer = "NO";
        String lowStr = new String();
        char[] strArr = new char[str.length() - 1];
        String frontArr = new String();
        String backArr = new String();

        lowStr = str.toLowerCase();
        strArr = lowStr.toCharArray();

        for (int i = 0; i < strArr.length; i++)
        {
            if (97 <= (int)strArr[i] && (int)strArr[i] <= 122)
                frontArr += strArr[i];
        }

        for (int j = strArr.length - 1; j >= 0; j--)
        {
            if (97 <= (int)strArr[j] && (int)strArr[j] <= 122)
            {
                backArr += strArr[j];
            }
        }

        if (frontArr.equals(backArr))
            answer = "YES";
        else
            answer = "NO";

        return answer;
    }

    public static void main(String[] args)
    {
        Main N = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(N.solution(str));
    }
}
