package com.xiaobang.array1;

public class ArrayDemo2 {
    public static void main(String[] args) {
        arrayTest();

    }

    public static void arrayTest() {
        int[] arr = new int[0];

        arr[0] = -1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
