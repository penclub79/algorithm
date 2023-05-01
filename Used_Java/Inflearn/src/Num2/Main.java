package Inflearn.src.Num2;

import java.util.Scanner;

public class Main {

    public String solution(String str)
    {
        // 변수 초기화
        String answer = new String();

        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isUpperCase(str.charAt(i)))
                answer += str.toLowerCase().charAt(i);
            else
                answer += str.toUpperCase().charAt(i);
        }

        return answer;
    }

    public static void main(String[] args)
    {
        Main N = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(N.solution(str));
    }

}
