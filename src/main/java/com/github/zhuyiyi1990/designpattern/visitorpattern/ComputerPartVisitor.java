package com.github.zhuyiyi1990.designpattern.visitorpattern;

public interface ComputerPartVisitor {

    public abstract void visit(Computer computer);

    public abstract void visit(Mouse mouse);

    public abstract void visit(Keyboard keyboard);

    public abstract void visit(Monitor monitor);

}
