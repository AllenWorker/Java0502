/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day09;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *
 * @author MB-study
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("國文");hs.add("數學");hs.add("英文");
        System.out.println(hs);
        hs = new LinkedHashSet();
        hs.add("國文");hs.add("數學");hs.add("英文");
        System.out.println(hs);
        
    }
}
