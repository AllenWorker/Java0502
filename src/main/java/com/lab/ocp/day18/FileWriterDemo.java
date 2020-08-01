/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day18;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

/**
 *
 * @author MB-study
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        String data = "Hello! Today is " + new Date();
        String path = "src\\main\\java\\com\\lab\\ocp\\day18\\data.txt";
        try(FileWriter fw = new FileWriter(new File(path), true)){  //保留之前的資料, false(預設)覆蓋之前的資料
            //資料寫入
            fw.write(data);
            System.out.println("寫入成功");
        } catch (Exception e) {
            
        }
    }
}
