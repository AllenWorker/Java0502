/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day04;

import java.util.Random;

/**
 *
 * @author MB-study
 */
public class IFDemo {
    public static void main(String[] args) {
        int x = new Random().nextInt();
        if(isOdd(x)) {
            System.out.printf("%d 是偶數",x);
        } else {
            System.out.printf("%d 是奇數",x);
        }
    }
    
    public static boolean isOdd(int x) {
        
        return x%2==0;
    }
}
