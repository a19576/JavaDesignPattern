package com.codermy.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author codermy
 * @createTime 2020/7/28
 * 分院
 */
public class Branch extends School {
    //学校集合
    private List<School> schoolList = new ArrayList<>();

    private String name;

    public Branch(String name){
        this.name=name;
    }

    @Override
    public void display(String f) {
        System.out.println(f + name);
        // 如果还包含其他子组件，那么就输出这些子组件对象
        if (null != schoolList) {
            // 添加一个空格，表示向后缩进一个空格
            f += "---";
            // 输出当前对象的子组件对象
            for (School school : schoolList) {
                // 递归地进行子组件相应方法的调用，输出每个子组件对象
                school.display(f);
            }
        }

    }

    public void add(School branch){
        schoolList.add(branch);
    }

    public void remove(School branch){
        schoolList.remove(branch);
    }
}
