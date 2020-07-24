package com.codermy.designpattern.factory.abstractFactory;


//华为手机
public class HuaweiPhone implements IphoneProduct {

    @Override
    public void callup() {
        System.out.println("用华为手机打电话");
    }

    @Override
    public void sendSms() {
        System.out.println("用华为手机发短信");
    }
}
