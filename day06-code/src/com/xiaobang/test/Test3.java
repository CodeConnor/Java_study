package com.xiaobang.test;

public class Test3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {1, 2, 3, 4};

        boolean res1 = compareArray(arr1, arr2);
        boolean res2 = compareArray(arr2, arr3);
        System.out.println(res1);
        System.out.println(res2);


    }

    /*
        需求:
            定义一个方法,用于比较两个数组的内容是否相同
            要求:长度,内容,顺序完全相同
     */

    public static boolean compareArray(int[] arr1, int[] arr2) {

        // 对比长度
        if (arr1.length != arr2.length){
            return false;
        }

        // 对比数组元素的内容和顺序
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
