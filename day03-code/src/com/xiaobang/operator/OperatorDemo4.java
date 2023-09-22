package com.xiaobang.operator;

public class OperatorDemo4 {
    /*
        逻辑运算符 -- 短路  -- && ||
        执行效率更高, 更常用
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
                        //false  &&  false
        boolean result = ++a > 5 && b-- < 4;

        // 不执行b--, 当&&换为&时则执行b--
        System.out.println(a);
        System.out.println(b);
        System.out.println(result);
    }
}
