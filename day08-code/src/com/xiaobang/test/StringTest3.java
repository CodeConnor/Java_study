package com.xiaobang.test;

import java.util.Scanner;

public class StringTest3 {
    /*
    需求:以字符串的形式从键盘接受一个手机号,将中间四位号码屏蔽
    最终效果为:156****1234
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入11位电话号码:");
        String tel = sc.nextLine();

        String coveredTel = tel.substring(0, 3) + "****" + tel.substring(7);
        System.out.println(coveredTel);
    }
}
