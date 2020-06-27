/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day11;

import com.github.javafaker.Faker;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author MB-study
 */
public class HashMapDemo2 {
    public static void main(String[] args) throws Exception{
       List<Map<String, Object>> list = new ArrayList<>();
        IntStream.rangeClosed(1, 100).forEach(i -> { 
            Map<String, Object> map = new LinkedHashMap<>();
            map.put("height", new Random().nextInt(50) + 150);
            map.put("weight", new Random().nextInt(50) + 50);
            map.put("name", new Faker().pokemon().name());
            map.put("sex", new Random().nextInt(2) == 0 ? "female" : "male");
            list.add(map);
        });
        System.out.println(list);
        // 計算出 bmi
        list.stream().forEach(map -> { 
            double h = Double.parseDouble(map.get("height").toString());
            double w = Double.parseDouble(map.get("weight").toString());
            double bmi = w / Math.pow(h/100, 2);
            map.put("bmi", bmi);
            map.put("result", (bmi>18 && bmi<=23));
        });
        System.out.println(list);
        //匯出 excel
        FileWriter fw = new FileWriter("C:/Users/MB-207/Documents/bmi.csv");
        //標頭資料
        fw.write("height,weight,name,sex,bmi,result\n");
        for(Map<String, Object> map : list) {
            fw.write(String.format("%s,%s,%s,%s,%s,%s\n", 
                        map.get("height"),
                        map.get("weight"),
                        map.get("name"),
                        map.get("sex"),
                        map.get("bmi"),
                        map.get("result")
                    ));
        }
        double passRate = list.stream().filter(map -> map.get("result").equals(true))
                .count()/(double)list.size();
        int maleCount = (int) list.stream().filter(map -> map.get("sex").equals("male")).count();
        double malePass = list.stream().filter(map -> map.get("result").equals(true) && map.get("sex").equals("male")).count()/(double)maleCount;
        int femaleCount = (int) list.stream().filter(map -> map.get("sex").equals("female")).count();
        double femalePass = list.stream().filter(map -> map.get("result").equals(true) && map.get("sex").equals("female")).count()/(double)femaleCount;
        fw.write(String.format("pass,%.2f%%,male,%.2f%%,female,%.2f%%\n", passRate*100, malePass*100, femalePass*100));
        //System.out.printf("pass: %.2f male: %.2f female: %.2f\n", passRate*100, malePass*100, femalePass*100);
        fw.close();
        System.out.println("匯出成功!");
        
    }
}
