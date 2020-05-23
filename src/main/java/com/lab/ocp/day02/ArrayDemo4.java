/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day02;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] scores = {40,70,30,90,100};
        int total = 0;
        int count = 0;
        //請計算出及格分數之平均
        for(int score : scores){
            if (score >= 60){
               total += score;
               count++;
            }
        }
        System.out.printf("%.1f\n",(double)total/count);
        
        System.out.printf("%.1f\n", Arrays.stream(scores).filter(score -> score>=60).average().getAsDouble());
        
    }
}
