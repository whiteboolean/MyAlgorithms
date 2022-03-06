package com.example.myalgorithms.algorithms;

import java.util.Arrays;

/**
 * 排序： 就是将一组对象按照某种逻辑顺序重新排列的过程。比如，订单按照日期排序的这种排序
 * 很可能使用了某种排序算法。
 * <p>
 * 十大排序算法：
 * 1.冒泡排序
 * 2.选择排序
 * 3.插入排序
 * 4.归并排序
 * 5.堆排序
 * 6.快速排序
 * 7.希尔排序
 * 8.计数排序
 * 9.计数排序
 * 10.桶排序
 */
public class Sort {

    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 2, 9};

        System.out.println(101 & 11232);
//
//        printArr(arr);
//        bubbleSort1(arr);
////        bubbleSort2(arr);
////        insertionSort(arr);
//        System.out.println();
//        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    /**
     * 冒泡排序 --- 升序
     */
    private static void bubbleSort1(int[] arr) {
        if (arr == null || arr.length < 2) return;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }


    /**
     * 冒泡排序 方式2
     */
//    private static void bubbleSort2(int[] arr) {
//        if (arr == null || arr.length < 2) return;
//        for (int e = arr.length - 1; e > 0; e--) {
//            for (int i = 0; i < e; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    arr[i] = arr[i] ^ arr[i + 1];
//                    arr[i + 1] = arr[i] ^ arr[i + 1];
//                    arr[i] = arr[i] ^ arr[i + 1];
//                }
//            }
//        }
//    }


    private static void 异或运算() {
        /**
         * a ^ b
         * 相同为0
         * 不同为1
         *
         * 无进位相加
         *  1 1 0 1 0
         *  1 0 1 0 1
         *  ----------
         *  0 1 1 1 1
         *
         * 1) 0 ^ N = N ,N ^ N = 0
         * 2) 交换律和结合律  a^b = b^a  a^b^c = a^(b^c)
         * 3)
         *
         * 三步换值
         * int a = 12
         * int b = 12
         * a = a^b;
         * b = a^b;
         * a = a^b;
         */
    }

    /**
     * 插入排序 时间复杂度和数据有关系
     * @param arr
     */
    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        //0 ~ 0  有序的
        //0 ~ i  想有序的
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }

        String a = "123";
        StringBuilder  a1 = new StringBuilder("123");
        a1.reverse();

    }


    public static  void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[i + 1];
        arr[i + 1] = arr[i] ^ arr[i + 1];
        arr[i] = arr[i] ^ arr[i + 1];
    }







}
