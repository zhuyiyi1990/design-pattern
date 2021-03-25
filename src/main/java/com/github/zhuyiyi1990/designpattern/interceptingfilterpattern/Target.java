package com.github.zhuyiyi1990.designpattern.interceptingfilterpattern;

public class Target {

    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }

}
