package com.xiaobang.myif;
import java.util.Scanner;
public class IfDemo {
    public static void main(String[] args) {
        ifTest1();
        ifTest2();
        ifTest3();
    }

    public static void ifTest1(){
        System.out.println("start");

        int age = 18;

        if(age >= 18){
            System.out.println("已成年,可以进入网吧上网");
        }

        System.out.println("end");

    }

    public static void ifTest2(){
        System.out.println("start");

        int age = 17;

        if(age >= 18){
            System.out.println("已成年,可以进入网吧上网");
        } else{
            System.out.println("未成年,无法进入网吧上网");
        }

        System.out.println("end");
    }

    public static void ifTest3(){
        //需求:键盘录入整数数值表示身份,1:会员,2:非会员,其他:输入有误

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入整数:");
        int userId = sc.nextInt();

        if (userId == 1) {

            System.out.println("会员您好,欢迎");

        } else if (userId == 2) {

            System.out.println("非会员您好,欢迎");

        }else {

            System.out.println("输入有误,请重新输入");

        }
    }
}

