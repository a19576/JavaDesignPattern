package com.codermy.designpattern.singleton.type4;

/**
 * @author codermy
 * @createTime 2020/5/14
 * 解决了线程不安全的问题
 * 但是大大降低了效率 每个线程想获得实例的时候，执行getInstance（）方法都要进行同步
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        // Signleton instance1= Signleton.getInstance();
        // Signleton instance2 = Signleton.getInstance();
        // System.out.println(instance1==instance2);
        // System.out.println(instance1.hashCode());
        // System.out.println(instance2.hashCode());
        for (int i = 0; i <10 ; i++) {
            new Thread(() -> System.out.println(Signleton.getInstance().hashCode()) ).start();
        }
    }
}

class Signleton{
    private static Signleton instance;

    private Signleton(){}

    //提供一个静态的公有方法，当调用方法时，才去创建instance
    public static synchronized Signleton getInstance(){
        if(instance == null){//如果为空再去创建对象
            instance = new Signleton();
        }
        return instance;
    }
}

