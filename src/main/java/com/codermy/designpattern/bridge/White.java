package com.codermy.designpattern.bridge;

/**
 * @author codermy
 * @createTime 2020/7/25
 */
public class White implements Color{

    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }

}