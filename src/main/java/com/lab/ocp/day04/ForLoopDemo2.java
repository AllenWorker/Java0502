/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day04;

import java.util.stream.IntStream;

/**
 *
 * @author MB-study
 */
public class ForLoopDemo2 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).forEach(i -> {System.out.printf("%d ", i);});
        System.out.println();
        String[] names = {"John", "Mary", "Tom", "Helen", "Yuki"};
        IntStream.range(0, names.length)
                .filter(i -> names[i].length() >= 4)
                .forEach(i -> System.out.printf("%s ", names[i]));
        System.out.println();
        
        for(int i=0;i<names.length;i++){
            if(names[i].length() >= 4) {
                System.out.printf("%s ", names[i]);
            }
        }
        System.out.println();
        
    }
}
