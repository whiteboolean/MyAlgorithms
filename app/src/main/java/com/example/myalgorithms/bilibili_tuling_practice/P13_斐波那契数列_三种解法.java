package com.example.myalgorithms.bilibili_tuling_practice;

/**
 * 求取斐波那契数列第N位的值
 * <p>
 * 斐波那契数列： 每一位的值等于他前两位数字之和。前两位固定 0 ，1
 */
public class P13_斐波那契数列_三种解法 {

    public static void main(String[] args) {

        System.out.println(function1(6));
        System.out.println(function(0));

    }

    private static long function1(int n) {
        long[] arr = new long[40];
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[n];
        }
    }

    /**
     * 0 1 1 2 3 5 8 13 21
     *
     * @param n
     * @return
     */
    private static int function(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return function(n - 1) + function(n - 2);
    }
}
