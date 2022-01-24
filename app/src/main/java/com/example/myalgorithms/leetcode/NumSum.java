package com.example.myalgorithms.leetcode;

import java.sql.SQLOutput;
import java.util.Arrays;

public class NumSum {

    public static void main(String[] args) {

        int[] array = {2, 7,2, 11, 15};
        int target = 4;
        System.out.println("原始数组:" + Arrays.toString(array));
        System.out.println("target:" + target);
        int[] newArray = twoSum(array, target);
        System.out.println("新数组:" + Arrays.toString(newArray));
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        // 双重循环 循环极限为(n^2-n)/2
        for(int i = 0; i < nums.length; i++){
            for(int j = nums.length - 1; j > i; j --){
                if(nums[i]+nums[j] == target){
                    indexs[0] = i;
                    indexs[1] = j;
                    return indexs;
                }
            }
        }

        //2,7,11,15
        //1. 2,7 9
        //2. 2,11 13
        //
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    indexs[0] = i;
//                    indexs[1] = j;
//                    return indexs;
//                }
//            }
//        }

        return indexs;
    }
}
