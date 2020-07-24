package com.codermy.designpattern.prototype.deep2;

import java.io.Serializable;

/**
 * @author codermy
 * @createTime 2020/7/24
 */

public class Person implements Serializable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person(String name){
        this.name = name;
    }

}
