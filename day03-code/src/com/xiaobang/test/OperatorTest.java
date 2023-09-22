package com.xiaobang.test;

import java.util.Scanner;

public class OperatorTest {
    /*
        测试: 键盘录入三个整数, 求三个数的最大值
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 输入三个数
        System.out.println("请输入第一个整数:");
        int num1 = sc.nextInt();

        System.out.println("请输入第二个整数:");
        int num2 = sc.nextInt();

        System.out.println("请输入第三个整数:");
        int num3 = sc.nextInt();
        // 两两比较 求最大值
        int max = num1 > num2 ? num1 : num2;
        max = max > num3 ? max : num3;

        System.out.println("最大值为:" + max);

    }
}
