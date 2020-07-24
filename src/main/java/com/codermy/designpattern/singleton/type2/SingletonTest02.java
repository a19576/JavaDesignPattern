package com.codermy.designpattern.singleton.type2;

/**
 * @author codermy
 * @createTime 2020/5/14
 * 和之前的方式类似，只不过将类实例化的过程放在了静态代码块中，也就是类装载的时候，
 * 就执行静态代码块中的代码，优缺点和之前一样
 */
public class SingletonTest02 extends Thread{
    public static void main(String[] args) {
        Signleton instance1= Signleton.getInstance();
        Signleton instance2 = Signleton.getInstance();

        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}
class Signleton{
    //1、构造器私有化,外部无法通过new新建
    private Signleton(){}

    //2、内部创建对象实例
    private static Signleton instance;

    static {//静态代码块种，创建单例对象
        instance = new Signleton();
    }
    //3、提供一个公有的静态方法，返回实例对象
    public final static Signleton getInstance(){
        return instance;
    }
}