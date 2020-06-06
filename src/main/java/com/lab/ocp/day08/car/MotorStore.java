/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08.car;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class MotorStore {
    public static void main(String[] args) {
        Motor b1 = new BMW();
        Motor b2 = new BMW();
        Motor b3 = new Benz();
        Motor b4 = new Benz();
        Motor b5 = new Motocycle();
        Motor b6 = new Motocycle();
        Motor b7 = new Motocycle();
        Motor[] motors = {b1,b2,b3,b4,b5,b6,b7};
        
        //求 汽車/摩托車總價各是多少?
        
        int carSum = Arrays.stream(motors)
                .filter(car -> car instanceof Car)
                .mapToInt(car -> car.getPrice())
                .sum();

        
        int BikeSum = Arrays.stream(motors)
                .filter(car -> car instanceof Motocycle)
                .mapToInt(car -> car.getPrice())
                .sum();

        System.out.printf("汽車總價: %,d 摩托車總價: %,d",carSum,BikeSum);
    }
}
