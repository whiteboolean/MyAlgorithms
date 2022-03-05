package com.example.myalgorithms.bilibili_tuling;


import java.util.Arrays;

/**
 * 无序数组
 */
public class P12_两数之和_有序数组 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(twoSearch2(arr, 5)));

    }

    private static int[] twoSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int low = i, high = numbers.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i, mid};
                } else if (numbers[mid] > target - numbers[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{0};
    }


    /**
     * 双指针 ， 两个指针 分别从左开始， 一个从右开始
     *
     * @param numbers
     * @param target
     * @return
     */
    private static int[] twoSearch2(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l <= r) {
            int sum = numbers[l] + numbers[r];
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                return new int[]{l, r};
            }
        }

        return new int[]{0};
    }
}
