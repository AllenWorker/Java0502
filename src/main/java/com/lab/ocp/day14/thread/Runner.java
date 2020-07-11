/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day14.thread;

/**
 *
 * @author MB-study
 */
public class Runner extends Thread{

    public Runner() {
    }

    public Runner(String tname) {
        super(tname);
    }
    

    @Override
    public void run() {
        job();
    }
    
    
    public void job() {
        String tname = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s跑了 %d 步\n", tname, i);
            if(tname.equals("兔子") && i == 500) {
                try {
                    System.out.println(tname + "睡覺中...");
                    Thread.sleep(5000);
                } catch (Exception e) {
                    
                }
            }
        }
    }
}
