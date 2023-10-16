package com.xiaobang.test;

import com.xiaobang.domain.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {
    /*
    需求:创建一个存储学生对象的集合,
        存储3个学生对象,使用程序实现在控制台遍历该集合
        学生的姓名和年龄来自于键盘录入
     */
    public static void main(String[] args) {
        /*
        ArrayList<Student> students = getStudents(3);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getName() + "---" + student.getAge() + "---" + student.getGender());
        }*/

        ArrayList<Student> arrStudent = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第" + i + "位学生信息");
            addStudent(arrStudent);
        }

        for (int i = 0; i < arrStudent.size(); i++) {
            Student student = arrStudent.get(i);
            System.out.println(student.getName() + "---" + student.getAge() + "---" + student.getGender());
        }

    }


    // 方法1 : 直接返回创建好的对象集合
    private static ArrayList<Student> getStudents(int num) {
        // 创建集合 准备录入工作
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while(i <= num) {
            // 录入学生信息
            System.out.println("请输入第" + i + "位学生信息");
            System.out.println("姓名:");
            String name = sc.next();
            System.out.println("年龄:");
            int age = sc.nextInt();
            System.out.println("性别:");
            char gender = sc.next().charAt(0);  // 录入字符串, 再从录入的字符串中返回char类型的元素

            // 使用录入的信息创建对象
            Student student = new Student(name, age, gender);
            students.add(student);
            i++;
        }
        return students;
    }

    // 方法2 : 传入空集合, 添加对象到集合中
    private static void addStudent(ArrayList<Student> arrStudent) {
        Scanner sc = new Scanner(System.in);

        System.out.println("姓名:");
        String name = sc.next();

        System.out.println("年龄:");
        int age = sc.nextInt();

        System.out.println("性别:");
        char gender = sc.next().charAt(0);

        Student stu = new Student(name, age, gender);
        arrStudent.add(stu);
    }
}
