package com.xiaobang.test;

import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
        String code = getVerificationCode();
        System.out.println("验证码为:" + code);
    }


    /*
    需求:
        请从26个英文字母(大小写都包含), 以及数字0-9中,
        随机产生一个5位的字符串验证码, 并打印在控制台
        效果:uYq8I, 3r4Zj
    */
    private static String getVerificationCode() {
        char[] chs = initVerificationCode();

        String verificationCode = "";
        Random r = new Random();

        for (int i = 1; i <= 5; i++) {
            int randomIndex = r.nextInt(chs.length);
            verificationCode += chs[randomIndex];

        }
        return verificationCode;
    }

    private static char[] initVerificationCode() {
        char[] chs = new char[26 + 26 + 10];
        int index = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            chs[index] = c;
            index++;
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            chs[index] = c;
            index++;
        }

        for (char c = '0'; c <= '9'; c++) {
            chs[index] = c;
            index++;
        }
        return chs;
    }



}
