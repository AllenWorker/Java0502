/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day15.game;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MB-study
 */
public class Guess implements Runnable {

    private Number number;

    public Guess(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        while (!Number.gameover) {
            int min = number.min;
            int max = number.max;
            try {
                if (tname.equals("pc")) {
                    
                    number.pcGuess();

                } else { //user
                    //int num = new Random().nextInt(max - min - 1) + min + 1;
                    
                    number.userGuess();
                }
            } catch (Exception e) {
                
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Guess.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
