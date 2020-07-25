/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day17;

import java.io.File;

/**
 *
 * @author MB-study
 */
public class CreateTempFile {
    public static void main(String[] args) throws Exception{
        File path = new File("src\\main\\java\\com\\lab\\ocp\\day17\\temp");
        if (!path.exists()) {
            path.mkdir();
        }
        File tempFile = File.createTempFile("temp", ".txt", path);
        System.out.println(tempFile.exists());
    }
}
