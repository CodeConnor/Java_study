package com.xiaobang.test;

import java.util.Scanner;

public class StringTest4 {
    /*
    需求:键盘录入一个字符串,如果字符串中包含(TMD),则使用***替换
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String input = sc.nextLine();

        String output = input.replace("TMD", "***");
        System.out.println(output);
    }
}
