package com.codermy.designpattern.factory.abstractFactory;

//小米手机
public class XiaomiPhone implements IphoneProduct{

    @Override
    public void callup() {
        System.out.println("用小米手机打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("用小米手机发短信");
    }
}
