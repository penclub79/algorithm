package Inflearn.src.Num9;

import java.util.Scanner;

public class Main {

    public String solution(String str)
    {
        String answer = new String();
        char[] strArr = new char[str.length() - 1];
        strArr = str.toCharArray();
        char[] filterArr = new char[str.length() - 1];
        int ansInx = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (48 <= (int)strArr[i] && (int)strArr[i] <= 57)
            {
                if (ansInx == 0 && 48 == (int)strArr[i])
                    continue;

                filterArr[ansInx] = strArr[i];
                answer += filterArr[ansInx];
                ansInx++;
            }
        }
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