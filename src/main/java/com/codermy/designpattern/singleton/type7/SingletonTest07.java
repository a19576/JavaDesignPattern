package com.codermy.designpattern.singleton.type7;

/**
 * @author codermy
 * @createTime 2020/5/14
 * 静态内部类实现单例模式
 * 该方法采用了类装载机制来保证初始化实例时只有一个线程
 * 静态内部类在Signleton类被装载时并不会立即实例化，而是需要实例化时，才会装载SignletonInstance类
 * 类的静态属性只会在第一次加载类的时候初始化
 * 避免了线程不安全，利用静态内部类实现懒加载，效率高
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            new Thread(() -> System.out.println(Signleton.getInstance().hashCode()) ).start();
        }
    }
}

class Signleton{

    //构造器私有
    private Signleton(){}

    //静态内部类，该类中有一个静态属性Signleton
    private static class SignletonInstance{
        private static final Signleton instance = new Signleton();
    }
    //提供一个静态的公有方法，直接返回SignletonInstance.instance
    public static Signleton getInstance() {
        return SignletonInstance.instance;
    }
}
