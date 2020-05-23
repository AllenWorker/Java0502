/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day04;

/**
 *
 * @author MB-study
 */
public class ForLoopDemo {
    static int i;
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.printf("%d ",i);
        }
        System.out.println();
        for(init();expr(10);step()){
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
    public static void init() {
        i = 0;
    }
    
    public static boolean expr(int step) {
        return i<step;
    }
    
    public static void step() {
        i++;
    }
}
