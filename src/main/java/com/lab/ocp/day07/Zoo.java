/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day07;

/**
 *
 * @author MB-study
 */
public class Zoo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.move();
        Ostrich ostrich = new Ostrich();
        ostrich.move();
        ostrich.motto();
    }
}
