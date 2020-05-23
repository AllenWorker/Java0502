/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 *
 * @author MB-study
 */
public class Store3 {
    public static void main(String[] args) {
        Hamburger[] hamburgers = {
            new Hamburger("麥香魚", 50),
            new Hamburger("麥香魚", 60),
            new Hamburger("大麥克", 90),
            new Hamburger("麥香魚", 60),
            new Hamburger("大麥克", 90),
            new Hamburger("吉士滿意", 100),
            new Hamburger("麥香雞", 60),
            new Hamburger("小漢堡", 30),
            new Hamburger("吉事漢堡", 40),
        };
        int sum = Arrays.stream(hamburgers)
                .mapToInt(hamburger -> hamburger.getPrice())
                .sum();
        System.out.printf("總和: %d\n", sum);
        
        double avg = Arrays.stream(hamburgers)
                .mapToInt(hamburger -> hamburger.getPrice())
                .average().getAsDouble();
        System.out.printf("平均: %.2f\n", avg);
        IntSummaryStatistics stat = Arrays.stream(hamburgers)
                .mapToInt(hamburger -> hamburger.getPrice())
                .summaryStatistics();
        System.out.printf("平均: %.2f\n", stat.getAverage());
        
    }
}
