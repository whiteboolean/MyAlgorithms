package com.example.myalgorithms.nk;

import java.util.HashMap;

public class JZ3 {

    public static void main(String[] args) {

    }

    public int duplicate (int[] numbers) {
        // write code here
        int target = 0 ;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsValue(numbers[i])){
                target = numbers[i];
                return target;
            }else{
                hashMap.put(i,numbers[i]);
            }
        }

        return  target ;
    }

    public int duplicate1 (int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != i){
                if (numbers[i] == numbers[numbers[i]]) return numbers[i];
                int temp = numbers[numbers[i]];
                numbers[numbers[i]] = numbers[i];
                numbers[i] = temp;
                i--;//遍历完0位元素以及交换完数字后，如果0位元素仍不符合数组存放原则：numbers[i] = i，那么还要重新遍历0位元素
            }
        }
        return -1;
    }
}
