/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day13;

import java.util.stream.IntStream;

/**
 *
 * @author MB-study
 */
class BigData {
    StringBuffer sb;
    {
        sb = new StringBuffer();
        IntStream.rangeClosed(1, 3500_0000)
                .forEach((i) -> sb.append(i));
    }

    @Override
    protected void finalize() throws Throwable {
        String tname = Thread.currentThread().getName();
        System.out.println(tname);
        System.out.println("BigData 功成身退 被回收了");
    }
    
    
}

public class GCDemo {
    public static void main(String[] args) {
        String tname = Thread.currentThread().getName();
        System.out.println(tname);
        System.gc();
        long free = Runtime.getRuntime().freeMemory();
        System.out.printf("free: %d bytes\n", free);
        BigData bigData = new BigData();
        free = Runtime.getRuntime().freeMemory();
        System.out.printf("free: %d bytes\n", free);
        bigData = null;
        System.gc();
        System.out.println("其他處理邏輯");
        //BigData bigData2 = new BigData();
        free = Runtime.getRuntime().freeMemory();
        System.out.printf("free: %d bytes\n", free);
    }
}
