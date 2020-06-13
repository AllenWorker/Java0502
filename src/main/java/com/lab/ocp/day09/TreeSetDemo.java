/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day09;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author MB-study
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> lotto = new TreeSet<>();
        lotto.add(10);
        lotto.add(50);
        lotto.add(20);
        lotto.add(40);
        lotto.add(30);
        System.out.println(lotto);
    }
}
