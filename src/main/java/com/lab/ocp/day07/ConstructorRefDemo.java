/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day07;

//建構子關聯呼叫
class Father {
    public Father() {
        this(10);
        System.out.println("C");
    }
    
    public Father(int x) {
        System.out.println("D");
    }
}

class Son extends Father{
    public Son() {
        this(10);
        System.out.println("A");
    }
    
    public Son(int x) {
        System.out.println("B");
    }
}


public class ConstructorRefDemo {
    public static void main(String[] args) {
        Son son = new Son();
        
    }
}
