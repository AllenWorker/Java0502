/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day10.junior;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JuniorDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src\\main\\java\\com\\lab\\ocp\\day10\\junior\\junior.txt");
        List<Junior> list = new ArrayList<>();
        //Files.lines(path).forEach(System.out::println);
        Files.lines(path).forEach(record -> {
            String[] rows = record.split(",");
            Junior junior = new Junior(rows[0].trim(), Integer.parseInt(rows[1]), Double.parseDouble(rows[2]));
            list.add(junior);
        });
        System.out.println(list);
        // Q1: 分數 22.2 校名 華江
        double score = 22.2;
        String school = "";
        
        //list.stream().sorted();
        //System.out.println(list);
        System.out.println(list.stream()
                .filter(junior -> junior.getScore()<=score)
                .findFirst());
        
        // Q2: 排名第2000 校名?
        int number = 8888;
        school = "";
        //list.stream().filter(j -> j.getSchool().contains("女"))
        int amounts = 0;
        for(Junior j : list) {
            if(!j.getSchool().contains("女")){
                amounts += j.getAmount();
                System.out.printf("%s amounts: %d\n", j.getSchool(), amounts);
                if (amounts >= number) {
                    System.out.println(j);
                    break;
                }
            }
        }
        System.out.println("-----------------------------------------------");
        amounts = 0;
        for(Junior j : list) {
            if(!j.getSchool().contains("建中") && !j.getSchool().contains("成功")&& !j.getSchool().contains("男")){
                //System.out.println(j);
                amounts += j.getAmount();
                System.out.printf("%s amounts: %d\n", j.getSchool(), amounts);
                if (amounts >= number) {
                    System.out.println(j);
                    break;
                }
            }
        }
        
    }
}
