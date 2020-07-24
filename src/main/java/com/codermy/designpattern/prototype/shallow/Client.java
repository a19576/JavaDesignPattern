package com.codermy.designpattern.prototype.shallow;

/**
 * @author codermy
 * @createTime 2020/6/16
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom",1,"male");
        Sheep sheep1 = (Sheep)sheep.clone();//克隆 sheep对象
        System.out.println(sheep.hashCode());
        System.out.println(sheep);
        System.out.println(sheep1.hashCode());
        System.out.println(sheep1);
        sheep1.setAge(2);
        System.out.println(sheep1);
        System.out.println(sheep);
    }
}
