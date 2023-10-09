package com.xiaobang.mythis;

public class Student {
    String name;

    public void show(String name) {
        System.out.println(name);       // lihua
        System.out.println(this.name);  // xiaoming

        this.method();
    }

    public void method() {
        System.out.println("method...");
    }
}
