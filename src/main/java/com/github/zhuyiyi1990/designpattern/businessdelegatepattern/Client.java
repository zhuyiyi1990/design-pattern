package com.github.zhuyiyi1990.designpattern.businessdelegatepattern;

public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }

}
