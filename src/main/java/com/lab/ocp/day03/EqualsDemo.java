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
public class EqualsDemo {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'A';
        System.out.println(c1==c2);
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        String s3 = "Java";
        String s4 = "Java";
        System.out.println(s3==s4);
        System.out.println(s2==s4);
        char[] c = {'J','a','v','a'};
        String s5 = new String(c);
        System.out.println(s5);
        System.out.println(s1.equals(s5));
        System.out.println(s3.equals(s5));
    }
}
