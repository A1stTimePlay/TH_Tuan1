package com.company;

import java.util.*;
public class Bai6 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap so: ");
        int n= input.nextInt();
        for (int i=2;i<n;i++)
            if (n%i==0) System.out.print(i +" ");
    }
}
