package com.xiaobang.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50, 28, 37, 37};
        int[] index = getIndex(arr);
        for (int i = 0; i < index.length; i++) {
            System.out.println(index[i]);
        }
    }

    /*
        需求:
            设计一个方法,查找元素在数组中的索引位置
            已知一个数组arr={19,28,37,46,50,28,37,37};
            键盘录入一个数据,查找该数据在数组中的索引,考虑元素重复
            并在控制台输出找到的索引值.
            如果没有查找到,则输出-1

       注意: return只能返回一个数据,产生多个结果时使用数组存储结果
     */

    public static int[] getIndex(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要查找的元素:");
        int num = sc.nextInt();
        // 统计结果数量
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count1++;
            }
        }


        if (count1 == 0)  {
            int[] results = {-1};
            return results;
        } else{
            // 创建数组存储结果
            int[] results = new int[count1];
            // 使用count2当做result的索引
            int count2 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (num == arr[i]) {
                    results[count2] = i;
                    count2++;
                }

            }
            return results;
        }

    }
}
