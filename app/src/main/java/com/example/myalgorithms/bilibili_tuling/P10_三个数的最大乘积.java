package com.example.myalgorithms.bilibili_tuling;

import java.util.Arrays;

/**
 * 整形数组nums ，在数组中找出由三个数字组成的最大的乘积，并输出这个乘积
 * <p>
 * 乘积不会越界
 * 重点考察：线性扫描
 */
public class P10_三个数的最大乘积 {

    public static void main(String[] args) {
        System.out.println(sort(new int[]{1, 2, 3, 4, 5, 6}));
    }


    /**
     * 基于排序算法
     *
     * @param nums
     * @return
     */
    private static int sort(int[] nums) {
        Arrays.sort(nums); // N*LogN , 从小到大排序

        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1],
                nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }


    /**
     * 线性扫描
     *
     * @param nums
     * @return
     */
    public static int getMaxMin(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int x : nums) {
            if (x < min1) {
                min2 = min1;//原来最小的变成第二小的
                min1 = x; //最小的变成x
            } else if (x < min2) {
                min2 = x;
            }

            if (x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max3 = max2;
                max2 = x;
            } else if (x > max3) {
                max3 = x;
            }
        }

        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
