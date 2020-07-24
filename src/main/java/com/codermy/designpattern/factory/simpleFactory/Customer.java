package com.codermy.designpattern.factory.simpleFactory;

/**
 * @author codermy
 * @createTime 2020/6/8
 * 消费者
 */
public class Customer {
    public static void main(String[] args) {
        Restaurant restaurant = Waiter.getFood("红烧肉");
        restaurant.cook();
    }
}
