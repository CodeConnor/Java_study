package com.xiaobang.stringbuilder;

public class StringBuilderDemo1 {
    /*
    通过对比十万次字符串凭借操作的执行时间
    来感受使用和不使用StringBuilder的效率差别
     */

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        StringBuilder s = new StringBuilder();
        int i = 1;
        while (i <= 100000){
            s.append(i);
            i++;
        }
        System.out.println(s);

        long end = System.currentTimeMillis();
        System.out.println(end - start);  // 16

    }

    private static void extracted() {
        // 获取自1970年1月1日0时开始直到现在为止所经历时间的毫秒值
        long start = System.currentTimeMillis();

        String s = "";
        int i = 1;
        while (i <= 100000){
            s += i;
            i++;
        }
        System.out.println(s);

        long end = System.currentTimeMillis();
        System.out.println(end - start);  // 3168
    }
}
