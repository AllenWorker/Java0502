/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day09;

import java.util.HashSet;

/**
 *
 * @author MB-study
 */
public class HashSetDemo3 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("國文");hs.add(100);
        hs.add("數學");hs.add(90);
        hs.add("英文");hs.add(100);
        hs.add(null);hs.add(3.14);
        System.out.println(hs);
        //求出元素中整數資料相加的結果
        // Java 7
        int sum = 0;
        for(Object obj : hs){
            if(obj instanceof Integer) {
                sum +=(Integer)obj;
            }
        }
        System.out.printf("Sum = %d\n",sum);
        
        // Java 8 利用 stream
        sum = hs.stream()
                .filter(obj -> obj instanceof Integer)
                .mapToInt(obj -> Integer.parseInt(obj.toString()))
                .sum();
        System.out.printf("Sum = %d\n",sum);
        System.out.println(hs);
    }
}
