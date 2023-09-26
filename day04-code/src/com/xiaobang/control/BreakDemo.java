package com.xiaobang.control;

import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        login();
    }

    /*
        需求: 模拟用户登录, 一共三次机会 , 假设密码123456
     */

    public static void login() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            // 输入密码
            System.out.println("请输入密码:");
            int password = sc.nextInt();
            // 判断密码是否正确
            if (password == 123456) {
                System.out.println("登录成功!");
                // 登录成功, 退出循环
                break;
            } else {
                System.out.println("登录失败,密码错误,剩余" + (3 - i) + "次登录机会");
            }
        }
    }
}
