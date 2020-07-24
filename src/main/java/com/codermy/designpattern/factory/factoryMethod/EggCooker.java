package com.codermy.designpattern.factory.factoryMethod;

/**
 * @author codermy
 * @createTime 2020/6/15
 */
public class EggCooker implements Cashier {
    @Override
    public Restaurant getFood() {
        return new Egg();
    }
}
