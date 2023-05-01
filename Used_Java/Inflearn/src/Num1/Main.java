package Inflearn.src.Num1;

import java.util.Scanner;

public class Main {

    public int solution(String str, char c)
    {
        int answer = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if ( str.toLowerCase().charAt(i) == c || str.toUpperCase().charAt(i) == c)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args)
    {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char c = in.nextLine().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
