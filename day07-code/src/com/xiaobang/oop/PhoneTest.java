package com.xiaobang.oop;

public class PhoneTest {
    public static void main(String[] args) {

        Phone p1 = new Phone();

        p1.brand = "xiaomi";
        p1.color = "white";
        p1.price = 4999;

        System.out.println("brand:" + p1.brand + "\ncolor:" + p1.color + "\nprice:" + p1.price);

        p1.call("lihua");
        p1.sendMessage();

        System.out.println("--------------");

        Phone p2 = new Phone();

        p2.brand = "huawei";
        p2.color = "black";
        p2.price = 6999;

        System.out.println("brand:" + p2.brand + "\ncolor:" + p2.color + "\nprice:" + p2.price);

        p2.call("john");
        p2.sendMessage();
    }
}
