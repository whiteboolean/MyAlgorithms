package com.example.myalgorithms.bilibili_godzuo;

import java.util.Arrays;

/**
 * 插入排序 ， 空间复杂度 O(1)
 * 时间复杂度 0(N²)
 * <p>
 * 选择排序和冒泡排序 和数据状况无关
 * <p>
 * 插入排序和数据状况有关系，时间复杂度从O(N) ~ O(N²)
 * 时间复杂度： 按照最差情况下的算法表现
 * 按照最差情况来估计
 * TODO O() 最差情况下的数据算法表现 ***
 * θ() 平均状况下的数据算法表现
 * Ω() 最优情况下的数据算法表现
 */
public class P2_插入排序_细节以及时间复杂度 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 3, 5, 9, 8, 4};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        //0 - 0 有序
        //0 - i 想有序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];

    }



}
