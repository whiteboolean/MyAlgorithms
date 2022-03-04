package com.example.myalgorithms.bilibili_tuling;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;

public class P07_寻找数组的中心下标 {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 2, 2,3,2, 2, 1, 1};
        System.out.println(returnMid2(arr));
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public static int returnMid(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (total == sum) {
                return i;
            }
            sum -= arr[i];
        }
        return -1;
    }

    /**
     * [ 1,2,3,3,4,1]
     * @param arr
     * @return
     */
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static int returnMid2(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (total * 2 + arr[i+1] == sum) {
                return i+1;
            }

        }
        return -1;
    }
}
