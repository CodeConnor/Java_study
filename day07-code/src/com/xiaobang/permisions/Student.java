package com.xiaobang.permisions;

public class Student {
    int age;

    private void privateShow() {
        System.out.println("private show...");
    }

    public void publicShow() {
        System.out.println("public show...");
    }

    void defaultShow() {
        System.out.println("default show...");
    }
}
