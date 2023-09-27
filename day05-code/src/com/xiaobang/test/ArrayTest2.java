package com.xiaobang.test;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest2 {

    /*
        需求1: 键盘录入n个整数 求其中的最大值
        需求2 : 生成n个1~100之间的随机数, 求出最小值
     */
    public static void main(String[] args) {

        int[] arr1 = initArrayFromScanner();
        int max = getMax(arr1);
        System.out.println("最大值:" + max);

        int[] arr2 = initArrayFromRandomNumber(10);
        int min = getMin(arr2);
        System.out.println("最小值:" + min);


    }

    /*
        手动输入元素来创建数组
     */
    private static int[] initArrayFromScanner() {
        Scanner sc = new Scanner(System.in);
        // 通过输入手动决定元素个数
        System.out.println("请输入元素个数:");
        int count = sc.nextInt();
        // 动态初始化数组
        int[] arr1 = new int[count];

        System.out.println("请输入整数:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("第" + (i + 1) + "个:");
            arr1[i] = sc.nextInt();
        }
        return arr1;
    }

    /**
     * 求数组最大值
     */
    public static int getMax(int[] arr) {
        // 将数组第一个元素赋值给max, 假设第一个元素是最大值
        int max = arr[0];
        // 从第二个元素开始依次与max比较
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }

    /**
     * 求数组最小值
     */
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /*
        使用随机数来创建数组
     */
    public static int[] initArrayFromRandomNumber(int count){
        Random r = new Random();

        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.println(arr[i]);
        }

        return  arr;
    }


}
