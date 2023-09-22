package com.xiaobang.operator;

import org.w3c.dom.ls.LSOutput;

public class MethodDemo1 {

    public static void main(String[] args) {
        /*
            主方法, 用于调用方法
         */
        hello();
        eat();
        hello();
        sleep();

    }

    public static void hello() {
        /*
            自定义方法1
         */
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }

    public static void eat() {
        /*
        自定义方法2
         */
        System.out.println("eat");
        System.out.println("eat");

    }

    public static void sleep() {
        /*
            自定义方法3
         */
        System.out.println("sleep");
    }

}


