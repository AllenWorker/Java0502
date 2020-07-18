/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class LuckyNumber implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.printf("%s 執行中...\n", Thread.currentThread().getName());
        Thread.sleep(5000);
        int n = new Random().nextInt(100);
        return n;
    }

}

//執行緒回傳值
public class CallableDemo {

    public static void main(String[] args) throws Exception {
        List<FutureTask> list = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            FutureTask<Integer> task = new FutureTask<>(new LuckyNumber());
            list.add(task);
            new Thread(task).start();
            System.out.println(task.get());
        }

    }
}
