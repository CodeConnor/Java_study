package com.xiaobang.loop;

public class DoWhileDemo {
    public static void main(String[] args) {

        doWhileTest();

    }

    public static void doWhileTest(){
        // 1. 初始化变量
        int i = 1;
        do {
            // 2. 循环体语句
            System.out.println("HelloWorld");
            // 3. 条件控制语句
            i++;
        } while (i <= 5);  // 4. 判断条件
    }
}
