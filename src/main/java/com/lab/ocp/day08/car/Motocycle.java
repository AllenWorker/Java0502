/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08.car;

/**
 *
 * @author MB-study
 */
public class Motocycle implements Motor{
    
    @Override
    public String getKind() {
        return "摩托車";
    }

    @Override
    public Integer getPrice() {
        return 70000;
    }
    
}
