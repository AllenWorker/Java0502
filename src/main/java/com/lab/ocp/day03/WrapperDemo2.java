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
public class WrapperDemo2 {

    public static void main(String[] args) {
        int a = 100;
        Integer b = Integer.valueOf("100");
        Integer c = 200; //auto boxing
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b.intValue()); //old Java5
        System.out.println(a + b); //auto unboxing
        System.out.println(a + c);
    }
}
