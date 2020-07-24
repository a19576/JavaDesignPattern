package com.codermy.designpattern.factory.simpleFactory;

/**
 * @author codermy
 * @createTime 2020/6/8
 */
public class Waiter {

    public static Restaurant getFood(String orderType) {
        Restaurant restaurant = null;
        if(orderType.equals("红烧肉")){
            restaurant = new Meet();
        }else if (orderType.equals("鸡蛋羹")){
            restaurant = new Egg();
        }
        return restaurant;
    }
}
