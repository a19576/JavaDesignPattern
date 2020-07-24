package com.codermy.designpattern.factory.abstractFactory;


//华为路由器
public class HuaweiRouter implements IRouterProduct {

    @Override
    public void openwifi() {
        System.out.println("打开华为wifi");
    }

    @Override
    public void setting() {
        System.out.println("设置华为wifi");
    }
}
