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
public class StringDemo {
    public static void main(String[] args) {
        String word = "she sell sea shell on the sea shore";
        System.out.println(word.length());
        System.out.println(word.split(" ").length);
        
        char[] chars = word.toCharArray();
        int sum = 0;
        for(char letter : chars) {
            if (letter == 's') {
                sum++;
            }
        }
        System.out.println(sum);
        int wordSum = 0;
        String[] wordArray = word.split(" ");
        for(String words : wordArray) {
            if(words.equals("sea")) {
                wordSum++;
            }
        }
        System.out.println(wordSum);
    }
}
