package com.xiaobang.permisions;

public class PermisionDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.age = 25;
        stu.defaultShow();
        stu.publicShow();
        // stu.privateShow(); 会报错无法调用
    }
}
