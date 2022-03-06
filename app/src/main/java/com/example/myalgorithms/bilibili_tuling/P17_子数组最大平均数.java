package com.example.myalgorithms.bilibili_tuling;

/**
 * 子数组最大平均数
 * <p>
 * 给一个整数数组，找出平均数最大且长度为K的下标连续的子数组，并输出该最大平均数
 * <p>
 * 输入： [1,12,-5,-6,50,3] , k = 3
 * 输出： 12.75
 * 最大平均数 （12-5-6+50——/4 = 51//4 = 12.75
 * <p>
 * TODO 滑动窗口 ， 双指针算法的一个特例
 */
public class P17_子数组最大平均数 {

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        //先统计第一个窗口的和
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(sum, max);
        }
            return 1.0 * max / k;
    }

}
