package com.xiaobang.overload;

public class OverloadDemo {
    /*
        需求:提供四个计算方法,方法功能如下:
        1.计算两个整数相加的和
        2.计算两个小数相加的和
        3.计算三个整数相加的和
        4.计算三个小数相加的和
     */
    public static void main(String[] args) {
        int res1 = add(10, 20);
        double res2 = add(1.4, 3.3);
        int res3 = add(10, 20, 30);
        double res4 = add(2.3, 3.4, 3.5);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

    }

    public static int add(int a, int b){
        return a + b;
    }

    public static double  add(double a, double b){
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static double  add(double a, double b, double c){
        return a + b + c;
    }
}
