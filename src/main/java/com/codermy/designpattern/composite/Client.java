package com.codermy.designpattern.composite;

/**
 * @author codermy
 * @createTime 2020/7/28
 */
public class Client {
    public static void main(String[] args) {
        //新建一个学校
        School university = new Branch("南京大学");
        //新建分院
        School branch1 = new Branch("计算机与软件学院");
        School branch2 = new Branch("外国语学院");
        //新建专业
        School profession1 = new Branch("软件工程");
        School profession2 = new Branch("网络工程");
        //新建班级
        profession1.add(new Class("软件1801"));
        profession1.add(new Class("软件1802"));

        branch1.add(profession1);
        branch1.add(profession2);
        university.add(branch1);
        university.add(branch2);
        university.display("-");
    }
}
