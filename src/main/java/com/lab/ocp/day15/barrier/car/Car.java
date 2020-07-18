/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day15.barrier.car;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author MB-study
 */
public class Car extends Thread{
    private CyclicBarrier cb;

    public Car(CyclicBarrier cb) {
        this.cb = cb;
    }
    
    

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        System.out.printf("%s 從台北出發...\n",tname);
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.printf("%s 到台中了!\n", tname);
            cb.await();
        } catch (Exception e) {
            System.out.printf("%s 發收車禍了!\n",tname);
            return;
        }
        System.out.printf("%s 繼續往高雄出發...\n",tname);
    }
    
}
