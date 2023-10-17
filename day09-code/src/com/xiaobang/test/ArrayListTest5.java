package com.xiaobang.test;

import com.xiaobang.domain.Student;

import java.util.ArrayList;

public class ArrayListTest5 {
    /*
    需求:定义一个方法,方法接收一个集合对象(泛型为Student)
    方法内部将年龄低于18的学生对象找出并存入新集合对象,方法返回新集合
     */
    public static void main(String[] args) {

        ArrayList<Student> list1 = new ArrayList<>();
        

        list1.add(new Student("John", 18, '男'));
        list1.add(new Student("Mike", 20, '男'));
        list1.add(new Student("Lily", 17, '女'));

        ArrayList<Student> resultList = getStudentsAgeLT18(list1);

        for (int i = 0; i < resultList.size(); i++) {
            Student student = resultList.get(i);
            System.out.println(student.getName() + "---" + student.getAge() + "---" + student.getGender());
        }
    }

    private static ArrayList<Student> getStudentsAgeLT18(ArrayList<Student> list1) {
        ArrayList<Student> resultList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            int age = list1.get(i).getAge();
            if (age < 18) {
                resultList.add(list1.get(i));
            }
        }
        return resultList;
    }
}
