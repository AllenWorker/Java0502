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
public interface FastFood extends Food{
    //數量 getter/setter
    Integer getCount();
    void setCount(Integer count);
}
