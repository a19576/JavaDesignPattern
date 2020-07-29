package com.codermy.designpattern.adaptor;

/**
 * @author codermy
 * @createTime 2020/7/26
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Headset headset = new Converter(phone);
        headset.music();
    }
}