package com.xiaobang.test;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {

        guessNumber();
    }

    /*
        需求:猜数字小游戏 范围1~100 七次猜测机会 猜错提示大小
     */
    public static void guessNumber(){
        System.out.println("----猜数字游戏开始----");

        // 生成随机数字
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 7; i++){
            // 用户输入数字
            System.out.println("请输入数字:");
            int scNum = sc.nextInt();

            // 对比数字
            if (scNum < randomNum) {
                System.out.println("猜小了, 还剩" + (7-i) + "次机会");
            } else if (scNum > randomNum) {
                System.out.println("猜大了, 还剩" + (7-i) + "次机会");
            } else {
                System.out.println("猜对了, 你赢了!");
                break;
            }
        }

    }
}
