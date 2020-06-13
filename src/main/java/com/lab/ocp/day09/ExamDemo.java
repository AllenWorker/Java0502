/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day09;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.partitioningBy;

/**
 *
 * @author MB-study
 */
public class ExamDemo {

    public static void main(String[] args) {
        Exam e1 = new Exam("國文", 100);
        Exam e2 = new Exam("數學", 80);
        Exam e3 = new Exam("英文", 50);
        Exam e4 = new Exam("社會", 100);
        Exam e5 = new Exam("自然", 40);
        Set<Exam> exams = new HashSet<>();
        exams.add(e1);
        exams.add(e2);
        exams.add(e3);
        exams.add(e4);
        exams.add(e5);
        System.out.println(exams);

        double ave = exams.stream()
                .mapToInt(exam -> exam.getScore())
                .average().getAsDouble();

        int sum = exams.stream()
                .mapToInt(exam -> exam.getScore())
                .sum();
        int higescore = exams.stream()
                .mapToInt(exam -> exam.getScore())
                .max().getAsInt();
        exams.stream()
                .filter(exam -> exam.getScore()>= higescore)
                .forEach(System.out::println);
        System.out.printf("總分= %d 平均= %.2f\n", sum, ave);
        
        Map<Boolean, List<Exam>> map = exams.stream().collect(partitioningBy(e -> e.getScore() >= 60)); 
        System.out.println(map);
        
    }

}
