package com.example.myalgorithms.bilibili_tuling;

import java.util.Arrays;

/**
 * 三角形的最大周长
 * <p>
 * 给定由一些整数（代表长度）组成的数组arr，返回由其中三个长度组成的、面积不为零的三角形的
 * 最大周长。
 * 如果不能形成任何面积的不为零的三角形，返回`0`;
 * <p>
 * 贪心算法 --- 三角形的最大周长
 */
public class P22_三角形的最大周长 {

    public static void main(String[] args) {
        System.out.println();
    }

    public static int largestPerimeter(int[] a) {
        Arrays.sort(a);
        for (int i = a.length-1; i >= 2; i--) {
            if (a[i - 1] + a[i - 2] > a[i]) {
                return a[i - 1] + a[i - 2] + a[i];
            }
        }
        return 0;
    }
}
