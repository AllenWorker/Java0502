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
public class AdultMask extends Mask {

    public AdultMask() {
        super("L");
    }

    @Override
    public Integer getPrice() {
        return 5;
    }
    
}
