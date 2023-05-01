package Inflearn.src.Num5;

import java.util.Scanner;

public class Main {

    public String solution(String str)
    {
        String answer = new String();
        char[] arr = null;
        arr = str.toCharArray();
        int len = str.length() - 1;

        for (int i = 0; i < str.length(); i++)
        {
            if ( !(97 <= (int)arr[i] && (int)arr[i] <= 122) && !(65 <= (int)arr[i] && (int)arr[i] <= 90))
            {
                answer += arr[i];
            }
            else
            {
                while(len >= 0)
                {
                    if ( !(97 <= (int)arr[len] && (int)arr[len] <= 122) && !(65 <= (int)arr[len] && (int)arr[len] <= 90))
                    {
                        len--;
                    }
                    else
                    {
                        answer += arr[len];
                        len--;
                        break;
                    }
                }
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

