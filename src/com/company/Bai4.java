package com.company;

import java.util.*;
public class Bai4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap a va b: ");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c=a/b;
        System.out.printf("%.3f",c);
    }
}
