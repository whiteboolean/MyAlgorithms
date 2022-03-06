package com.example.myalgorithms.bilibili_godzuo;

import java.util.Arrays;

/**
 * Online  judge ： OJ
 * <p>
 * 随机样本产生器 ， 结果比对
 */
public class P4_对数器 {


    /**
     * for test
     */
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    // for test
    public static void main(String[] args) {


        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        //4、把方法a和方法b比对很多次来验证方法a是否正确
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            P2_插入排序_细节以及时间复杂度.insertSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        P2_插入排序_细节以及时间复杂度.insertSort(arr);
        printArray(arr);
    }


    //for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        //Math.random() - > [0,1) 所有小数等概率返回一个
        //Math.random() * N -> [0,N)  所有小数，等概率返回一个
        //(int)(Math.random() * N ) -> [0,N-1]所有的整数，等概率返回一个
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    //for test
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    //for test
    public static int[] copyArray(int[] arr) {
        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        return arrCopy;
    }


    //3、实现比对的方法
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}
