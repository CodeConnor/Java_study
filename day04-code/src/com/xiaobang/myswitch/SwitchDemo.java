package com.xiaobang.myswitch;
import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        switchTest2();
    }

    /*
        需求:键盘输入一个数,1-7分别匹配星期一到星期日
     */
    public static void switchTest1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7之内的整数:");
        int week = sc.nextInt();

        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }

    /*
        需求:键盘录入一个数,1-5匹配工作日,6-7匹配休息日
        注意:需使用switch的穿透效果
     */
    public static void switchTest2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        int week = sc.nextInt();

        switch (week) {
            case 1, 2, 3, 4, 5:
                System.out.println("工作日");
                break;
            case 6, 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入错误");
                break;

        }
    }
}
