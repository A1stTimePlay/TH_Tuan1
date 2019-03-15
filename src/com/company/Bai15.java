package com.company;

import java.util.*;
public class Bai15 {
    static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("nhap do lon ma tran m*n: ");
        int m=input.nextInt();
        int n=input.nextInt();
        int array[][]= new int[m][n];
        int max=0;
        int min=1000000000;
        int Tong=0;
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++){
                if (array[i][j]>max) max=array[i][j];
                if (array[i][j]<min) min=array[i][j];
                Tong+=array[i][j];
            }

    }
}
