package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Bai11 {
    static public void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Nhap theo thu tu Nam, Thang, Ngay của A ");
        int Y=input.nextInt();
        int M=input.nextInt();
        int D=input.nextInt();
        GregorianCalendar a=new GregorianCalendar(Y,M-1,D);

        System.out.println("Nhap theo thu tu Nam, Thang, Ngay của B ");
        Y=input.nextInt();
        M=input.nextInt();
        D=input.nextInt();
        GregorianCalendar b=new GregorianCalendar(Y,M-1,D);

        System.out.println(a.getTime());
        System.out.println(b.getTime());

        System.out.println("So sanh ngay a voi ngay b: ");
        System.out.println(a.compareTo(b));

        GregorianCalendar temp= (GregorianCalendar) a.clone();
        temp.add(GregorianCalendar.DATE,1);
        System.out.println("Ngay tiep theo cua a: "+ temp.getTime());

        temp= (GregorianCalendar) a.clone();
        temp.add(GregorianCalendar.DATE,-1);
        System.out.println("Ngay truoc do cua a: "+ temp.getTime());

        if (a.isLeapYear(a.YEAR)) System.out.println("La nam nhuan");
        if (!a.isLeapYear(a.YEAR)) System.out.println("Khong la nam nhuan");
    }
}
