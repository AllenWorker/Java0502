/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day07.stock.dao;

import com.lab.ocp.day07.stock.po.Stock;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author MB-study
 */
public class StockDAO {
    private Stock[] stocks;
    
    private static StockDAO _instance = new StockDAO();
    
    private StockDAO() {
        try{
            File file = new File("src\\main\\java\\com\\lab\\ocp\\day07\\stock\\db\\BWIBBU_d.txt");
            String data = new Scanner(file, "UTF-8").useDelimiter("\\A").next();
            System.out.println(data);
            String[] rows = data.split("\r\n");
            stocks = new Stock[rows.length];
            for(int i=0;i<rows.length;i++) {
                String[] row = rows[i].split(",");
                Stock stock = new Stock(row[0],row[1],row[2],row[3],row[4],row[5],row[6]);
                stocks[i] = stock;
            }
        } catch (Exception e){
            
        }
    }
    public static StockDAO getInstance() {
        return _instance;
    }
    public Stock[] getStocks() {
        return stocks;
    }
}
