/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class EmployeeSerialWriter {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入員工姓名: ");
        String name = sc.next();
        System.out.println("請輸入員工薪資: ");
        int salary = sc.nextInt();
        Employee employee = new Employee();
        employee.setName(name);
        employee.setSalary(salary);
        //寫入序列物件
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day18\\bin\\"+name+".bin");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee);
        System.out.println("Employee 序列化物件寫入完成!");
    }
}
