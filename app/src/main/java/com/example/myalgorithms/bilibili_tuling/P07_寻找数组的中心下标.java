package com.example.myalgorithms.bilibili_tuling;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;

/**
 * 寻找数组的中心下标
 *
 * 给定一个整数数组 nums,请编写一个能够返回数组"中心下标"的方法。
 * 中心下标是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果数组不存在中心下标，返回-1.如果数组有多个中心下标，应该返回最靠近左边的那一个。
 * 注意：中心下标可能出现在数组的两端。
 */
public class P07_寻找数组的中心下标 {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 2, 2,3,2, 2, 1, 1};
        System.out.println(returnMid2(arr));
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public static int returnMid(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (total == sum) {
                return i;
            }
            sum -= arr[i];
        }
        return -1;
    }

    /**
     * [ 1,2,3,3,4,1]
     * @param arr
     * @return
     */
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static int returnMid2(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (total * 2 + arr[i+1] == sum) {
                return i+1;
            }

        }
        return -1;
    }
}
