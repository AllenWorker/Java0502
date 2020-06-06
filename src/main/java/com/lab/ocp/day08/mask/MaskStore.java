/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08.mask;

import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class MaskStore {
    public static void main(String[] args) {
        Mask[] masks = {
            new AdultMask(),
            new AdultMask(),
            new AdultMask(),
            new AdultMask(),
            new AdultMask(),
            new ChildMask(),
            new ChildMask(),
            new ChildMask(),
            new ChildMask(),
            new ChildMask(),
        };
        int total = Arrays.stream(masks)
                .mapToInt(price -> price.getPrice())
                .sum();
        System.out.println(total);
        
        int sum = Arrays.stream(masks)
                .filter(mask -> mask instanceof AdultMask)
                .findFirst().get().getPrice()*3
                + 
                Arrays.stream(masks)
                .filter(mask -> mask instanceof ChildMask)
                .findFirst().get().getPrice()*2
                ;
        System.out.println(sum);
    }
}
