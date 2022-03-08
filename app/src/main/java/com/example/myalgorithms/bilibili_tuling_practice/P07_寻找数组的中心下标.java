package com.example.myalgorithms.bilibili_tuling_practice;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;

/**
 * 寻找数组的中心下标
 * <p>
 * 给定一个整数数组 nums,请编写一个能够返回数组"中心下标"的方法。
 * 中心下标是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果数组不存在中心下标，返回-1.如果数组有多个中心下标，应该返回最靠近左边的那一个。
 * 注意：中心下标可能出现在数组的两端。
 */
public class P07_寻找数组的中心下标 {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 2, 3, 2, 2, 1, 1};
        int[] arr1 = new int[]{2,4,2};
        System.out.println(findMidIndex(arr));
        System.out.println(findMidIndex2(arr));
    }


    //方法1
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static int findMidIndex(int[] arr) {
        int total = Arrays.stream(arr).sum();
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
            if (num == total) {
                return i;
            }
            total -= arr[i];
        }
        return -1;
    }

    //方法2
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static int findMidIndex2(int[] arr) {
        int total = Arrays.stream(arr).sum();
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num +=arr[i];
            if (num * 2 + arr[i+1] == total){
                return i+1;
            }
        }
        return -1;
    }


}
