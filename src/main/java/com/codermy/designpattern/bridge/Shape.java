package com.codermy.designpattern.bridge;

/**
 * @author codermy
 * @createTime 2020/7/25
 */
public abstract class Shape {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
