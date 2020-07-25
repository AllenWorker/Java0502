/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day16.order;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class Job implements Callable<Boolean> {
    private String name;

    public Job(String name) {
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception {
        Thread.sleep(1000);
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s請猜一數字: ",name);
        if(sc.nextInt() == 77) {
            return false;
        } else {
            return true;
        }
    }
    
}

public class ThreadOrder {
    public static void main(String[] args) throws Exception{
        Callable[] cs = {new Job("John"), new Job("Mary"), new Job("PC")};
        for(int i=0;;i=++i%cs.length) {
            FutureTask<Boolean> task = new FutureTask(cs[i]);
            new Thread(task).start();
            boolean value = task.get();
            if(value == false) break;
        }
    }
}
