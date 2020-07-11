/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day14.thread;

import java.util.Random;

/**
 *
 * @author MB-study
 */
class LuckyNumber extends Thread {

    public LuckyNumber(String string) {
        super(string);
    }

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        int count = 0;
        while (true) {
            int n = new Random().nextInt(1000);
            count++;
            if (n == 777) {
                break;
            }
        }
        System.out.printf("%s取了%d次才取得777\n", tname, count);
    }

}

public class LuckyTest {

    public static void main(String[] args) {
        LuckyNumber n1 = new LuckyNumber("小明");
        LuckyNumber n2 = new LuckyNumber("小華");
        n1.start();
        n2.start();
    }

}
