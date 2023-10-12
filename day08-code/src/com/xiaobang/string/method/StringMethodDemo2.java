package com.xiaobang.string.method;

public class StringMethodDemo2 {
    /*

        toCharArray()
        将此字符串转换为新的字符数组。

        charAt(int index)
        返回指定索引处的 char 值。


     */
    public static void main(String[] args) {
        printString2();

    }

    /**
     * 字符串遍历的第二种方法
     */
    private static void printString2() {
        String s1 = "abcd";

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            System.out.println(c);  // a b c d
        }
    }

    /**
     * 字符串的第一种遍历方式
     */
    private static void printString1() {
        String s1 = "abcd";

        char[] charArray = s1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);  // a b c d
        }
    }
}
