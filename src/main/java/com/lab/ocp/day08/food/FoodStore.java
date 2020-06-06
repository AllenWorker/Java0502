/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08.food;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class FoodStore {
    public static void main(String[] args) {
        Food f1 = new BigMac("大麥克",70,12);
        Food f2 = new BigMac("麥香魚",50,15);
        Food[] foods= {f1,f2};
        Arrays.stream(foods)
                .forEach(food -> System.out.printf("品名: %s 價格: %d\n", food.getName(),food.getPrice()));
        
        int sum = Arrays.stream(foods)
                .filter(food -> food instanceof FastFood)
                //.map(food -> (FastFood)food)
                .mapToInt(food -> food.getPrice() * ((FastFood)food).getCount())
                .sum();
        System.out.println("總計: " + sum);
    }
}
