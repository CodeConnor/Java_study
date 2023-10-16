package com.xiaobang.test;

import java.util.ArrayList;

public class ArrayListTest1 {
    /*
    需求:创建一存储字符串的集合,内部存储3个字符串元素,使用程序实现在控制台遍历该集合
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aa");
        list.add("bb");
        list.add("cc");

        // 遍历时计数器用list.size()获取, 元素用get()获取
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
