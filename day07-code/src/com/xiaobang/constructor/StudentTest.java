package com.xiaobang.constructor;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("xiaoming", 24);
        System.out.println("姓名:" + stu1.name + "---" + "年龄:" + stu1.age);

        Student stu2 = new Student("lihua", 25);
        System.out.println("姓名:" + stu2.name + "---" + "年龄:" + stu2.age);
    }
}
