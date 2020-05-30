/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day07;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class VarargDemo {
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5,6,7,8,9));
    }
    
    public static int add(int... c) {
        return Arrays.stream(c).sum();
    }
}
