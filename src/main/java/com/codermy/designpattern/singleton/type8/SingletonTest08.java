package com.codermy.designpattern.singleton.type8;

/**
 * @author codermy
 * @createTime 2020/5/14
 * 枚举方法实现单例模式
 * 借助jdk1.5中添加的枚举类来实现单例模式，
 * 不仅能避免多线程同步问题，而且还能防止反序列化重新创建新对象
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        singleton.Ok();
        for (int i = 0; i <10 ; i++) {
            new Thread(() -> System.out.println(Singleton.INSTANCE.hashCode()) ).start();
        }

    }
}
enum Singleton{
    INSTANCE;//属性
    public void Ok(){
        System.out.println("ok");
    }
}