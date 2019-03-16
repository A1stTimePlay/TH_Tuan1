package com.company;

import java.util.Scanner;

public class Bai15 {
    public static boolean SNT(int a){
        for (int i=2;i<a;i++){
            if (a%i==0) return false;
        }
        return true;
    }
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhap do lon matran m*n: ");
        int m=input.nextInt();
        int n=input.nextInt();
        int[][] Array= new int[m][n];
        System.out.println("Nhap ma tran: ");
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++)
                Array[i][j]= input.nextInt();

        int min=100000;
        int max=0;
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++){
                if (Array[i][j]>max) max=Array[i][j];
                if (Array[i][j]<min) min=Array[i][j];
            }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);

        System.out.println("Cac so nguyen to trong ma tran");
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++) {
                if (Bai15.SNT(Array[i][j])) System.out.print(Array[i][j]+" ");
            }

        int Tong=0;
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++) {
                Tong+=Array[i][j];
            }
        System.out.println("Tong: "+Tong);
    }
}
