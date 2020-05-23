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
public class Student extends Person{
    private Exam exam;

    public Student() {
    }
    
    public Student(String name) {
        super(name);
    }

    public Student(Exam exam) {
        this.exam = exam;
    }

    public Student(Exam exam, String name) {
        super(name);
        this.exam = exam;
    }
    

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Student{Name=" + getName() + " Exam: " + exam + '}';
    }
    
}
