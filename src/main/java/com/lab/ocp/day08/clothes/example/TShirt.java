/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08.clothes.example;

/**
 *
 * @author MB-study
 */
public abstract class TShirt implements ICloth{
    @Override
    public String getKind() {
        return "T-Shirt";
    }
    
}
