/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day06;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class Store {
    public static void main(String[] args) {
        Food[] foods = {
            new Drink("可樂", 25),
            new Hamburger("大麥克", 70),
            new SideDish("玉米湯", 40),
        };
        
        System.out.println(foods[0]);
        Food food = new Drink("可樂",45);
    }
}
