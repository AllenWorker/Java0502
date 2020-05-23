/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Scanner;
import javax.net.ssl.KeyStoreBuilderParameters;

/**
 *
 * @author MB-study
 */
public class Classroom3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day06\\javaexam.csv");
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(file);
        String data = sc.useDelimiter("\\A").next();
        //System.out.println(data);
        String[] rows = data.split("\r\n");
        //Arrays.stream(rows).forEach(row -> System.out.println(row));
        for(String row : rows) {
            String[] blocks = row.split(",");
            students.add(new Student(new Exam(blocks[1],Integer.parseInt(blocks[2])), blocks[0]));
        }
        students.forEach(student -> System.out.println(student));
        double avg = students.stream().mapToInt(student -> student.getExam().getScore())
                .average().getAsDouble();
        System.out.printf("班平均: %.2f\n",avg);
        
        IntSummaryStatistics stat = students.stream().mapToInt(student -> student.getExam().getScore())
                .summaryStatistics();
        String maxStudent = students.stream()
                .filter(s ->s.getExam().getScore() == stat.getMax())
                .findFirst()
                .get()
                .getName();
        String minStudent = students.stream()
                .filter(s ->s.getExam().getScore() == stat.getMin())
                .findFirst()
                .get()
                .getName();
        System.out.println("最高分: " + maxStudent);
        System.out.println("最低分: " + minStudent);
        System.out.println(stat);
        
        students.stream()
                .filter(student -> student.getExam().getScore()>=65)
                .forEach(student -> System.out.println(student.getName() + " " + student.getExam().getScore() + "分 " + " 通過考試!"));
        
        double passAvg = students.stream()
                .filter(student -> student.getExam().getScore()>=65)
                .mapToInt(student ->student.getExam().getScore())
                .average().getAsDouble();
        System.out.printf("通過的平均成績: %.2f\n", passAvg);
    }
}
