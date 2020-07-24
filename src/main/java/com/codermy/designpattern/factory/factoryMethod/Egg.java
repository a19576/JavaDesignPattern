package com.codermy.designpattern.factory.factoryMethod;

/**
 * @author codermy
 * @createTime 2020/6/8
 */
public class Egg implements Restaurant {
    @Override
    public void cook() {
        System.out.println("鸡蛋羹做好了");
    }
}
