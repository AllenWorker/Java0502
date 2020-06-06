/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08;

/**
 *
 * @author MB-study
 */
public class Company {
    private String name = "ABC"; //公司名稱
    
    //公司願景
    public void printGoal(int year){
        //(final) int year
        class Goal {
            void printYear() {
                System.out.printf("%d 願景...\n", year);
            }
        }
        Goal goal = new Goal();
        goal.printYear();
    }
    //建立員工類別
    public class Employee {
        private String name = "John";
        public int getSalary() {
            return 40000;
        }
        public void job() {
            String name = "寫程式"; //工作內容名稱
            System.out.printf("%s 在 %s 公司的工作內容是: %s\n", this.name, Company.this.name, name);
        }
    }

    
    
    
}
