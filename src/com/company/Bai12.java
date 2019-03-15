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
import java.math.*;

public class Bai12 {
    public static void main(String[] args){
        BigInteger a=new BigInteger("1234567890");
        BigInteger b=new BigInteger("9876654321");
        BigInteger c=new BigInteger("3");
        BigInteger KQ=new BigInteger("0");
        KQ=a.add(b.multiply(c));
        System.out.println(KQ);
    }
}
