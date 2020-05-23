/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day03;

/**
 *
 * @author MB-study
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s = "Java";
        add(s);
        System.out.println(s);
    }
    
    public static void add(String s) {
        s = s+"8";
         System.out.println("在 add方法的S="+s);
    }
}
