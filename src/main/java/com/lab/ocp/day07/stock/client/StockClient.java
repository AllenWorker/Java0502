/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day07.stock.client;

import com.lab.ocp.day07.stock.service.StockService;

/**
 *
 * @author MB-study
 */
public class StockClient {
    public static void main(String[] args) {
        StockService service = new StockService();
        service.findBestBuy(7, 10);
       
    }
}
