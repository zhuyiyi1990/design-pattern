package com.github.zhuyiyi1990.designpattern.abstractfactorypattern;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
