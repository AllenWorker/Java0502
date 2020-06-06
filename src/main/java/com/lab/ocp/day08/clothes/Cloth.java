/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08.clothes;

/**
 *
 * @author MB-study
 */
public class Cloth implements ICloth{
    private String kind;
    private char size;
    private Integer price;
    private Integer amount;

    public Cloth() {
    }

    public Cloth(String kind, char size, Integer price, Integer amount) {
        this.kind = kind;
        this.size = size;
        this.price = price;
        this.amount = amount;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    
    
}
