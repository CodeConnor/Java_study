package com.xiaobang.encapsulation;

public class Student {

    private int age;

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄有误, 请输入0~120之间的整数");
        }
    }

    public int getAge() {
        return age;
    }
}
