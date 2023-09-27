package com.xiaobang.test;

public class ArrayTest3 {
    public static void main(String[] args) {

        int[][] arr1 = {
                {10, 15, 20},
                {20, 15},
                {30, 20}
        };

        printArray(arr1);
        int sum = getSum(arr1);
        System.out.println(sum);

    }

    /**
     * 遍历并打印所有二维数组的元素
     */
    public static void printArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = arr[i][j];
                System.out.println(num);
            }
        }
    }

    /**
     * 遍历二维数组并求和
     */
    public static int getSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
