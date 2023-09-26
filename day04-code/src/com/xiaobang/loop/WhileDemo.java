package com.xiaobang.loop;

public class WhileDemo {
    public static void main(String[] args) {

        HelloWhile();

    }

    public static void HelloWhile(){
        // 1. 初始化变量
        int i = 1;
        while (i <= 5){  // 2. 执行判断条件
            System.out.println("HelloWhile");  // 3. 执行循环体
            i++;  // 4. 条件控制语句
        }
    }
}
