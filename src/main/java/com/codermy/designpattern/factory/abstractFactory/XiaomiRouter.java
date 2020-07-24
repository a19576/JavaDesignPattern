package com.codermy.designpattern.factory.abstractFactory;

//小米路由器
public class XiaomiRouter implements IRouterProduct {

    @Override
    public void openwifi() {
        System.out.println("打开小米wifi");
    }

    @Override
    public void setting() {
        System.out.println("设置小米wifi");
    }
}
