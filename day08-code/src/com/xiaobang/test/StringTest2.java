package com.xiaobang.test;

import java.util.Scanner;

public class StringTest2 {
    /*
    需求:键盘录入一个字符串,统计该字符串中大写字母字符,小写字母字符,数字字符出现的次数
        (不考虑其他字符)
        例如:aAb3&c2B*4CD1
        小写字母:3个
        大写字母:4个
        数字:4个
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String input = sc.nextLine();

        // 定义计数器
        int upperCount = 0;
        int lowerCount = 0;
        int numCount = 0;

        // 遍历字符串
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            // 判断字符范围
            if (c >= 'a' && c <= 'z') {
                lowerCount++;
            } else if (c >= 'A' && c <= 'Z') {
                upperCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            }
        }

        System.out.println("小写字母:" + lowerCount);
        System.out.println("大写字母:" + upperCount);
        System.out.println("数字:" + numCount);
    }
}
