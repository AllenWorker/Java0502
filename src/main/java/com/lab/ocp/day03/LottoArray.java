/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day03;

import java.util.Random;

/**
 *
 * @author MB-study
 */
public class LottoArray {

    public static void main(String[] args) {
        // 在陣列中放5筆資料
        int[] lotto = new int[5];
        putData(lotto);
        print(lotto);
        clearData(lotto);
        print(lotto);
        putData2(lotto);
        print(lotto);
        System.out.println(maxNumber(lotto));
        System.out.println(minNumber(lotto));
        
    }

    public static void clearData(int[] lottos) {
        for (int i = 0; i < lottos.length; i++) {
            lottos[i] = 0;
        }
    }

    public static void putData2(int[] lottos) {
        for (int i = 0; i < lottos.length;) {
            int rand = new Random().nextInt(9) + 1;
            if (!isExist(lottos, rand)) {
                lottos[i] = rand;
                i++;
            }
        }
    }

    public static boolean isExist(int[] lottos, int number) {
        for (int lotto : lottos) {
            if (lotto == number) {
                return true;
            }
        }
        return false;
    }

    public static void putData(int[] lottos) {
        for (int i = 0; i < lottos.length; i++) {
            lottos[i] = new Random().nextInt(9) + 1;
        }
    }

    public static void sort(int[] lottos) {
        for (int i = 0; i < lottos.length; i++) {
            for (int j = i + 1; j < lottos.length; j++) {
                if(lottos[i] > lottos[j]) {
                    int temp = lottos[i];
                    lottos[i] = lottos[j];
                    lottos[j] = temp;
                }
            }
        }
    }
    
    public static int maxNumber(int [] lottos) {
        int max = 0;
        for(int number : lottos){
            if(max<=number){
                max = number;
            }
        }
        return max;
    }
    
    public static int minNumber(int [] lottos) {
        int min = maxNumber(lottos);
        for(int number : lottos){
            if(min>=number){
                min = number;
            }
        }
        return min;
    }

    public static void print(int[] lottos) {
        for (int lotto : lottos) {
            System.out.print(lotto + " ");
        }
        System.out.println();
    }
}
