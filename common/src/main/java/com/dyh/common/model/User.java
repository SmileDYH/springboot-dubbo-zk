package com.dyh.common.model;

import java.io.Serializable;

/**
 * description: dyh
 * author: Administrator
 * date: 2021/3/15 0015 15:36
 */
//TODO 实例化
public class User implements Serializable{

    private int id;

    private  String name;

    private  int age;

    private int sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
