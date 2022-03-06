package com.example.myalgorithms.bilibili_godzuo;

import java.util.Arrays;

/**
 * 最简单的冒泡排序
 */
public class P1_冒泡排序 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 7, 3, 5, 9, 8, 4};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    private static int[] bubbleSort(int[] arr) {

        if (arr == null || arr.length == 0) return null;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int i1 = 0; i1 < arr.length - 1 - i; i1++) {
                if (arr[i1] > arr[i1 + 1]) {
                    int t = arr[i1];
                    arr[i1] = arr[i1 + 1];
                    arr[i1 + 1] = t;
                }
            }
        }
        return arr;
    }
}
