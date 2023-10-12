package com.xiaobang.string.method;

public class StringMethodDemo3 {
    /*
    substring(int beginIndex)
    返回一个字符串，该字符串是此字符串的子字符串。

    substring(int beginIndex, int endIndex)
    返回一个字符串，该字符串是此字符串的子字符串。

     */
    public static void main(String[] args) {
        method2();
    }

    private static void method2() {
        String s1 = "abcdef";

        String res = s1.substring(2, 4);
        System.out.println(res);  // cde
    }

    private static void method() {
        String s1 = "ABCDEF";

        String res = s1.substring(2);
        System.out.println(res);  // CDEF
    }
}
