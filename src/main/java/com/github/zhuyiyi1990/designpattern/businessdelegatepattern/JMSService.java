package com.github.zhuyiyi1990.designpattern.businessdelegatepattern;

public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }

}
