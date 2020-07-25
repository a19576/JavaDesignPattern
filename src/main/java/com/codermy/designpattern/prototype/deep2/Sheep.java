package com.codermy.designpattern.prototype.deep2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author codermy
 * @createTime 2020/6/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sheep implements  Serializable {
    private String name;
    private int age;
    private String sex;
    public Person owner;//对象引用
}