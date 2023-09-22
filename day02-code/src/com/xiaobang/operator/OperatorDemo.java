package com.xiaobang.operator;/*
    需求: 键盘录入一个三位数,将其拆分为个位、十位、百位后,打印在控制台
 */
import java.util.Scanner;
public class OperatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入整数:");
        int number = sc.nextInt();

        int units = number % 10;  // 求出个位数
        int tens = number / 10 % 10;  // 求出十位数
        int hundreds = number / 100 % 10;  // 求百位数

        // 打印结果
        System.out.println("整数" + number + "的个位为:" + units);
        System.out.println("整数" + number + "的十位为:" + tens);
        System.out.println("整数" + number + "的百位为:" + hundreds);
    }
}
