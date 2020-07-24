package com.codermy.designpattern.prototype.deep2;

import java.io.Serializable;

/**
 * @author codermy
 * @createTime 2020/6/16
 */
public class Sheep implements  Serializable {
    private String name;
    private int age;
    private String sex;
    public Person owner;//对象引用

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

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public Sheep() {
    }
    public Sheep(String name, int age, String sex, Person owner) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", owner=" + owner +
                '}';
    }

}