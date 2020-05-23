/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class Classroom2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day06\\javaexam.csv");
        ArrayList<Student> students = new ArrayList<Student>();
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
    }
}
