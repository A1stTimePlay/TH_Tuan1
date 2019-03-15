package com.company;

import java.util.*;
public class Bai13 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Moi nhap vao do dai mang: ");
        int n= input.nextInt();
        int[] arrA=new int[n];
        int[] arrB=new int[n];
        System.out.println("Nhap day phan tu mang A: ");
        for (int i=0;i<n;i++){
            arrA[i]=input.nextInt();
            arrB[i]=(int)Math.random();
        }
        System.out.println(arrB.toString());

    }
}
