package com.codermy.designpattern.prototype.shallow2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author codermy
 * @createTime 2020/7/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    String name;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
