package com.xiaobang.oop;

public class Phone {

    String brand;
    String color;
    int price;

    public void call(String name) {
        System.out.println("打电话给" + name);
    }

    public void sendMessage() {
        System.out.println("群发短信");
    }
}
