package com.github.zhuyiyi1990.designpattern.abstractfactorypattern;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
