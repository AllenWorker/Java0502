/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day11;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;

/**
 *
 * @author MB-study
 */
public class MapGroup3 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "apple", "watermelon",
                           "apple", "orange", "watermelon",
                           "banana", "coconut", "orange"};
        //5:[apple], 6:[banana, orange], 7:[coconut], 10:[watermelon]
        //分組
        
        System.out.println(
                Stream.of(fruits)
                .collect(toSet())
                //[orange, banana, apple, watermelon, coconut]
                .stream()
                .collect(toMap(String::toString, String::length))
                .entrySet()
                //[banana=6, orange=6, apple=5, watermelon=10, coconut=7]
                .stream()
                .collect(Collectors.groupingBy(Entry::getValue, Collectors.mapping(Entry::getKey, toList())))
                //{5=[apple], 6=[banana, orange], 7=[coconut], 10=[watermelon]}
                
        );
        
    }
}
