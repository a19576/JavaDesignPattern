package com.codermy.designpattern.prototype.deep;

/**
 * @author codermy
 * @createTime 2020/7/24
 */

public class Person implements Cloneable{
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
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person owner =null;
        owner = (Person)super.clone();
        return owner;
    }

}
