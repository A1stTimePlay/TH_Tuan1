/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author user
 */
import java.util.*;
import java.math.*;

public class Bai9 {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        System.out.println("Nhap so: ");
        int n=input.nextInt();
        for (int i=2;i<n;i++){
            if (n%i==0){
                System.out.println("khong phai so nguyen to");
                return;
            }
        }
        System.out.println("la so nguyen to");
    }
    
}
