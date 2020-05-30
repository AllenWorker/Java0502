/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day07.stock.service;

import com.lab.ocp.day07.stock.dao.StockDAO;
import com.lab.ocp.day07.stock.po.Stock;
import java.util.Arrays;

/**
 *
 * @author MB-study
 */
public class StockService {
    private StockDAO dao = StockDAO.getInstance();
    
    public void find本益比(double value) {
        Stock[] stocks = dao.getStocks();
        Arrays.stream(stocks)
                .filter(s ->!s.get本益比().equals("-"))
                .filter(s -> Double.parseDouble(s.get本益比()) <= value)
                .forEach(s -> System.out.println(s));
    }
    
    public void findBestBuy(double pe, double yield) {
        Stock[] stocks = dao.getStocks();
        Arrays.stream(stocks)
                .filter(s ->!s.get本益比().equals("-"))
                .filter(s ->!s.get殖利率().equals("-"))
                .filter(s -> Double.parseDouble(s.get本益比()) <= pe)
                .filter(s -> Double.parseDouble(s.get殖利率()) >= yield)
                .filter(s ->Double.parseDouble(s.get股價淨值比()) < 1 )
                .forEach(s -> System.out.println(s));
    }
}
