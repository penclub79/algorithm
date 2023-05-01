package Inflearn.src.Num6;

import java.util.Scanner;

public class Main {

    public String solution(String str)
    {
        String answer = new String();
        char[] arr = new char[str.length()];
        char[] arr2 = new char[str.length()];
        arr = str.toCharArray();
        int num = 0;
        boolean isDupl = false;

        for (int i = 0; i < str.length(); i++)
        {
            isDupl = false;

            for (int j = 0; j < i; j++)
            {
                if (arr[i] == arr2[j])
                {
                    isDupl = true;
                    break;
                }
            }

            if (false == isDupl)
            {
                arr2[num] = arr[i];
                answer += arr[i];
                num++;
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        Main N = new Main();
        Scanner sc = new Scanner(System.in);
        String str = new String();

        str = sc.nextLine();

        System.out.println(N.solution(str));
    }
}