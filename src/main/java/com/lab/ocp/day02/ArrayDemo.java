/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day02;

/**
 *
 * @author MB-study
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 100;
        nums[1] = 90;
        nums[2] = 80;
        for(int number : nums) {
            System.out.println(number);
        }
        System.out.println(nums);
        System.out.println(nums.length);
        //陣列的最小維度=0 陣列的最大維度=陣列長度-1
    }
}
