package com.xiaobang.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        int[] scores = initData();
        double avgScore = scoring1(scores);
        System.out.println("选手平均分为:" + avgScore);

        double avg = scoring2(scores);
        System.out.println("选手平均分为:" + avg);

    }

    // 初始化打分数据
    private static int[] initData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入评委人数:");
        int count = sc.nextInt();
        int[] scores = new int[count];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("(评委" + (i + 1) + ")" + "请输入选手分数:");
            int score = sc.nextInt();
            // 判断成绩是否正确
            if (score >= 0 && score <= 100) {
                scores[i] = score;
            } else {
                System.out.println("您的输入有误, 请输入0~100之间的分数");
                i--;
            }
        }
        return scores;
    }

    /*
        需求:
            在编程竞赛中,有6个评委为参赛的选手打分(键盘录入),分数为0-100的整数分.
            选手的最后得分为:去掉一个最高分和一个最低分后的4个评委平均值
     */

    // 方法1 : 先找出最值再求和求平均
    public static double scoring1(int[] scores) {
        // 找出最大值和最小值
        int indexMax = findIndexMax(scores);
        int indexMin = findIndexMin(scores);

        // 计算分数和
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i != indexMax && i != indexMin) {
                sum += scores[i];
            }
        }
        // 返回平均值
        return sum / (scores.length - 2);

    }

    // 方法2 : 先求和 再减去最值后求平均
    public static double scoring2(int[] scores) {
        // 求和
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        // 求最值
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        // 求平均
        double avg = (sum - max - min) / (scores.length - 2.0);

        return avg;
    }

    private static int findIndexMax(int[] arr) {
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    private static int findIndexMin(int[] arr) {
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

}
