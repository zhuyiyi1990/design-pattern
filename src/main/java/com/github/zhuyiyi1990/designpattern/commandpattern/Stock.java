package com.github.zhuyiyi1990.designpattern.commandpattern;

public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold ");
    }

}
