package com.xiaobang.encapsulation;

public class StudentTest {
    public static void main(String[] args) {

        Student stu = new Student();
        stu.setAge(-1);
        stu.setAge(25);
        int age = stu.getAge();
        System.out.println("age:" + age);
    }
}
