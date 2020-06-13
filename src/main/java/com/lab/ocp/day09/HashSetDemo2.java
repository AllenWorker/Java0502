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
public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("國文");hs.add(100);
        hs.add("數學");hs.add(90);
        hs.add("英文");hs.add(100);
        hs.add(null);hs.add(3.14);
        System.out.println(hs);
        //印出每一筆資料
        for(Object obj : hs){
            System.out.println(obj);
        }
        
        //印出每一筆資料 Java 8
        hs.forEach(obj -> System.out.println(obj));
        hs.forEach(System.out::println);
    }
}
