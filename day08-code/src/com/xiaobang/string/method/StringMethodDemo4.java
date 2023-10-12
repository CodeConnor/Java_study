package com.xiaobang.string.method;

public class StringMethodDemo4 {
    /*
    `replace(参数1, 参数2) : 将参数1替换为参数2并返回替换后的值`
        参数1 : 旧值
        参数2 : 新值
     */

    public static void main(String[] args) {

        String s1 = "abc123ghi";

        String res = s1.replace("123", "def");
        System.out.println(res);  // abcdefghi
    }
}
