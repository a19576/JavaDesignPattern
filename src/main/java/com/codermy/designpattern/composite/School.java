package com.codermy.designpattern.composite;

/**
 * @author codermy
 * @createTime 2020/7/28
 */
public abstract class School {
    //展示树形结构
    public abstract void display(String f);
    //添加分支
    public void add(School branch){
        throw new UnsupportedOperationException("不支持此功能");
    };
    //删除分支
    public void remove(School branch) {
        // 若叶子对象没有这个功能，或子类未实现这个功能
        throw new UnsupportedOperationException("不支持此功能");
    }

}
