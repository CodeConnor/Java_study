package com.xiaobang.test;

public class StringBuilderTest2 {
    /*
    需求:
        定义一个方法,把int数组中的数据按照指定的格式拼接成一个字符串返回
        调用该方法,并在控制台输出结果.
        例如:数组为int[]arr={1,2,3}
        执行方法后的输出结果为:[1, 2, 3]
     */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        String s1 = arrToString(arr);
        System.out.println(s1);

        int[] arr0 = {1};
        String s2 = arrToString(arr0);
        System.out.println(s2);

    }

    private static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");


        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 1 || i == arr.length -1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }

        String str = sb.append("]").toString();
        return str;
    }
}
