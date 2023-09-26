package com.xiaobang.control;

import java.util.Scanner;

public class ControlDemo {
    public static void main(String[] args) {
        initMenu();
    }

    /*
        需求: 学生管理系统 - 菜单搭建
     */

    public static void initMenu() {
        Scanner sc = new Scanner(System.in);

        // 使用死循环重复显示菜单
        lo:
        // 标号 : 标记该循环, 即该循环的名称
        while (true) {
            System.out.println("请输入您的选择: 1. 添加学生  2. 删除学生  3. 修改学生  4. 查看学生  5. 退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("添加学生...");
                    break;
                case 2:
                    System.out.println("删除学生...");
                    break;
                case 3:
                    System.out.println("修改学生...");
                    break;
                case 4:
                    System.out.println("查看学生...");
                    break;
                case 5:
                    System.out.println("感谢您的使用,再见!");
                    break lo;  // break后跟循环标号表示该循环直接结束循环而不是switch
            }
        }
    }
}
