package com.github.zhuyiyi1990.designpattern.servicelocatorpattern;

public class Service2 implements Service {

    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }

}
