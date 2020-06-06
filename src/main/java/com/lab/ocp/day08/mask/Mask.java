/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08.mask;

/**
 *
 * @author MB-study
 */
public abstract class Mask {
    private String size;

    public Mask(String size) {
        this.size = size;
    }

    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public abstract Integer getPrice();
}
