/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day03;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class TicTacToe2 {

    public static void main(String[] args) {
        char[] c = new char[9];
        do {
            humanRun(c);
            pcRun(c);
            print(c);
            winner(c);
        } while (true);

    }
    
    public static void humanRun(char [] c) {
        while (true) {            
            Scanner sc = new Scanner(System.in);
            System.out.print("選擇位置0~8:");
            int pos = sc.nextInt();
            if(c[pos]=='\u0000'){
                c[pos] = 'O';
                break;
            } else {
                System.out.println("該位置不可選!");
            }
            
        }
    }
    
    public static void pcRun(char[] c) {
        while (true) {            
            int randPos = new Random().nextInt(c.length);
            if(c[randPos] == '\u0000') {
                c[randPos] = 'X';
                break;
            }
        }
    }

    public static void print(char[] c) {
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < c.length; i++) {
            System.out.print("|\t" + c[i]+"\t");
            if (i % 3 == 2) {
                System.out.println("|");
                System.out.println("-----------------------------------------------");
            }
        }
    }

    public static void winner(char[] c) {
        if (c[0] + c[1] + c[2] == 'O' * 3
                || c[3] + c[4] + c[5] == 'O' * 3
                || c[6] + c[7] + c[8] == 'O' * 3
                || c[0] + c[3] + c[6] == 'O' * 3
                || c[1] + c[4] + c[7] == 'O' * 3
                || c[2] + c[5] + c[8] == 'O' * 3
                || c[0] + c[4] + c[8] == 'O' * 3
                || c[2] + c[4] + c[6] == 'O' * 3) {
            System.out.println("Winner: O");
            System.exit(0);
        } else if (c[0] + c[1] + c[2] == 'X' * 3
                || c[3] + c[4] + c[5] == 'X' * 3
                || c[6] + c[7] + c[8] == 'X' * 3
                || c[0] + c[3] + c[6] == 'X' * 3
                || c[1] + c[4] + c[7] == 'X' * 3
                || c[2] + c[5] + c[8] == 'X' * 3
                || c[0] + c[4] + c[8] == 'X' * 3
                || c[2] + c[4] + c[6] == 'X' * 3) {
            System.out.println("Winner: X");
            System.exit(0);
        } else {
            //System.out.println("No Winner");
        }

    }
}
