/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day09;

import java.util.Objects;

/**
 *
 * @author MB-study
 */
public class Exam {
    private String subject;
    private Integer score;

    public Exam() {
    }

    public Exam(String subject, Integer score) {
        this.subject = subject;
        this.score = score;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.subject);
        hash = 41 * hash + Objects.hashCode(this.score);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Exam other = (Exam) obj;
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.score, other.score)) {
            return false;
        }
        return true;
    }
    
    

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Exam{" + "subject=" + subject + ", score=" + score + '}';
    }
    
    
}
