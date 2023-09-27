package com.xiaobang.array2;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(arr1);  // [[I@4eec7777
        System.out.println(arr1[0]);  // [I@3b07d329
        System.out.println(arr1[1]);  // [I@41629346

        System.out.println(arr1[1][1]);

    }


}
