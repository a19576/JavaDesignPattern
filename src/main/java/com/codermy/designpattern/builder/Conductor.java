package com.codermy.designpattern.builder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author codermy
 * @createTime 2020/7/24
 */

public class Conductor {
    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }
    // 指挥建造过程
    public Computer make(){
        computerBuilder.buildMainBoard();
        computerBuilder.buildCpu();
        computerBuilder.buildHardDisk();
        computerBuilder.buildIdeoCard();
        computerBuilder.buildMemorie();
        return computerBuilder.build();
    }
}
