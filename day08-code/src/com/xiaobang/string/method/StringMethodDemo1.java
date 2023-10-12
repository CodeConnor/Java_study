package com.xiaobang.string.method;

public class StringMethodDemo1 {
    /*
        public boolean equals(Object  anObject)
            将此字符串与指定对象进行比较。

        public boolean equalsIgnoreCase  （String otherString）
            将此 String 与另一个 String 进行比较，忽略大小写注意事项。
     */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1 == s2);           // false
        System.out.println(s1.equals(s2));      // true

        String ss1 = "abc";
        String ss2 = "ABC";

        System.out.println(ss1.equals(ss2));            // false
        System.out.println(ss1.equalsIgnoreCase(ss2));  // true


    }
}
