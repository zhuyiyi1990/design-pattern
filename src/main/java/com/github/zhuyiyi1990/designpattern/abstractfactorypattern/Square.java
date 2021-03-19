package com.github.zhuyiyi1990.designpattern.abstractfactorypattern;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
