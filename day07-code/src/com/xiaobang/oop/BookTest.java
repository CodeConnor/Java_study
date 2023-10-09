package com.xiaobang.oop;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        b1.id = "001";
        b1.name = "三国";
        b1.price = 88.88;

        b2.id = "002";
        b2.name = "水浒";
        b2.price = 89.88;

        b3.id = "003";
        b3.name = "红楼梦";
        b3.price = 90.50;

        b1.show();
        b2.show();
        b3.show();
    }
}
