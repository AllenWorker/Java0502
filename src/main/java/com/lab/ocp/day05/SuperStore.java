/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day05;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class SuperStore {
    public static void main(String[] args) {
        Hamburger h1 = new Hamburger("大麥克",70);
        Hamburger h2 = new Hamburger("麥香魚",50);
        SideDish s1 = new SideDish("薯條", 30);
        SideDish s2 = new SideDish("沙拉", 40);
        Drink d1 = new Drink("可樂",25);
        Drink d2 = new Drink("咖啡",45);
        Drink d3 = new Drink("紅茶",30);
        
        //set
        FastFood f = new FastFood("一號餐");
        f.setHameburger(h2);
        f.setSidedish(s2);
        f.setDrink(d3);
        
        FastFood f2 = new FastFood("二號餐", h1, s1, d1);
        
        
        System.out.println(f);
        System.out.println("$"+f.getPrice());
        
        System.out.println(f2);
        System.out.println("$"+f2.getPrice());
        
        // combo set
        FastFood[] ffs = {f, f2, f, f, f2};
        
        int sum = Arrays.stream(ffs).mapToInt(set -> set.getPrice())
                .sum();
        System.out.println("總計: " + sum);
        
        double drinkPercent = ((double)(Arrays.stream(ffs).mapToInt(drink -> drink.getDrink().getPrice())
                .sum()) / sum) * 100;
        System.out.printf("%.2f%%\n",drinkPercent);
    }
}
