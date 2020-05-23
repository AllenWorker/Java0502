/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day03;

/**
 *
 * @author MB-study
 */
public class MultiArrayDemo2 {
    public static void main(String[] args) {
        int[][]nums = new int[2][5];
        System.out.println("nums[0] length = " + nums[0].length);
        System.out.println("nums[1] length = " + nums[1].length);
        nums[0] = new int[3];
        nums[1] = new int[1];
        System.out.println("nums[0] length = " + nums[0].length);
        System.out.println("nums[1] length = " + nums[1].length);
    }
}
