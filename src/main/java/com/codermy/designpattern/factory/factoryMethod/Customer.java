package com.codermy.designpattern.factory.factoryMethod;

/**
 * @author codermy
 * @createTime 2020/6/15
 */
public class Customer {
    public static void main(String[] args) {
        Cashier order = new EggCooker();
        Restaurant food = order.getFood();
        food.cook();
    }
}
