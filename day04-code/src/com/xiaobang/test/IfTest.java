package com.xiaobang.test;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        gradeLevel();
    }

    /*
        需求:键盘录入用户的密码,如果是123456,程序输出(密码正确),否则的话输出(密码错误)
     */

    public static void checkPassword() {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码:");
        int password = sc.nextInt();

        if (password == 123456) {
            System.out.println("密码正确");
        } else {
            System.out.println("密码错误");
        }
    }

    /*
        需求:键盘录入学生成绩,根据成绩进行不同的分级
            100-90:优秀
            89-80:良好
            79-60:及格
            60以下:不及格
            其它:输入错误
     */
    public static void gradeLevel(){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩:");
        int grade = sc.nextInt();

        // 方案1,最后判断输入错误
        /*if (grade >= 90 && grade <= 100) {
            System.out.println("优秀");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("良好");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("及格");
        } else if (grade >= 0 && grade < 60) {
            System.out.println("不及格");
        }else {
            System.out.println("输入错误");
        }*/

        // 方案2,先判断输入错误
        /*if (grade < 0 || grade > 100) {
            System.out.println("输入有误");
        } else if (grade >= 90 && grade <= 100) {
            System.out.println("优秀");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("良好");
        } else if (grade >= 60 && grade <= 79) {
            System.out.println("及格");
        } else{
            System.out.println("不及格");
        }*/

        // 方案3,if嵌套
        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                System.out.println("优秀");
            } else if (grade >= 80) {
                System.out.println("良好");
            } else if (grade >= 60) {
                System.out.println("及格");
            } else{
                System.out.println("不及格");
            }
        }else{
            System.out.println("输入错误");
        }
    }
}
