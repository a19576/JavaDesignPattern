package com.codermy.designpattern.builder;

/**
 * @author codermy
 * @createTime 2020/7/24
 * 拯救者
 */
public class ComputerB implements ComputerBuilder {
    private Computer computer = new Computer();
    @Override
    public void buildMainBoard() {
        computer.setMainBoard("15Isk");
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Intel Core i7");
    }

    @Override
    public void buildIdeoCard() {
        computer.setIdeoCard("GTX1050Ti");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("256GB+1TB混合硬盘");
    }

    @Override
    public void buildMemorie() {
        computer.setMemorie("DDR4 16GB×1");
    }

    @Override
    public Computer build() {
        return computer;
    }
}