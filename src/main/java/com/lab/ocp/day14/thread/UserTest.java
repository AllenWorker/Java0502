/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day14.thread;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

class Egg extends Thread {

    int[] e = new int[10];

    @Override
    public void run() {
        for (int i = 0; i < e.length; i++) {
            try {
                Thread.sleep(new Random().nextInt(5000));
                int value = new Random().nextInt(100) + 1;
                e[i] = value;
                System.out.printf("e[%d] = %d \n", i, value);
            } catch (Exception e) {
            }
        }

    }

}

class Bread extends Thread {

    int[] b = new int[10];

    @Override
    public void run() {
        for (int i = 0; i < b.length; i++) {
            try {
                Thread.sleep(new Random().nextInt(5000));
                int value = new Random().nextInt(100) + 1;
                b[i] = value;
                System.out.printf("b[%d] = %d \n", i, value);
            } catch (Exception e) {
            }
        }

    }

}

class User extends Thread {

    Egg egg;
    Bread bread;
    int[] u = new int[10];

    public User(Egg egg, Bread bread) {
        this.egg = egg;
        this.bread = bread;
    }

    @Override
    public void run() {
        for (int i = 0; i < u.length;) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            if (egg.e[i] != 0 && bread.b[i] != 0) {

                u[i] = egg.e[i] + bread.b[i];
                System.out.printf("\tu[%d] = %d\n", i, u[i]);
                i++;
            } else {
                //System.out.println("skip");
                continue;
            }
            // print出每一個e[i] + b[i] 的資料

        }
    }
}

public class UserTest {

    public static void main(String[] args) throws InterruptedException {
        Egg egg = new Egg();
        Bread bread = new Bread();
        User user = new User(egg, bread);
        egg.start();
        bread.start();
        user.start();

    }
}
