package com.codermy.designpattern.singleton.type5;

/**
 * @author codermy
 * @createTime 2020/5/14
 * 懒汉模式-双重检查
 * 进行了两次if判断检查，这样就保证线程安全了
 * 通过判断是否为空，来确定是否 需要再次实例化
 */
public class SingletonTest05 {

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            new Thread(() -> System.out.println(Signleton.getInstance().hashCode()) ).start();
        }
    }
}


class Signleton{
    private static volatile Signleton instance;//volatile保证可见性

    private Signleton(){}
    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    public static Signleton getInstance() {
        if (instance == null) {
            synchronized (Signleton.class) {
                if (instance == null) {
                    instance = new Signleton();
                }
            }
        }
        return instance;
    }
}