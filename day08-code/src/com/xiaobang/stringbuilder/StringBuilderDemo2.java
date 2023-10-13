package com.xiaobang.stringbuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = sb1.append("aaa");
        System.out.println(sb1 == sb2);

        StringBuilder sb = new StringBuilder();
        sb.append(111).append(222).append(333);
        System.out.println(sb);

        StringBuilder sb11 = new StringBuilder("123456");
        sb11.reverse();
        System.out.println(sb11);


        StringBuilder sb22 = new StringBuilder();
        int sbLength = sb22.append("hello world").length();
        System.out.println(sbLength);  // 11
    }
}
