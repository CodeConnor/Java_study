package com.xiaobang.test;

import java.util.Scanner;

public class StringBuilderTest1 {
    /*
    需求:键盘接受一个字符串,程序判断出该字符串是否是对称字符串(回文字符串)
    并在控制台打印是或不是
    对称字符串:123321
    非对称字符串:123123
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");

        StringBuilder sb = new StringBuilder(sc.nextLine());
        String str1 = sb.toString();
        String str2 = sb.reverse().toString();
        if (str1.equals(str2)){
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }

    }
}
