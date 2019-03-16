package com.company;

import java.lang.reflect.Array;
import java.util.*;
public class Bai13 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Moi nhap vao do dai mang A: ");
        int n= input.nextInt();
        System.out.println("Moi nhap vao do dai mang B: ");
        int m=input.nextInt();
        int[] arrA=new int[n];
        int[] arrB=new int[m];

        System.out.println("Nhap day phan tu mang A: ");
        for (int i=0;i<n;i++){
            arrA[i]=input.nextInt();
        }

        //a
        System.out.println("Cac phan tu mang B se duoc tao random");
        for (int i=0;i<m;i++){
            arrB[i]=(int)(Math.random()*100000);
        }

        //b
        System.out.println(Arrays.toString(arrB));

        //c
        int[] arrC=Arrays.copyOf(arrA, n);
        System.out.println(Arrays.toString(arrC));

        //d
        System.arraycopy(arrB,m-3, arrC, 0,3);
        System.out.println(Arrays.toString(arrC));

        //e
        Arrays.sort(arrC);
        System.out.println(Arrays.toString(arrC));

        //f
        System.out.println("Nhap so can kiem tra co trong mang C: ");
        int x=input.nextInt();
        System.out.println("Vi tri phan tu x trong mang C: "+Arrays.binarySearch(arrC,x));
    }
}
