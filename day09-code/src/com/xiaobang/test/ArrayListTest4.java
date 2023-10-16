package com.xiaobang.test;

import java.util.ArrayList;

public class ArrayListTest4 {
    /*
    需求:创建一个存储String的集合,内部存储(test,张三,李四,test,test)
    字符串删除所有的test字符串,删除后,将集合剩余元素打印在控制台
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");

        int i = 0;
        while (i < list.size()) {
            if ("test".equals(list.get(i))) {
                list.remove(i);
                continue;
            }
            i++;
        }

        System.out.println(list);

    }
}
