package com.xiaobang.test;

import com.xiaobang.domain.Student;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<Student> stuList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        // 菜单
        lo:
        while (true) {
            System.out.println("----------欢迎使用学生信息管理系统----------");
            System.out.println("1.添加学生信息");
            System.out.println("2.删除学生信息");
            System.out.println("3.修改学生信息");
            System.out.println("4.查询学生信息");
            System.out.println("5.退出");
            System.out.println("请按提示输入您的选择:");

            int userInput = sc.nextInt();
            switch(userInput) {
                case 1:
                    addStuInfo(stuList);
                    break;
                case 2:
                    delStuInfo(stuList);
                    break;
                case 3:
                    System.out.println("modify");
                    break;
                case 4:
                    queryStuInfo(stuList);
                    break;
                case 5:
                    System.out.println("已退出,感谢您的使用,再见!");
                    break lo;
                default:
                    System.out.println("您的输入有误,请重新输入");
                    break;
            }
        }

    }

    /**
     * 删除学生信息
     * @param stuList
     */
    private static void delStuInfo(ArrayList<Student> stuList) {
        // 判断集合中是否有数据
        if (listIsEmputy(stuList)) return;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要删除的学生的学号,或输入\"delete all\"删除全部学生信息:");
        String userInput = sc.nextLine();

        // 判断是否删除全部
        if ("delete all".equals(userInput)) {
            for (int i = 0; i < stuList.size(); i++) {
                stuList.remove(i);
                System.out.println("删除成功!");
                return;
            }
        }

        // 删除指定信息
        for (int i = 0; i < stuList.size(); i++) {
            if (stuList.get(i).getId().equals(userInput)) {
                stuList.remove(i);
                System.out.println("删除成功!");
                return;
            }
        }

        // 没有查询到对应学号
        System.out.println("删除失败,请输入正确学号");

    }

    /**
     * 查询存储学生信息的集合是否为空
     * @param stuList
     * @return 空为true 非空为false
     */
    private static boolean listIsEmputy(ArrayList<Student> stuList) {
        if (stuList.size() == 0) {
            System.out.println("暂无学生信息!");
            return true;
        }
        return false;
    }

    /**
     * 查询学生信息
     * @param stuList
     */
    private static void queryStuInfo(ArrayList<Student> stuList) {
        // 判断集合中是否有数据
        if (listIsEmputy(stuList)) return;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查询的学生学号:");
        String userInput = sc.nextLine();

        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            // 判断学号是否能查询到
            if (stu.getId().equals(userInput)) {
                System.out.println("学号:" + stu.getId());
                System.out.println("姓名:" + stu.getName());
                System.out.println("年龄:" + stu.getAge());
                System.out.println("生日:" + stu.getBirthday());
                return;
            }
        }
        System.out.println("查询失败,请输入正确学号");
    }

    /**
     * 添加学生信息
     */
    private static void addStuInfo(ArrayList<Student> stuList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要添加的学生信息:");

        System.out.println("学号:");
        String id = sc.next();
        // 检查添加的学号是否重复
        for (int i = 0; i < stuList.size(); i++) {
            if (stuList.get(i).getId().equals(id)) {
                System.out.println("输入的学号重复,请重新输入");
                return;
            }
        }

        System.out.println("姓名:");
        String name = sc.next();
        System.out.println("年龄:");
        int age = sc.nextInt();
        System.out.println("生日:");
        String birthday = sc.next();

        stuList.add(new Student(id, name, age, birthday));
        System.out.println("添加成功!");
    }
}
