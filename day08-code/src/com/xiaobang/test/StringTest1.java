package com.xiaobang.test;

import java.util.Scanner;

public class StringTest1 {
    /*
        需求:已知正确的用户名和密码,请用程序实现模拟用户登录.
        总共给三次机会,登录之后,给出相应的提示
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userName = "admin";
        String password = "admin123";

        int i = 3;
        while (i > 0) {
            i--;
            System.out.println("请输入用户名:");
            String inputName = sc.nextLine();

            System.out.println("请输入密码:");
            String inputPassword = sc.nextLine();

            if (userName.equals(inputName) && password.equals(inputPassword)) {
                    System.out.println("登录成功");
                    break;
            } else {
                if (i == 0) {
                    System.out.println("您的登录次数已用尽, 请24小时后重试");
                } else{
                    System.out.println("登录失败, 用户名或密码错误, 剩余" + i + "次机会");
                }
            }

        }

    }
}
