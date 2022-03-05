package com.example.myalgorithms.bilibili_tuling;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * 给的定一个整数数组 numbers , 从数组中找出两个数满足相加之和等于目标数target
 * 假设每个输入只对应唯一的答案，而且不可以重复使用相同元素。
 * 返回两数的下标值，以数组的形式
 */
public class P11_两数之和_无序数组 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(twoAdd(arr, 9)));
    }

    private static int[] twoAdd(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] targetArr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(target - arr[i])) {
                map.put(arr[i], i);
            } else {
                targetArr[0] = i;
                targetArr[1] = map.get(target-arr[i]);
            }
        }
        return targetArr;

    }

    /**
     * 暴力破解法
     * @param arr
     * @param target
     * @return
     */
    private static int[] twoAdd2(int[] arr,int target){
        for(int i = 0;i< arr.length;i++){
            for(int j =i+1;j<arr.length;i++){
                if (arr[i]+arr[j] ==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }






}
