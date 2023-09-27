package com.xiaobang.array2;

public class ArrayDemo2 {

    /*
        二维数组的动态初始化
     */

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {2, 3};
        int[] arr4 = {5, 6, 7, 8, 9};

        int[][] arr = new int[2][3];

        arr[0] = arr1;
        arr[1] = arr2;

        arr[0] = arr3;
        arr[1] = arr4;
        arr[2] = arr3;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
