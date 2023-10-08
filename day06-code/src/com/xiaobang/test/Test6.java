package com.xiaobang.test;

public class Test6 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] res1 = reverseArray1(arr1);
        for (int i = 0; i < res1.length; i++) {
            System.out.println(res1[i]);
        }
        int a = 10;
        int b = 20;
        int[] exchangedNum = exchange(a, b);
        System.out.println("a = " + exchangedNum[0]);
        System.out.println("a = " + exchangedNum[1]);

        int[] arr2 = {1, 2, 3, 4, 5};
        int[] res2 = reverseArray2(arr2);
        for (int i = 0; i < res2.length; i++) {
            System.out.println(arr2[i]);
        }


        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int[] res3 = reverseArray3(arr3);
        for (int i = 0; i < res3.length; i++) {
            System.out.println(arr3[i]);
        }

    }

    /*
    需求 : 交换两个变量的值 不定义第三方变量
    int a = 10;
    int b = 20;
 */
    public static int[] exchange(int a, int b) {

        // 思路 : 一个数  异或两个相同的数后 值不变
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        int[] res = {a, b};

        return res;
    }

    /*
        需求:
            已知一个数组arr={11,22,33,44,55};
            用程序实现把数组中的元素值交换,
            交换后的数组arr={55,44,33,22,11};
            并在控制台输出交换后的数组元素.
     */

    // 思路1 : 直接翻转数组, 新建一个数组存储反转后的元素
    public static int[] reverseArray1(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[arr.length - 1 - i] = arr[i];
        }
        return result;
    }

    // 思路2 : 使用异或交换数组内元素
    public static int[] reverseArray2(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int[] temp = exchange(arr[i], arr[arr.length - 1 - i]);
            arr[i] = temp[0];
            arr[arr.length - 1 - i] = temp[1];
        }
        return arr;
    }

    // 思路3: 定义两个指针分别指向数组开头和结尾的索引, 元素交换后两个指针分别自增和自减
    public static int[] reverseArray3(int[] arr) {
        // 初始化语句和条件控制语句都有两条
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }
        return arr;
    }

}
