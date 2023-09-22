package com.xiaobang.operator;

public class OperatorDemo3 {
    /*
        逻辑运算符 -- 基本 & | ! ^
     */
    public static void main(String[] args) {
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        System.out.println("-------------------------------------");

        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);

        System.out.println("-------------------------------------");

        System.out.println(!true);
        System.out.println(!false);

        System.out.println("-------------------------------------");

        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
    }
}
