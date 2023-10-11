package com.xiaobang.string;

public class StringDemo1 {
    /*
        String类常见构造方法:
            public String():创建一个空白字符串,里面不含任何内容
            public String(char[] chs):根据传入的字符数组,创建字符串对象
            public String(String original):根据传入的字符串,来创建字符串对象
     */
    public static void main(String[] args) {

        // 空白字符串
        String s1 = new String();
        System.out.println(s1);

        // 将字符数组拼接为字符串
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println(s2);

        // 通过传参创建字符串
        String s3 = new String("abc");
        System.out.println(s3);
    }
}
