package com.github.zhuyiyi1990.designpattern.builderpattern;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
