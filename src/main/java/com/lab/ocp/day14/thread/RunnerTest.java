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
public class RunnerTest {
    public static void main(String[] args) {
        Runner r1 = new Runner("烏龜");
        Runner r2 = new Runner("兔子");
        r1.start(); // 下達start()方法後會進入"排程"並執行run()方法
        r2.start();
    }
}
