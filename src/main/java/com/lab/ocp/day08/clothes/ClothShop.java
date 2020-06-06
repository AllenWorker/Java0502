/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day08.clothes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class ClothShop {
    public static void main(String[] args) throws FileNotFoundException {
        File clothDB = new File("src\\main\\java\\com\\lab\\ocp\\day08\\clothes\\clothes_db.txt");
        String data = new Scanner(clothDB, "UTF-8").useDelimiter("\\A").next();
        //System.out.println(data);
        String[] rows = data.split("\n");
        Cloth[] clothes = new Cloth[rows.length];
        for(int i=0;i<rows.length;i++) {
                String[] row = rows[i].split(",");
                Cloth cloth = new Cloth(row[0],row[1].charAt(0),Integer.parseInt(row[2]),Integer.parseInt(row[3]));
                clothes[i] = cloth;
            }
        int total = Arrays.stream(clothes)
                .mapToInt(cloth -> cloth.getPrice() * cloth.getAmount())
                .sum();
        
        int shirt_sum = Arrays.stream(clothes)
                .filter(cloth ->cloth.getKind().equals("T-Shirt"))
                .mapToInt(cloth -> cloth.getPrice() * cloth.getAmount())
                .sum();
        
        int pants_sum = Arrays.stream(clothes)
                .filter(cloth ->cloth.getKind().equals("Pants"))
                .mapToInt(cloth -> cloth.getPrice() * cloth.getAmount())
                .sum();
        
        System.out.printf("T-Shirt庫存成本: %,d 褲子庫存成本: %,d 總庫存成本: %,d\n", shirt_sum, pants_sum, total);
        int shirt_amount = 3;
        char shirt_size = 'M';
        int shirt_price = Arrays.stream(clothes)
                .filter(shirt -> (shirt.getKind().equals("T-Shirt") && shirt.getSize() == shirt_size && shirt.getAmount()>= shirt_amount))
                .findFirst().get().getPrice();
        int pants_amount = 2;
        char pants_size = 'S';
        int pants_price = Arrays.stream(clothes)
                .filter(pants -> (pants.getKind().equals("Pants") && pants.getSize() == pants_size && pants.getAmount()>= pants_amount))
                .findFirst().get().getPrice();
        System.out.printf("T-Shirt %c號 %d件 共 %,d\n",shirt_size,shirt_amount,shirt_price*shirt_amount);
        System.out.printf("Pants %c號 %d件 共 %,d\n",pants_size,pants_amount,pants_price*pants_amount);
        System.out.printf("總計 %,d",(shirt_price*shirt_amount)+(pants_price*pants_amount));
    }
}
