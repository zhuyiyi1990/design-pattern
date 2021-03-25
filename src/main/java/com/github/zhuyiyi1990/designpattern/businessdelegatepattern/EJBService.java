package com.github.zhuyiyi1990.designpattern.businessdelegatepattern;

public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }

}
