/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day10;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author MB-study
 */
public class LinkListDemo2 {
    public static void main(String[] args) {
        List<Integer> scores = new LinkedList<>();
        IntStream.rangeClosed(1, 10)
                .forEach(i -> scores.add(new Random().nextInt(11)));
        System.out.println(scores);
        Collections.sort(scores);
        System.out.println(scores);
        scores.remove(0);
        scores.remove(0);
        scores.remove(scores.size()-1);
        scores.remove(scores.size()-1);
        System.out.println(scores);
        double avg = scores.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.printf("%.2f\n", avg);
        
    }
}
