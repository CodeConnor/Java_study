package com.xiaobang.test;

public class Test6 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] result = reverseArray(arr1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        int a = 10;
        int b = 20;
        int[] exchangedNum = exchange(a, b);
        System.out.println("a = " + exchangedNum[0]);
        System.out.println("a = " + exchangedNum[1]);

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] ints = exchangeArray(arr2);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(arr2);
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

    // 思路1 : 新建一个数组存储反转后的元素
    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[arr.length - 1 - i] = arr[i];
        }
        return result;
    }

    // 思路2 : 使用异或交换数组内元素
    public static int[] exchangeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = exchange(arr[i], arr[arr.length - 1 - i])[0];
            arr[arr.length - 1 - i] = exchange(arr[i], arr[arr.length - 1 - i])[1];
        }
        return arr;
    }

}
