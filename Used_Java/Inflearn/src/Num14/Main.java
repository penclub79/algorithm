package Inflearn.src.Num14;

import java.util.Scanner;

public class Main {
    public static int solution(String height)
    {
        int answer = 0;
        int max = 0;

        String[] proc = height.split(" ");
        int[] intArr = new int[proc.length];

        for (int i = 0; i < proc.length; i++)
        {
            intArr[i] = Integer.parseInt(proc[i]);
        }

        for (int j = 0; j < intArr.length; j++)
        {
            if (j == 0)
            {
                answer += 1;
                max = intArr[j];
            }

            if (j == intArr.length - 1)
                break;

            if (max < intArr[j+1])
            {
                answer += 1;
                max = intArr[j+1];
            }

        }
        return answer;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String height = sc.nextLine();

        System.out.println(solution(height));
    }
}
