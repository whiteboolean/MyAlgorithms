package com.example.myalgorithms.algorithms;

import java.util.HashMap;

/**
 * 二分查找 - 折半查找：
 * <p>
 * 前提： 数据已经有序排列在数组中，通过将待查找的元素与数组最中间元素进行比较，如果大于
 * 中间值，则目标可能存在于右半部分，否则可能在组半部分，查到为止。
 *
 * 有序数组中，找某个数是否存在 O(log2N)
 */
public class 二分法 {

    private int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 8;

        int i = biSearch(arr, 45);
        System.out.println(i);


    }


    public static int biSearch(int[] arr, int a) {
        int start = 0;
        int end = arr.length - 1;

        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] < a) {
                start = mid + 1;
            } else if (arr[mid] > a) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1; //找不到
    }

    public static int biSearch2(int[] arr, int a) {
        int start = 0 ;
        int end = arr.length-1;
        int mid ;
        while (start<=end){
            mid = (start + end)/2;
            if (arr[mid]<a){
                start = mid+1;
            } else if (arr[end]>a){
                end = mid - 1;
            } else{
                return mid;
            }
        }
        return -1; //找不到
    }



}
