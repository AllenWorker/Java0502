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
public class Account {

    private String name;    // 帳戶名
    private int balance = 0; // 帳戶餘額

    public Account() {

    }

    public Account(String name, int balance) {
        setName(name);
        deposit(balance);
    }

    public boolean hasName() {  //有沒有名字
        return (name != null && !name.trim().isEmpty());
    }

    public void setName(String name) {
        if (name != null && name.trim().length() <= 10 && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            
            System.out.printf("帳戶名稱輸入錯誤! 錯誤名稱 %s\n", (name == null) ? "空值" : name);
        }
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int money) {
        if (!hasName()) {
            System.out.println("帳戶名不存在! 無法存款");
            return;
        }
        if (money > 0) {
            System.out.printf("提款金額: $%,d\n", money);
            if (balance >= money) {
                balance -= money;
            } else {
                System.out.println("帳戶餘額不足!");
            }
        } else {
            System.out.printf("提款金額錯誤! 金額: $%,d\n", money);
        }
        print();
    }

    public void deposit(int money) {
        if (!hasName()) {
            System.out.println("帳戶名不存在! 無法提款");
            return;
        }
        if (money > 0) {
            System.out.printf("存款金額: $%,d\n", money);
            balance += money;
        } else {
            System.out.printf("存款金額錯誤! 金額: $%,d\n", money);
        }
        print();
    }

    public void print() {
        if (!hasName()) {
            System.out.println("帳戶名不存在!");
            return;
        }
        System.out.printf("%s 帳戶餘額: $%,d\n", name, balance);
    }

}
