package com.xiaobang.test;

import com.xiaobang.domain.Student;

import java.util.ArrayList;

public class ArrayListTest2 {
    /*
        需求:创建一个存储学生对象的集合
        存储3个学生对象,使用程序实现在控制台遍历该集合
     */
    public static void main(String[] args) {

        Student stu1 = new Student("小明", 18, '男');
        Student stu2 = new Student("小花", 17, '女');
        Student stu3 = new Student("小刚", 21, '男');

        ArrayList<Student> students = new ArrayList<>();

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getName() + "---" + student.getAge() + "---" + student.getGender());
        }
    }


}
