package com.codermy.designpattern.prototype.deep;

/**
 * @author codermy
 * @createTime 2020/7/24
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person owner = new Person("马云");
        Sheep sheep = new Sheep("tom",1,"male", owner);

        Sheep sheep1 = (Sheep)sheep.clone();
        System.out.println(sheep.hashCode() + "  " + sheep.owner.hashCode());
        System.out.println(sheep + " "+ sheep.owner);
        System.out.println(sheep1.hashCode()+ " " + sheep1.owner.hashCode());
        System.out.println(sheep1 + " " + sheep1.owner);
        sheep1.owner.setName("马化腾");
        System.out.println(sheep.owner);
        System.out.println(sheep1.owner);
    }
}
