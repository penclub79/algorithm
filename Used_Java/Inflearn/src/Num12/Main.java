package Inflearn.src.Num12;

import java.util.Scanner;

public class Main {

    public static String solution(int num, String str)
    {
        String answer = "";
        char[] strArr = new char[str.length() - 1];
        int sum = 0;
        int idx = 0;
        int idxCnt = 0;
        int powCnt = 0;
        strArr = str.toCharArray();

        for (int i = 0; i < num; i++)
        {
            sum = 0;
            powCnt = 0;
            for (idx = idxCnt; idx < strArr.length * (i + 1) / num; idx++)
            {
                if (strArr[idx] == '#')
                    sum += Math.pow(2, 6 - powCnt);
                powCnt++;
            }
            idxCnt = idx;
            answer += (char)sum;
        }

        return answer;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.nextLine();
        int num = Integer.parseInt(numStr);
        String str = sc.nextLine();

        System.out.println(solution(num, str));
    }
}