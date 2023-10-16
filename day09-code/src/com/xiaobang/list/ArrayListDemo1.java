package com.xiaobang.list;

import java.util.ArrayList;



public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();

        list1.add(10);
        list1.add("100");
        list1.add(20.5);
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        System.out.println(list2);

    }
}
