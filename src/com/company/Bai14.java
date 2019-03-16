package com.company;

import java.util.Scanner;

public class Bai14 {
    static public int GT(int a){
        int KQ=1;
        for (int i=2;i<=a;i++)
            KQ*=i;
        return KQ;
    }
    static public int ToHop(int n, int k){
        int KQ= Bai14.GT(n)/(Bai14.GT(k)*Bai14.GT(n-k));
        return KQ;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arrPascal = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j <= i; j++)
                arrPascal[i][j] = Bai14.ToHop(i, j);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arrPascal[i][j] + " ");
            System.out.println();
        }
    }
}
