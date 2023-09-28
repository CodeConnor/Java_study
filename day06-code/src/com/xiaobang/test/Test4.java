package com.xiaobang.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        int[] arr = {19,28,37,46,50};
        int res = checkArrayIndex(arr);
        System.out.println(res);

    }

    /*
        需求:
            设计一个方法,查找元素在数组中的索引位置
            已知一个数组arr={19,28,37,46,50};
            键盘录入一个数据,查找该数据在数组中的索引,不考虑元素重复
            并在控制台输出找到的索引值.
            如果没有查找到,则输出-1
     */

    public static int checkArrayIndex(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要查找的整数:");
        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
