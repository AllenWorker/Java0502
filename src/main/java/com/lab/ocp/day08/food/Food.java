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
public interface Food {
    //品名 getter/setter
    String getName();
    void setName(String name);
    //價格 getter/setter
    Integer getPrice();
    void setPrice(Integer price);
}
