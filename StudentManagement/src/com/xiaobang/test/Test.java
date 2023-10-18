package com.xiaobang.test;

import com.xiaobang.domain.Student;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Student stu1 = new Student("001", "John", 18, "2005-05-17");
        Student stu2 = new Student("002", "Mike", 20, "2003-06-17");
        Student stu3 = new Student("003", "Lily", 19, "2004-03-17");

        ArrayList<Student> stuList = new ArrayList<>();

        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);

        Scanner sc = new Scanner(System.in);
        // 菜单
        lo:
        while (true) {
            System.out.println("----------欢迎使用学生信息管理系统----------");
            System.out.println("1.添加学生信息");
            System.out.println("2.删除学生信息");
            System.out.println("3.修改学生信息");
            System.out.println("4.查询学生信息");
            System.out.println("5.查看所有学生信息");
            System.out.println("6.退出");
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
                    modifyStuInfo(stuList);
                    break;
                case 4:
                    queryStuInfo(stuList);
                    break;
                case 5:
                    showAllStuInfo(stuList);
                    break;
                case 6:
                    System.out.println("已退出,感谢您的使用,再见!");
                    break lo;
                default:
                    System.out.println("您的输入有误,请重新输入");
                    break;
            }
        }

    }

    /**
     *展示所有学生信息
     */
    private static void showAllStuInfo(ArrayList<Student> stuList) {
        if (listIsEmputy(stuList)) return;

        System.out.println("学号\t\t姓名\t\t年龄\t生日");
        for (int i = 0; i < stuList.size(); i++) {
            Student stu = stuList.get(i);
            System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
        }
    }

    /**
     * 修改学生信息
     */
    private static void modifyStuInfo(ArrayList<Student> stuList) {
        // 检查集合是否为空
        if (listIsEmputy(stuList)) return;

        System.out.println("请输入您要修改的学生学号:");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        // 根据用户输入返回索引, 判断查询结果
        int index = getIndex(userInput, stuList);
        if (index == -1) {
            System.out.println("修改失败,请输入正确学号");
        } else{
            Student student = stuList.get(index);
            System.out.println("请输入您要修改的内容");
            System.out.println("姓名:");
            String newName = sc.next();
            student.setName(newName);

            System.out.println("年龄:");
            int newAge = sc.nextInt();
            student.setAge(newAge);

            System.out.println("生日");
            String newBirthday = sc.next();
            student.setBirthday(newBirthday);
            System.out.println("修改成功");
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
            // 批量删除集合中的元素时 最好倒序删除
            for (int i = stuList.size() - 1; i >= 0; i--) {
                stuList.remove(i);
            }
            System.out.println("删除成功!");
            return;
        }

        // 判断所输入id对应的对象的索引是否存在
        int index = getIndex(userInput, stuList);
        if (index == -1) {
            // 未查询到id
            System.out.println("删除失败,请输入正确学号");
        } else {
            // 删除对应的对象
            stuList.remove(index);
            System.out.println("删除成功!");
        }
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

        int index = getIndex(userInput, stuList);
        if (index == -1) {
            System.out.println("查询失败,请输入正确学号");
        } else {
            Student stu = stuList.get(index);
            System.out.println("学号:" + stu.getId());
            System.out.println("姓名:" + stu.getName());
            System.out.println("年龄:" + stu.getAge());
            System.out.println("生日:" + stu.getBirthday());
        }
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
        int index = getIndex(id, stuList);
        // 返回-1代表id不重复
        if (index == -1) {
            System.out.println("姓名:");
            String name = sc.next();
            System.out.println("年龄:");
            int age = sc.nextInt();
            System.out.println("生日:");
            String birthday = sc.next();

            stuList.add(new Student(id, name, age, birthday));
            System.out.println("添加成功!");
        } else {
            System.out.println("输入的学号重复,请重新输入");
        }
    }

    /**
     * 返回集合对象的id, 与用户输入的id相同的对象在集合中的索引
     */
    private static int getIndex(String id, ArrayList<Student> stuList) {
        for (int i = 0; i < stuList.size(); i++) {
            if (stuList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
