package com.codermy.designpattern.bridge;

/**
 * @author codermy
 * @createTime 2020/7/25
 */
public class Gray implements Color{

    public void bepaint(String shape) {
        System.out.println("灰色的" + shape);
    }
}
