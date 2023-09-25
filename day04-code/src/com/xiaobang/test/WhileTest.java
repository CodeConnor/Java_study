package com.xiaobang.test;

public class WhileTest {
    public static void main(String[] args) {
        printNumber();
    }


    /*
        需求:在控制台打印出所有的水仙花数(while循环实现)
        1.水仙花数是一个三位数
        2.水仙花数的个位、十位、百位的数字立方和等于原数
     */
    public static void printNumber(){

        int i = 100;
        while (i <= 999){
            // 计算次方和
            int sum = 0;
            sum += (i % 10) * (i % 10) * (i % 10);
            sum += ((i / 10) % 10) * ((i / 10) % 10) * ((i / 10) % 10);
            sum += (i / 100) * (i / 100) * (i / 100);

            // 判断次方和与原数的大小
            if (sum == i) {
                System.out.println(sum);
            }
            // 计数器
            i++;
        }

    }
}
