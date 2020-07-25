package com.codermy.designpattern.bridge;

/**
 * @author codermy
 * @createTime 2020/7/25
 */
public class Black implements Color{

    public void bepaint(String shape) {
        System.out.println("黑色的" + shape);
    }
}
