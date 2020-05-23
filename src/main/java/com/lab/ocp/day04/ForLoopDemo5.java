/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day04;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;

/**
 *
 * @author MB-study
 */
public class ForLoopDemo5 {

    public static void main(String[] args) {
        //甲班學生國文與數學成績
        int[][] exams = {{100, 90}, {70, 80}, {40, 100}, {100, 100}, {80, 50}}; // [5][2]
        IntSummaryStatistics stat = Arrays.stream(exams)
                .mapToInt(exam -> exam[0])
                .summaryStatistics();
        System.out.printf("國文平均= %.2f\n", stat.getAverage());
        IntSummaryStatistics stat2 = Arrays.stream(exams)
                .mapToInt(exam -> exam[1])
                .summaryStatistics();
        System.out.printf("數學平均= %.2f\n", stat2.getAverage());
        
        DoubleSummaryStatistics totalAvg = Arrays.stream(exams)
                .mapToDouble(exam -> Arrays.stream(exam).average().getAsDouble())
                .summaryStatistics();
        
        System.out.printf("班平均= %.2f\n", totalAvg.getAverage());
        
        
        int chiFullScore = (int)Arrays.stream(exams)
                .mapToInt(exam -> exam[0])
                .filter(chinese -> chinese==100)
                .count();  
        System.out.printf("國文滿分有%d位\n", chiFullScore);
        
        
        
        
        int mathFullScore = (int)Arrays.stream(exams)
                .mapToInt(exam -> exam[1])
                .filter(math -> math==100)
                .count();  
        System.out.printf("數學滿分有%d位\n", mathFullScore);
        
        int fullScoreCount = (int)Arrays.stream(exams)
                .flatMapToInt(exam -> Arrays.stream(exam))
                .filter(score -> score == 100)
                .count();
        System.out.printf("總共有%d個滿分\n", fullScoreCount);
    }
}
