package com.codermy.designpattern.prototype.shallow;

/**
 * @author codermy
 * @createTime 2020/6/16
 */
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Sheep(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    //克隆该实例，使用默认的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep =null;
        sheep = (Sheep)super.clone();
        return sheep;
    }
}

