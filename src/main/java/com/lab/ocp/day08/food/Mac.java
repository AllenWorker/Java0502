/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08.food;

/**
 *
 * @author MB-study
 */
public class Mac implements FastFood{
    private String name;
    private Integer price;
    private Integer count;

    public Mac() {
    }

    public Mac(String name, Integer price, Integer count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }
    
    
    
    @Override
    public Integer getCount() {
        return count;
    }

    @Override
    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }
    
}
