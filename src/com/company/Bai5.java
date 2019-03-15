package com.company;

import java.util.*;
public class Bai5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap so so hang: ");
        int n=input.nextInt();
        int KQ=0;
        for (int i=1;i<=n;i++)
            KQ+=i;
        System.out.println("Ket qua: "+KQ);
    }
}
