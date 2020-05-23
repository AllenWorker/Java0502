/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day05;

/**
 *
 * @author MB-study
 */
public class SideDish {

    private String name;
    private int price;

    public SideDish() {
        
    }

    
    public SideDish(String name, int price) {
        this.name = name;
        this.price = price;
    }

    
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("name: %s price: %d", name, price);
    }
    
    
}
