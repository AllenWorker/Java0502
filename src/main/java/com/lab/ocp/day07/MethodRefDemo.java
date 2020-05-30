/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day07;

class Foo {
    public void play() {
        System.out.println("Baseball");
    }
}

class Bar extends Foo{
    public void play() {
        System.out.println("Basketball");
        super.play();
    }
}
 
public class MethodRefDemo {
    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.play();
    }
}
