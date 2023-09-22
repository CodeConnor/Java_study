package com.xiaobang.operator;

public class OperatorDemo1 {
    /*
        赋值运算符
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        b += a;  // b = b + a
        System.out.println(b);

        b -= a;
        System.out.println(b);

        b *= a;
        System.out.println(b);

        b /= a;
        System.out.println(b);

        b %= a;
        System.out.println(b);

        double d = 10.666;
        int c = 20;
        c += d;  //  结果被强制转换为int
        System.out.println(c);
    }
}
