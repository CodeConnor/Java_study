package com.xiaobang.oop;

public class StudentTest {
    public static void main(String[] args) {

        Student stu1 = new Student();

        stu1.name = "xiaoming";
        stu1.age = 24;

        System.out.println(stu1);

        System.out.println(stu1.name);
        System.out.println(stu1.age);

        stu1.eat();
        stu1.study();

        System.out.println("---------------------------");

        Student stu2 = new Student();

        stu2.name = "lihua";
        stu2.age = 22;

        System.out.println(stu2);

        System.out.println(stu2.name);
        System.out.println(stu2.age);

        stu2.eat();
        stu2.study();
    }
}
