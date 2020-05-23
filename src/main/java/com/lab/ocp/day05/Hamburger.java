/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day05;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

/**
 *
 * @author MB-study
 */
public class Hamburger {
    private String name;
    private  int price;
    
    public Hamburger() {
        
    }
    
    public Hamburger(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public void cook() {
        System.out.println(name + "作法");
        String food = "";
        switch(name) {
            case "大麥克":
                food = "牛肉";
                break;
            case "麥香魚":
                food = "鱈魚";
                break;
            
            default:
                food = "Unknown";
                break;
        }
        System.out.println("1.放麵包");
        System.out.println("2.放" + food);
        System.out.println("3.放醬料");
        System.out.println("4.包裝");
        System.out.println("-----------------------------");
    }
    @Override
    public String toString() {
        return String.format("name: %s price: %d", name, price);
    }
    
}
