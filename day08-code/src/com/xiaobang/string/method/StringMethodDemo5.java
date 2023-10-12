package com.xiaobang.string.method;

public class StringMethodDemo5 {
    /*
    split() :
     */

    public static void main(String[] args) {
        String s1 = "192.168.1.1";

        String[] splitRes = s1.split("\\.");  // 单独的.是通配符, 需要用\\转义
        for (int i = 0; i < splitRes.length; i++) {
            System.out.println(splitRes[i]);
        }
    }
}
