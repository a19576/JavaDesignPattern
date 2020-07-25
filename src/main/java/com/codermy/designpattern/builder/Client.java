package com.codermy.designpattern.builder;

/**
 * @author codermy
 * @createTime 2020/7/24
 * 客户
 */
public class Client {
    public static void main(String[] args) {
        // 一个指挥者
        Conductor conductor = new Conductor();
        // 需要ComputerA 飞行堡垒
        ComputerA fxbl = new ComputerA();
        // 指挥建造ComputerA
        conductor.setComputerBuilder(fxbl);
        // 得到飞行堡垒
        Computer computer1= conductor.make();
        System.out.println(computer1);

        // 一个指挥者
        Conductor conductor2 = new Conductor();
        // 需要ComputerA 拯救者
        ComputerB zjz = new ComputerB();
        // 指挥建造ComputerB
        conductor2.setComputerBuilder(zjz);
        // 得到拯救者
        Computer computer2= conductor2.make();
        System.out.println(computer2);
    }
}
