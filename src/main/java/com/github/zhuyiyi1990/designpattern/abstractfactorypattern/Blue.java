package com.github.zhuyiyi1990.designpattern.abstractfactorypattern;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }

}
