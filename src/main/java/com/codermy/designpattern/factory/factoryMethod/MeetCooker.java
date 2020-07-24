package com.codermy.designpattern.factory.factoryMethod;

/**
 * @author codermy
 * @createTime 2020/6/15
 */
public class MeetCooker implements Cashier{
    @Override
    public Restaurant getFood() {
        return new Meet();
    }
}
