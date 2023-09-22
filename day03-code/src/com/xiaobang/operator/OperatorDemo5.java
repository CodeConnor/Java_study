package com.xiaobang.operator;

public class OperatorDemo5 {
    /*
        三元运算符
        需求:求两个数的最大值
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = a > b ? a : b;
        System.out.println(max);

    }
}
