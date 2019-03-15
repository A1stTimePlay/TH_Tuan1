package com.company;

import java.util.*;
public class Bai7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int n=input.nextInt();
        int dem=1;
        while (n!=0){
            if (n/10 !=0) dem++;
            n/=10;
        }
        System.out.println("n co "+dem+" chu so");
    }
}
