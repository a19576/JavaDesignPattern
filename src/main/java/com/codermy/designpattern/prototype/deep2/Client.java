package com.codermy.designpattern.prototype.deep2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author codermy
 * @createTime 2020/7/24
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Person owner = new Person("马云");
        Sheep sheep = new Sheep("tom",1,"male", owner);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(sheep);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        Sheep sheep1 =(Sheep) ois.readObject();
        bos.flush();oos.flush();
        bos.close();oos.close();
        ois.close();
        System.out.println("Sheep: " + sheep);
        System.out.println("Sheep1: " + sheep1);
        System.out.println("================================");
        System.out.println("Sheep: " + sheep.hashCode() + "++++++++++" + sheep.owner.hashCode());
        System.out.println("Sheep1: " + sheep1.hashCode() + "++++++++++" + sheep1.owner.hashCode());
        System.out.println("================================");
        sheep1.owner.setName("马化腾");
        System.out.println("Sheep: " + sheep.owner);
        System.out.println("Sheep1: " + sheep1.owner);
    }
}
