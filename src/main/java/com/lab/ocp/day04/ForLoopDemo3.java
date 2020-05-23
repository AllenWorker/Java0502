/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day04;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author MB-study
 */
public class ForLoopDemo3 {
    public static void main(String[] args) {
        String[] names = {"John", "Mary", "Tom", "Helen", "Yuki"};
        Arrays.stream(names)
                .forEach(name -> System.out.printf("%s ", name));
    }
}
