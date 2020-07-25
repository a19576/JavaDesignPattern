package com.codermy.designpattern.prototype.shallow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author codermy
 * @createTime 2020/6/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String sex;

    //克隆该实例，使用默认的clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep =null;
        sheep = (Sheep)super.clone();
        return sheep;
    }
}

