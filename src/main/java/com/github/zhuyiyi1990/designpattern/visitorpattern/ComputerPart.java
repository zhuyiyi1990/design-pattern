package com.github.zhuyiyi1990.designpattern.visitorpattern;

public interface ComputerPart {

    public abstract void accept(ComputerPartVisitor computerPartVisitor);

}
