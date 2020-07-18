/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day15;

/**
 *
 * @author MB-study
 */
public class BallGanePlay {
    public static void main(String[] args) {
        BallGame ballgame = new BallGame(); //資源
        Thread t1 = new Thread(ballgame, "Mary");
        Thread t2 = new Thread(ballgame, "John");
        Thread t3 = new Thread(ballgame, "Helen");
        Thread t4 = new Thread(ballgame, "Tom");
        Thread t5 = new Thread(ballgame, "Joe");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
}
