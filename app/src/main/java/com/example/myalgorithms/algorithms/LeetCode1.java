package com.example.myalgorithms.algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(Arrays.toString(sum(nums,9)));
        System.out.println(Arrays.toString(sumTraversal(nums,9)));
    }

    /**
     * 两数之和 暴力递归 O（n²）
     * @param arrays
     * @param target
     * @return
     */
    private static int[] sumTraversal(int[] arrays,int target){
        int[] sums = new int[2];

        for (int i = 0; i < arrays.length; i++) {
            for (int i1 = i+1; i1 < arrays.length; i1++) {
                if (arrays[i]+arrays[i1] == target){
                    sums[0]=  i;
                    sums[1] = i1;
                    return sums;
                }
            }
        }

        return sums;
    }

    /**
     * 两数之和 哈希求值法 O(N)
     * @param arrays
     * @param target
     * @return
     */
    private static int[] sum(int[] arrays, int target) {
        int[] sums = new int[2];
        HashMap<Integer,Integer> hashMap  = new HashMap<>();
        for (int i = 0; i < arrays.length; i++) {
            if (hashMap.containsKey(target - arrays[i])){
                sums[0] = i ;
                sums[1] = hashMap.get(target-arrays[i]);
                return sums;
            }
            hashMap.put(arrays[i],i);
        }
        return sums;
    }

}
