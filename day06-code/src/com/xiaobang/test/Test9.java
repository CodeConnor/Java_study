package com.xiaobang.test;

import java.util.Random;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        String verificationCode = test8();

        System.out.println("验证码为:" + verificationCode);


    }

    private static String test8() {
    /*
    需求:
        请从26个英文字母(大小写都包含), 以及数字0-9中,
        随机产生一个5位的字符串验证码, 并打印在控制台
        效果:uYq8I, 3r4Zj
    */

        // 创建包含所有英文和数字的验证码字符数组
        char[] chs = new char[26 + 26 + 10];
        int chsIndex = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            chs[chsIndex] = c;
            chsIndex++;
        }

        for (char c = 'A'; c <= 'Z'; c++) {
             chs[chsIndex] = c;
             chsIndex++;
        }

        for (char c = '0'; c <= '9'; c++) {
            chs[chsIndex] = c;
            chsIndex++;
        }

        // 使用随机数抽出5个字符充当验证码
        String verificationCode = "";
        Random r = new Random();

        for (int i = 1; i <= 5; i++) {
            int index = r.nextInt(chs.length);
            verificationCode += chs[index];
        }
        return verificationCode;
    }

    private static double test7() {
    /*
    需求:
        在编程竞赛中,有6个评委为参赛的选手打分(键盘录入),分数为0-100的整数分.
        选手的最后得分为:去掉一个最高分和一个最低分后的4个评委平均值
    */
        int sum = 0;
        int[] arrScores = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入选手分数:");

        // 求和
        for (int i = 1; i <= 6; i++) {
            System.out.println("请输入第" + i + "位评委分数:");
            int score = sc.nextInt();

            // 判断数据的范围
            if (score >= 0 && score <= 100) {
                sum += score;
                arrScores[i - 1] = score;
            } else {
                System.out.println("输入错误, 请输入0~100之间的数字");
                i--;
            }
        }

        // 求最值
        int max = arrScores[0];
        for (int i = 0; i < arrScores.length; i++) {
            if (max < arrScores[i]) {
                max = arrScores[i];
            }
        }

        int min = arrScores[0];
        for (int i = 0; i < arrScores.length; i++) {
            if (min > arrScores[i]) {
                min = arrScores[i];
            }
        }

        // 求平均
        double avg = (sum - max - min) * 1.0 / (arrScores.length - 2);
        return avg;
    }

    private static int[] test6() {
    /*
    需求:
        已知一个数组arr={11,22,33,44,55};
        用程序实现把数组中的元素值交换,
        交换后的数组arr={55,44,33,22,11};
        并在控制台输出交换后的数组元素.
 */
        int[] arr = {11, 22, 33, 44, 55};
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }

    private static int[] test5() {
    /*
    需求:
        设计一个方法,查找元素在数组中的索引位置
        已知一个数组arr={19,28,37,46,50,28,37,37};
        键盘录入一个数据,查找该数据在数组中的索引,考虑元素重复
        并在控制台输出找到的索引值.
        如果没有查找到,则输出-1

   注意: return只能返回一个数据,产生多个结果时使用数组存储结果
 */
        int[] arr = {19, 28, 37, 46, 50, 28, 37, 37};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int inputNum = sc.nextInt();

        // 统计符合条件的元素个数
        int indexCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == inputNum) {
                indexCount++;
            }
        }

        // 没有符合条件的元素就让结果数组的元素为-1
        if (indexCount == 0) {
            int[] results = {-1};
            return results;
        }

        // 找出符合条件的元素 并存入新数组中
        int[] results = new int[indexCount];
        int resultIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == inputNum) {
                results[resultIndex] = i;
                resultIndex++;
            }
        }
        return results;
    }

    private static int test4() {
    /*
    需求:
        设计一个方法,查找元素在数组中的索引位置
        已知一个数组arr={19,28,37,46,50};
        键盘录入一个数据,查找该数据在数组中的索引,不考虑元素重复
        并在控制台输出找到的索引值.
        如果没有查找到,则输出-1
 */
        int[] arr = {19, 28, 37, 46, 50};
        int index = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int inputNum = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (inputNum == arr[i]) {
                index = i;
            }
        }
        return index;
    }

    public static boolean test3(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


    private static int test2() {
    /*
        需求:
            有这样的一个数组,元素是{68,27,95,88,171,996,51,210}
            e求出该数组中满足要求的元素和要求是:
            求和的元素个位和十位都不能是7,并且只能是偶数
    */
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int ge = arr[i] % 10;
            int shi = arr[i] / 10 % 10;
            if (arr[i] % 2 == 0 && ge != 7 && shi != 7) {
                sum += arr[i];
            }
        }
        return sum;
    }

    private static void test1() {
        for (int i = 1; i <= 100; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            if (i % 7 == 0 || ge == 7 || shi == 7) {
                System.out.println(i);
            }
        }
    }
}
