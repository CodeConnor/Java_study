package com.xiaobang.test;

public class ArrayTest {
    public static void main(String[] args) {
        int evenSum = evenSum();
        System.out.println("偶数和:" + evenSum);

        int[] arr1 = {3, 44, 33, 55, 22};
        int max = getMax(arr1);
        System.out.println("最大值:" + max);

        int[] grade = {100, 50, 20, 90, 90};
        int max1 = getMax(grade);
        System.out.println("最高分:" + max1);

        int min = getMin(grade);
        System.out.println("最低分:" + min);

        int sum = getSum(grade);
        System.out.println("总成绩:" + sum);

        double  avg = getAvg(grade);
        System.out.println("平均值:" + avg);

        int count = getCount(grade);
        System.out.println("低于平均值的个数:" + count);


    }

    /*
        需求 : 已知数组元素为{11,22,33,44,55}
        请将数组中偶数元素取出并求和,最后打印求和结果
     */
    public static int evenSum() {
        // 定义数组
        int[] arr1 = {11, 22, 33, 44, 55};
        // 定义变量存储偶数和
        int sum = 0;
        // 遍历数组
        for (int i = 0; i < arr1.length; i++) {
            // 判断偶数并求和
            if (arr1[i] % 2 == 0) {
                sum += arr1[i];
            }
        }
        // 返回结果
        return sum;
    }

    /*
        需求 :
        请找出任意整数数组中最大值并打印在控制台
     */
    public static int getMax(int[] arr) {
        // 将数组第一个元素赋值给max, 假设第一个元素是最大值
        int max = arr[0];
        // 从第二个元素开始依次与max比较
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }


    /*
        需求:
            已知班级学生成绩为int[] arr = {100,50,20,90,90};
            可分别用方法逐个实现该功能
            1.找出数组最大值,并打印在控制台
            2.找出数组最小值,并打印在控制台
            3.求总成绩,并打印在控制台
            4.计算出平均值,并打印在控制台
            5.统计出低于平均值元素的个数
     */
    public static int[] getGrade(int[] arr) {
        // 定义变量存放成绩
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int avg = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            // 求最大值
            if (max < arr[i]) {
                max = arr[i];
            }

            // 求最小值
            if ( min > arr[i]) {
                 min = arr[i];
            }

            // 求平均值
            sum += arr[i];
        }

        // 求平均成绩
        avg = sum / arr.length;

        // 求低于平均值的个数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }

        // 定义数组存放所有结果
        int[] result = {max, min, sum, avg, count};
        return result;

    }

    /**
     * 求数组最小值
     */
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 求数组和
     */
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 求数组元素平均值
     */
    public static double getAvg(int[] arr){
        int sum = getSum(arr);
        // 注意:必须乘以1.0将整数转换为小数, 否则两个整数相除结果还是整数
        double avg = (sum * 1.0) / arr.length;
        return avg;
    }

    /**
     * 统计数组中元素低于平均值的个数
     */
    public static int getCount(int[] arr){
        double avg = getAvg(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        return count;
    }


}
