package com.xiaobang.myrandom;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        randomTest();
    }

    /*
        需求 : 生成20个1~100的随机数
     */
    public static void randomTest(){
        Random r = new Random();

        for (int i = 1; i <= 20; i++) {
            int num = r.nextInt(100) + 1;
            System.out.println(num);
        }
    }
}
