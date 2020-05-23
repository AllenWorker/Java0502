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
public class FastFood {
    private String name;
    private Hamburger hameburger;
    private SideDish sidedish;
    private Drink drink;

    public FastFood() {
    }

    public FastFood(String name) {
        this.name = name;
    }

    public FastFood(String name, Hamburger hameburger, SideDish sidedish, Drink drink) {
        this.name = name;
        this.hameburger = hameburger;
        this.sidedish = sidedish;
        this.drink = drink;
    }
    
    

    public String getName() {
        return name;
    }

    public Hamburger getHameburger() {
        return hameburger;
    }

    public void setHameburger(Hamburger hameburger) {
        this.hameburger = hameburger;
    }

    public SideDish getSidedish() {
        return sidedish;
    }

    public void setSidedish(SideDish sidedish) {
        this.sidedish = sidedish;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
    
    public int getPrice() {
        int price = hameburger.getPrice()+sidedish.getPrice()+drink.getPrice();
        return price;
    }

    @Override
    public String toString() {
        return "FastFood{" + "name=" + name + ", hameburger=" + hameburger + ", sidedish=" + sidedish + ", drink=" + drink + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
