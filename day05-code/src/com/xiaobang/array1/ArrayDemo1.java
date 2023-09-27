package com.xiaobang.array1;

public class ArrayDemo1 {
    public static void main(String[] args) {
        arrayTest1();
        arrayTest2();
    }

    public static void arrayTest1(){
        int[] arr1 = {10, 20, 30};
        double[] arr2 = {1.5, 2.3, 4.5};

        System.out.println(arr1);
        System.out.println(arr2);

        System.out.println(arr1[1]);

        arr2[2] = 3.14;
        System.out.println(arr2[2]);
    }

    // 遍历数组
    public static void arrayTest2(){
        int[] arr1 = {11, 22, 33, 44, 55};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

}
