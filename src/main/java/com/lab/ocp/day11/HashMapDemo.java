/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author MB-study
 */
public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("height", 170.0);        
        map.put("weight", 60.0);
        map.put("name", "John");
        System.out.println(map);
        System.out.println(map.get("height"));
        Set<String> keys = map.keySet();
        System.out.println(keys);
        Collection values = map.values();
        System.out.println(values);
        map.entrySet().forEach(System.out::println);
        map.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
    
}
