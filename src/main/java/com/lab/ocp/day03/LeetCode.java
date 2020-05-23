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
public class LeetCode {
    public static void main(String[] args) {
        int[] nums = {6,11,2,14,7};
        int target = 16;
        System.out.println(twoSum(nums, target)[0]);
        System.out.println(twoSum(nums, target)[1]);
        
        
        //print [0, 2]
    }
    
    public static int [] twoSum(int [] nums, int target) {
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++) {
            if(nums[i]<target) {
                for(int j=i+1;j<nums.length;j++) {
                    if(nums[j] == target - nums[i]) {
                        ans[0] = i;
                        ans[1] = j;
                        return ans;
                    }
                }
            }
        }
        
        return null;
    }
}
