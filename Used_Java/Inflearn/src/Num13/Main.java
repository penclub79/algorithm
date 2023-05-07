package Inflearn.src.Num13;

import java.util.Scanner;

public class Main {
    public static String solution(int num, String str)
    {
        String answer = "";
        String[] strArr = str.split(" ");
        int[] arr = new int[num];

        for (int i = 0; i < strArr.length; i++)
        {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        for (int j = 0; j < arr.length; j++)
        {
            if (j == 0)
            {
                answer += arr[j];
                answer += " ";
            }

            if (j == arr.length - 1)
            {
                break;
            }

            if (arr[j] < arr[j+1])
            {
                answer += arr[j+1];
                answer += " ";
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int num = Integer.parseInt(N);
        String integers = sc.nextLine();
        System.out.println(solution(num, integers));
    }
}
