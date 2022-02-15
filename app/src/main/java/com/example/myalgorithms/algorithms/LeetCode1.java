package com.example.myalgorithms.algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] ints = twoNumSum(array, 8);

        System.out.println(Arrays.toString(ints));

    }

    private static int[] twoNumSum(int[] array, int sum) {
        int[] temp = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(sum - array[i])) {
                temp[0] = i;
                temp[1] = map.get(sum - array[i]);
            }
            map.put(array[i], i);
        }
        return temp;
    }
}
