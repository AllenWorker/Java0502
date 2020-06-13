/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day09;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author MB-study
 */
public class StudentDemo {
    public static void main(String[] args) throws FileNotFoundException {
    File file = new File("src\\main\\java\\com\\lab\\ocp\\day09\\exams.json");
    String json = new Scanner(file).useDelimiter("\\A").next();
    // import com.google.common.reflect.TypeToken;
    TypeToken typeToken = new TypeToken<Set<Student>>() {};
    // import java.lang.reflect.Type;
    Type type = typeToken.getType();
        Gson gson = new Gson();
        Set<Student> students = gson.fromJson(json, type);
        System.out.println(students);
        //請求出總分最高的人名
        
        int maxScore = students.stream().mapToInt(student -> student.getExams().stream().mapToInt(exam -> exam.getScore()).sum())
                .max().getAsInt();
        
        students.stream().filter(student -> student.getExams().stream().mapToInt(exam -> exam.getScore()).sum() == maxScore)
                .forEach(System.out::println);
        
        
        
    }
    
    
}
