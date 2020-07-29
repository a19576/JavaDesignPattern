package com.codermy.designpattern.composite;

/**
 * @author codermy
 * @createTime 2020/7/28
 */
public class Class extends School {
    private String name;

    public Class(String name){
        this.name = name;
    }

    @Override
    public void display(String f) {
        System.out.println(f + "-"+ name);
    }
}
