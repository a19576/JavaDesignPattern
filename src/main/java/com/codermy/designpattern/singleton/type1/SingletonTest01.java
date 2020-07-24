package com.codermy.designpattern.singleton.type1;

/**
 * @author codermy
 * @createTime 2020/5/14
 * 饿汉式单例
 * 优点：简单，在类装载时就完成了实例化，避免了线程同步问题
 * 缺点：由于这个类已经完成了实例化，如果从始至终都没有用过这个实例，就会造成内存的浪费
 */
public class SingletonTest01 {
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
    private Signleton(){ }
    //2、内部创建对象实例
    private final static Signleton instance = new Signleton();
    //3、提供一个公有的静态方法，返回实例对象
    public final static Signleton getInstance(){
        return instance;
    }
}

