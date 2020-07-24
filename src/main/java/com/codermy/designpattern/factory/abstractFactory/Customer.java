package com.codermy.designpattern.factory.abstractFactory;


//消费者/测试类
public class Customer {
    public static void main(String[] args) {

        System.out.println("==============小米产品=================");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        //小米手机产品
        IphoneProduct xiaomiiphoneProduct = xiaomiFactory.iphoneProduct();
        xiaomiiphoneProduct.callup();

        IRouterProduct xiaomiiRouterProduct = xiaomiFactory.iRouterProduct();
        xiaomiiRouterProduct.openwifi();

        System.out.println("==============华为产品=================");
        HuaweiFactory huaweiFactory = new HuaweiFactory();

        IphoneProduct huaweiiphoneProduct1 = huaweiFactory.iphoneProduct();
        huaweiiphoneProduct1.callup();
        IRouterProduct huaweiiRouterProduct = huaweiFactory.iRouterProduct();
        huaweiiRouterProduct.openwifi();
    }
}
