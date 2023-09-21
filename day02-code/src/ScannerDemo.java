//  使用方法: 1. 先导包
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        //  2. 在主方法中创建对象, sc为对象名称, System.in为键盘的输入流
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的姓名:");
        //  3. 实例化对象, 并赋值给变量
        String name = sc.next();

        System.out.println("请输入您的年龄:");
        int age = sc.nextInt();

        System.out.println("请输入您的性别:");
        String gender = sc.next();

        System.out.println("请输入您的身高:");
        double height = sc.nextDouble();

        System.out.println("请输入您是否已婚");
        boolean flag = sc.nextBoolean();

        System.out.println("success");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(height);
        System.out.println(flag);
    }

}
