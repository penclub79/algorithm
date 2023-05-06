package Inflearn.src.Num11;

import java.util.Scanner;

public class Main {

    public static String solution(String str)
    {
        String answer = new String();
        int cnt = 0;
        int idx = 0;
        char[] strArr = new char[str.length() - 1];

        strArr = str.toCharArray();

        for (idx = 0; idx < str.length(); )
        {
            cnt = 0;

            for (int j = idx; j < str.length(); j++)
            {
                if (strArr[idx] == strArr[j])
                    cnt++;
                else
                    break;
            }

            answer += strArr[idx];

            if (cnt == 0)
                idx += 1;
            else
                idx += cnt;

            if (cnt > 1) answer += cnt;
        }


        return answer;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}