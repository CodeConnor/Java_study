package com.xiaobang.operator;

public class OperatorDemo2 {
    /*
        需求: 区分++\--分别在变量前或者后参与运算时的情况
        在前: ++a
        在后: a++
     */
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;  // a+1=11 --> b=a=11
        b = a++;  // b=a=11 --> a=a+1=12

        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
