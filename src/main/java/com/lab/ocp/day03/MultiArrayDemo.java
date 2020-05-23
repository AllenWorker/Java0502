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
public class MultiArrayDemo {
    public static void main(String[] args) {
        //int[][]nums = new int[2][3];
        //nums[0][1] = 100;
        //nums[0][2] = 90;
        //nums[0][3] = 80;
        //nums[1][1] = 70;
        //nums[1][2] = 60;
        //nums[1][3] = 50;
        int[][]nums ={{100,90,80},{70,60,50}};
        
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
