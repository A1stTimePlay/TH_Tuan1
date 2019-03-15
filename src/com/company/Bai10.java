/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

/**
 *
 * @author user
 */
import java.util.*;
public class Bai10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String x= input.nextLine();
        String y= input.nextLine();
        String a=x+y;
        System.out.println("Cau a");
        System.out.println("Tong chieu dai 2 chuoi: "+a.length());
        
        System.out.println("Cau b");
        System.out.println(x.substring(0,3));
        
        System.out.println("Cau c");
        System.out.println(y.substring(y.length()-3));
        
        System.out.println("Cau d");
        System.out.println(x.charAt(5));
        
        System.out.println("Cau e");
        String e=x.substring(0,3)+y.substring(y.length()-3);
        
        System.out.println("Cau f");
        if (x.equals(y)) System.out.println("2 chuoi bang nhau");
        else System.out.println("2 chuoi khong bang nhau");
        
        System.out.println("Cau g");
        if (x.equalsIgnoreCase(y)) System.out.println("2 chuoi bang nhau");
        else System.out.println("2 chuoi khong bang nhau");
        
        System.out.println("Cau h");
    }
}
