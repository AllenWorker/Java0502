/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day01;

/**
 *
 * @author MB-study
 */
public class AccountMain {
    public static void main(String[] args) {
        Account acc1 = new Account(null, 10000);
        acc1.deposit(100);
        acc1.deposit(100);
        acc1.deposit(100);
        acc1.deposit(-100);
        acc1.withdraw(600);
        acc1.withdraw(10_000);
    }
}
