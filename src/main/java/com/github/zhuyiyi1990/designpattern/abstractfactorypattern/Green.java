package com.github.zhuyiyi1990.designpattern.abstractfactorypattern;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }

}
