package com.codermy.designpattern.builder;

/**
 * @author codermy
 * @createTime 2020/7/24
 * 一台电脑需要完成的工序
 */
public interface ComputerBuilder {
    void buildMainBoard();
    void buildCpu();
    void buildIdeoCard();
    void buildHardDisk();
    void buildMemorie();
    // 建造结果
    Computer build();

}
