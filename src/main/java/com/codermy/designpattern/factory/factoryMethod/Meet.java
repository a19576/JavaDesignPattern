package com.codermy.designpattern.factory.factoryMethod;

/**
 * @author codermy
 * @createTime 2020/6/8
 */
public class Meet implements Restaurant {
    @Override
    public void cook() {
        System.out.println("红烧肉做好了");
    }
}
