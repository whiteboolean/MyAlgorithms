package com.example.myalgorithms.bilibili_tuling;

import android.graphics.drawable.Icon;

/**
 * 排列硬币
 * 总共有n枚硬币，将他们排成一个阶梯的形状，第k行就必须正好有k枚硬币。
 * 给定一个数字n ， 找出可形成完整阶梯行的总行数
 * n是一个非负整数，并且在32位有符号整型的范围内
 */
public class P14_排列硬币 {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(100600));
        System.out.println(arrangeCoins2(100600));
        System.out.println(Double.valueOf(arrangeCoins3(100600)).intValue());
    }


    /**
     * 迭代 ， 暴力解法
     *
     * @param n
     * @return
     */
    private static int arrangeCoins(int n) {
        int i = 1;
        long sum = 1;
        while (sum <= n) {
            if (sum == n) return i;
            i++;
            sum += i;
        }
        return i - 1;
    }

    /**
     * 二分法 LogN
     *
     * @param n
     * @return
     */
    private static long arrangeCoins2(int n) {
        long low = 1, high = n;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long cost = ((mid + 1) * mid) / 2;
            if (cost == n) {
                return mid;
            } else if (cost > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;

    }


    /**
     * 递归 ,newton迭代
     *
     * @param n
     * @return
     */
    private static double arrangeCoins3(int n) {
        if (n == 0) {
            return 0;
        }
        return sqrt(n, n);
    }

    /**
     *
     * （x² + x )/2 = n
     *  x = sqrt (2n - x )
     *
     * @param x
     * @param n
     * @return
     */
    private static double sqrt(double x, int n) {
        double res = (x + (2 * n - x) / x) / 2;
        if (res == x) {
            return x;
        } else {
            return sqrt(res, n);
        }
    }


}
