/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day15;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author MB-study
 */
public class BallGame implements Runnable{
    private int amount = 10000;
    private Map<String, Integer> map = new Hashtable<>();
    
    public synchronized void get() {
        if(amount <= 0) return;
        String tname = Thread.currentThread().getName();
        System.out.printf("%s 取到第%d顆球\n",tname, amount);
        amount--;
        map.put(tname, map.get(tname) + 1);
    }
    
    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        map.put(tname, 0);
        while(amount>0) {
            get();
        }
        System.out.println(map);
    }
}
