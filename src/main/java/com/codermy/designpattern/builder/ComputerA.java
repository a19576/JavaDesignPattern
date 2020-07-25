package com.codermy.designpattern.builder;

/**
 * @author codermy
 * @createTime 2020/7/24
 * 华硕飞行堡垒6
 */
public class ComputerA implements ComputerBuilder {
    private Computer computer = new Computer();
    @Override
    public void buildMainBoard() {
        computer.setMainBoard("X550JK");
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Intel Core i5");
    }

    @Override
    public void buildIdeoCard() {
        computer.setIdeoCard("GTX1060");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("256GB+1TB混合硬盘");
    }

    @Override
    public void buildMemorie() {
        computer.setMemorie("DDR4 8GB×1");
    }

    @Override
    public Computer build() {
        return computer;
    }
}
