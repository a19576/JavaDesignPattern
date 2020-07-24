package com.codermy.designpattern.singleton.type3;

/**
 * @author codermy
 * @createTime 2020/5/14
 * 饿汉式-线程不安全
 * 优点：起到了懒加载的效果，但是只能在单线程下使用
 * 如果在多线程下，如果一个线程进入了if判断语句块，
 * 还没来得及向下执行，另一个线程也进入这个判断语句，就会产生多个实例（违背单例模式），
 * 实际开发中，不要使用这种方式
 */
public class SingletonTest03 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <10 ; i++) {
            new Thread(() -> System.out.println(Signleton.getInstance().hashCode()) ).start();
        }
    }
}
class Signleton{
    private static Signleton instance;
    private Signleton(){}
    //提供一个静态的公有方法，当调用方法时，才去创建instance
    public static Signleton getInstance(){
        if(instance == null){//如果为空再去创建对象
            instance = new Signleton();
        }
        return instance;
    }
}
