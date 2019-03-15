package com.company;

import java.util.*;
public class Bai8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int n=input.nextInt();
        boolean KQ=true;

        //tính số chữ số
        int dem=1;
        int temp=n;
        while (temp!=0){
            if (temp/10 !=0) dem++;
            temp/=10;
        }
        dem-=1;

        //kiểm tra đối xứng
        while(n>10){
            int x=n/(int)Math.pow(10,dem);
            if (x!=(n%10)) {
                KQ=false;
                break;
            }
            n=n%(int)Math.pow(10,dem);
            n/=10;
            dem-=2;
        }
        if (KQ) System.out.println("n doi xung");
        else System.out.println("n khong doi xung");
    }
}
