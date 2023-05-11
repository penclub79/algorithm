package Inflearn.src.Num16;

import java.util.Scanner;

public class Main {

    public static int Fibo(int n, int[] memo)
    {
        if (n == 1 || n == 2)
            return 1;

        if (memo[n] != 0)
            return memo[n];

        memo[n] = Fibo(n - 1, memo) + Fibo(n - 2, memo);

        return memo[n];
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] memo = new int[n+1];

        for (int i = 1; i <= n; i++)
        {
            System.out.print(	Fibo(i, memo) + " " );
        }
    }
}
