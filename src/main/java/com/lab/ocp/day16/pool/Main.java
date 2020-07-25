/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day16.pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author MB-study
 */
public class Main {
    public static void main(String[] args) throws Exception{
        ExecutorService service = Executors.newCachedThreadPool();
        //ExecutorService service = Executors.newFixedThreadPool(3);
        //ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(new Task());
        service.submit(new LongTask());
        service.submit(new LongTask());
        Thread.sleep(100);
        service.submit(new Task());
        service.submit(new Task());
        service.submit(new LongTask());
        System.out.printf("執行緒數量:%d\n",Thread.activeCount());
        
        service.shutdown();
        while (!service.awaitTermination(1, TimeUnit.SECONDS)) {            
            System.err.println("Pool 持續有執行緒運行中, Pool 尚未關閉.");
        }
        
        System.out.println("Pool 關閉");
    }
    
}
