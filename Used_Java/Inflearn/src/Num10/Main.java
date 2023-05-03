package Inflearn.src.Num10;

import java.util.Scanner;

public class Main {

    public String solution(String str)
    {
        String answer = new String();
        int cnt = 0;
        char point = ' ';

        String[] sp = str.split(" ");
        point = sp[1].charAt(0);
        int[] front = new int[str.length() - 2];
        int[] back = new int[str.length() - 2];
        int[] choiso = new int[str.length() - 2];

        for (int i = 0; i < sp[0].length(); i++)
        {
            if (sp[0].charAt(i) == point)
                cnt = 0;
            else
                cnt++;

            front[i] = cnt;
        }

        for (int j = sp[0].length() - 1; j >= 0; j--)
        {
            if (sp[0].charAt(j) == point)
                cnt = 0;
            else
                cnt++;

            back[j] = cnt;
        }

        for (int y = 0; y < front.length; y++)
        {
            if (y == 0)
            {
                if (front[y] > back[y])
                    choiso[y] = front[y];
                else if (front[y] < back[y])
                    choiso[y] = back[y];
                else
                    choiso[y] = front[y];
            }
            else
            {
                if (front[y] > back[y])
                    choiso[y] = back[y];
                else if (front[y] < back[y])
                    choiso[y] = front[y];
                else
                    choiso[y] = front[y];
            }

            answer += String.valueOf(choiso[y]);

            if (y < front.length - 1)
                answer += " ";
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