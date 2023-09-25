package com.xiaobang.test;

import java.awt.*;

public class ForTest {
    public static void main(String[] args) {
        /*printHello(3);
        System.out.println("--------------");
        printHello(5);
        System.out.println("--------------");
        printHello(-1);

        printNumber();*/

        /*int sum1 = getSum1();
        System.out.println("1~100的偶数和为: " + sum1);

        int sum2 = getSum2();
        System.out.println("1~100的偶数和为: " + sum2);

        filterNumber();*/

        printRectangle();

        System.out.println("----------");

        printTriangle();

        System.out.println("---------");

        printTable();
    }

    /*
        需求:控制台打印10次Hello World!
     */
    public static void printHello(int n){


        if (n < 1){
            System.out.println("参数输入错误");
        }
        else {
            for(int i = 1; i <= n; i++){
                System.out.println("Hello World!");
            }
        }
    }


    /*
        需求:使用循环模拟计时器
            在控制台打印数字1~3
            在控制台打印数字3~1
     */
    public static void printNumber(){
        // 正计时
        for (int i = 1; i <= 3; i++){
            System.out.println(i);
        }

        // 倒计时
        for (int j = 3; j >= 1; j--){
            System.out.println(j);
        }
    }


    /*
        需求: 求1~100之间的偶数和, 并把求和结果输出到控制台
     */
    // 方法1:
    public static int getSum1(){
        // 定义变量存储求和结果
        int sum = 0;

        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        //返回结果
        return sum;
    }

    // 方法2:
    public static int getSum2(){
        int sum = 0;

        for (int i = 2; i <= 100; i += 2){
            sum += i;
        }

        return sum;
    }


    /*
        需求:在控制台输出所有的水仙花数,并统计水仙花数的个数
        规则:
        1.水仙花数是一个三位数
        2.水仙花数的个位、十位、百位的数字立方和等于原数
     */
    public static void filterNumber(){
        // 定义count记录水仙花数的个数
        int count = 0;

        for (int i = 100; i <= 999; i++){
            // 定义sum记录立方和
            int sum = 0;
            sum += (i % 10) * (i % 10) * (i % 10);
            sum += ((i / 10) % 10) * ((i / 10) % 10) * ((i / 10) % 10);
            sum += (i / 100) * (i / 100) * (i / 100);

            // 判断是否为水仙花数
            if (sum == i) {
                count++;
                System.out.println("水仙花数有:" + sum);
            }
        }

        System.out.println("水仙花数的个数为:" + count);
    }


    /*
        需求:在控制台使用 * 打印4行5列矩形
            每次打印只能打印一个 *
            *****
            *****
            *****
            *****
     */
    public static void printRectangle(){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++){
                System.out.print("*");  // print打印数据后不换行, println打印数据后自动换行
            }
            System.out.println();
        }
    }


    /*
        需求:在控制台使用 * 打印5行的直角三角形
                *
                **
                ***
                ****
                *****
     */
    public static void printTriangle(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }


    /*
        需求:在控制台打印出99乘法表
        1*1=1
        1*2=2  2*2=4
        1*3=3  2*3=6  3*3=9
        1*4=4  2*4=8  3*4=12  4*4=16
        1*5=5  2*5=10 3*5=15  4*5=20  5*5=25
        ...
     */
    public static void printTable(){
        for (int i = 1; i <= 9; i++){

            for (int j = 1; j <= i; j++){
                System.out.print(j + "*" + i + "=" + i*j + "\t");  // 制表符: \t
            }

            System.out.println();
        }
    }
}
