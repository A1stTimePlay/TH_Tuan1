package com.company;

import java.util.*;
public class Bai3 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhap so so hang: ");
        int n= input.nextInt();
        int KQ=0;
        for (int i=1;i<=n;i++){
            KQ+=(int) Math.pow(i,i);
        }
        System.out.print(("Ket qua: "+KQ));
    }
}
