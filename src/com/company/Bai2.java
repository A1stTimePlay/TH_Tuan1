package com.company;

import java.util.*;
public class Bai2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap ban kinh duong tron: ");
        double R= input.nextDouble();
        double S= Math.PI*R;
        System.out.println("Chu vi: "+S);
    }
}
