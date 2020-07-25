package com.codermy.designpattern.prototype.deep;

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
public class Person implements Cloneable{
    String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person owner =null;
        owner = (Person)super.clone();
        return owner;
    }

}
