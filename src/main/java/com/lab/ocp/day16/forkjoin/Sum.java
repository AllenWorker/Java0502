/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day16.forkjoin;

import java.util.concurrent.RecursiveAction;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MB-study
 */
public class Sum extends RecursiveAction {
    final int A = 3;
    int stIndex, lstIndex;
    int[] data;

    public Sum(int[] data, int start, int end) {
        this.stIndex = start;
        this.lstIndex = end;
        this.data = data;
    }
    
    
    @Override
    protected void compute() {
        try {
            if (lstIndex - stIndex <= A) { // 小於等於門檻值就直接求解
                int sum = 0;
                for (int i = stIndex; i < lstIndex; i++) {
                    sum += data[i];
                }
                System.out.printf("sum: %d\n", sum);
            } else {    //進行拆分
                new Sum(data, stIndex + A, lstIndex).fork();
                //Thread.sleep(1000);
                new Sum(data, stIndex, Math.min(lstIndex, stIndex + A)).compute();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }

}
