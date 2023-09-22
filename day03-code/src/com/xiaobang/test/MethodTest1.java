package com.xiaobang.test;

public class MethodTest1 {

    public static void main(String[] args) {
        /*
            主方法
         */
        caculateMax();
    }


    public static void caculateMax(){
        /*
            计算两个整数的最大值,并打印在控制台
         */
        int num1 = 10;
        int num2 = 20;

        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}
