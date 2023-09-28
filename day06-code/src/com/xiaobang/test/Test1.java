package com.xiaobang.test;

public class Test1 {
    /*
        规则:从任意一个数字开始报数,当要报的数字包含7或者是7的倍数时都要说:过.
        需求:在控制台打印出1~100之间满足逢七过规则的数据
     */
    public static void main(String[] args) {
        test();

    }

    public static void test(){
        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0 || i % 10 == 7 || (i / 10) % 10 == 7) {
                System.out.println(i);
            }

        }
    }
}
