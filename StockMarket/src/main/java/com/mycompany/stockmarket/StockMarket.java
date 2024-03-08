/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stockmarket;

/**
 *
 * @author LENOVO
 */
public class StockMarket {

    public static void main(String[] args) {
        Stock appleStock = new ConcreteStock("APP",100);
        Stock dellStock = new ConcreteStock("DELL",100);
        Investor tomInvestor = new SimpleInvestor("Tom");
        Investor bobInvestor = new SimpleInvestor("Bob");
        appleStock.addObserver(tomInvestor);
        appleStock.addObserver(bobInvestor);
        dellStock.addObserver(tomInvestor);
        appleStock.notifyInvestor(100);
        appleStock.notifyInvestor(40.0);
        appleStock.notifyInvestor(10.0);
        appleStock.notifyInvestor(5.0);
        dellStock.notifyInvestor(300.0);
        dellStock.notifyInvestor(200.0);
        
    }
}
