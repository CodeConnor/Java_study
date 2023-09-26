package com.xiaobang.control;

public class ContinueDemo {
    public static void main(String[] args) {
        continueTest();
    }

    /*
        需求: 报数1~20 跳过3 7 14
     */
    public static void continueTest(){
        for(int i = 1; i <= 20; i++) {
            // 判断是否是指定数字, 是则跳过
            if (i == 3 || i == 7 || i == 14){
                continue;
            }
            System.out.println(i);
        }
    }


}
