/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day15.game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class Number {

    public static boolean gameover = false;
    private int ans = new Random().nextInt(99)+1;
    private boolean isUser = true; // User 先猜
    public int min = 0;
    public int max = 100;
    int guessNum = 0;

    public synchronized void userGuess() throws Exception {
        while (isUser) {
            wait();
        }
        if(gameover) return;
        System.out.printf("請User在%d - %d之間猜一數字: \n", min, max);
        //guessNum = new Random().nextInt(max - min - 1) + min + 1;
        Scanner scanner = new Scanner(System.in);
        guessNum = scanner.nextInt();
        System.out.printf("User猜 %d\n", guessNum);
        if(guessNum<=min || guessNum>=max) {
            System.out.println(guessNum + "不合法!");
            return;
        }
        if (guessNum == ans) {
            System.err.println("User答對了");
            gameover = true;
        } else if (guessNum > ans) {
            max = guessNum;
        } else {
            min = guessNum;
        }
        isUser = true;
        notifyAll();
    }

    public synchronized void pcGuess() throws Exception {
        while (!isUser) {
            wait();
        }
        if(gameover) return;
        System.out.printf("請PC在%d - %d之間猜一數字: \n", min, max);
        guessNum = new Random().nextInt(max - min - 1) + min + 1;
        System.out.printf("PC猜 %d\n", guessNum);
        if (guessNum == ans) {
            System.err.println("PC答對了");
            gameover = true;
        } else if (guessNum > ans) {
            max = guessNum;
        } else {
            min = guessNum;
        }
        isUser = false;
        notifyAll();
    }

}
