/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day06;

/**
 *
 * @author MB-study
 */
public class ClassRoom {
    public static void main(String[] args) {
        Teacher t = new Teacher("Vincent");
        Student s1 = new Student("John");
        Exam exam1 = new Exam("1z0-808", 85);
        s1.setExam(exam1);
        Student s2 = new Student("Mary");
        Exam exam2 = new Exam("1z0-808", 40);
        s2.setExam(exam2);
        Student s3 = new Student("Tom");
        Exam exam3 = new Exam("1z0-808", 72);
        s3.setExam(exam3);
        System.out.println(t);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
