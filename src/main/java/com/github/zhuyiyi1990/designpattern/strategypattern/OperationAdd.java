package com.github.zhuyiyi1990.designpattern.strategypattern;

public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }

}
