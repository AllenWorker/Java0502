/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day16.pool;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MB-study
 */
public class LongTask implements Runnable{

    @Override
    public void run() {
        System.out.println("長任務開始");
        int n = new Random().nextInt(9000);
        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(9)+1);
        } catch (Exception e) {
        }
        n += 1000;
        System.out.printf("長任務(得到1000~9999的值): %d執行完成\n", n);
        System.out.println("長任務結束");
    }
    
}
