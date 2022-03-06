package com.example.myalgorithms.bilibili_godzuo;

import java.util.Arrays;

/**
 * Log2N
 * 1.在一个有序数组中查找某个数是否存在
 * 2.在一个有序数组中，找到>=某个数最左侧的位置
 * 3.局部最小值
 */
public class P3_二分法 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 3, 5, 9, 8, 4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(isIn(arr, 7));
    }


    private static int isIn(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int mid;
        while (l <= r) {
             mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
