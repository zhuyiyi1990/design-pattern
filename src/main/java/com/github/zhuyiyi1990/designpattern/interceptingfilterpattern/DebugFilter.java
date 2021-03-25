package com.github.zhuyiyi1990.designpattern.interceptingfilterpattern;

public class DebugFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }

}
