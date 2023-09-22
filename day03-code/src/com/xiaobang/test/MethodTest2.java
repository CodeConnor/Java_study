package com.xiaobang.test;
import java.util.Scanner;
public class MethodTest2 {
    public static void main(String[] args) {
        /*
            主方法: 使用键盘录入传参, 接收其他方法返回值, 并打印在控制台
         */
        // 使用键盘录入参数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // 将键盘录入的参数传入自定义方法, 接收返回值
        int max = getMax(num1, num2);
        // 打印返回值
        System.out.println("最大值为:" + max);
    }

    public static int getMax(int num1, int num2) {
        /*
            接收传参, 计算两个参数中的最大值, 并返回
         */
        int max = num1 > num2 ? num1 : num2;
        return max;
    }
}
