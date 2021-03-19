package com.github.zhuyiyi1990.designpattern.prototypepattern;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
