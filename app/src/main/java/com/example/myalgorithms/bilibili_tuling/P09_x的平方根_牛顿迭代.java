package com.example.myalgorithms.bilibili_tuling;

public class P09_x的平方根_牛顿迭代 {


    public static void main(String[] args) {
        int i = newton(10);
        System.out.println(i);
    }


    /**
     * 牛顿迭代
     *
     * @param x
     * @return
     */
    private static int newton(int x) {
        if (x == 0) return 0;
        return (int) sqrt(x, x);
    }


    /**
     * x/n  = n
     * (x/n + n) / 2 更趋近于这个结果
     *
     * @param n
     * @param x
     * @return
     */
    public static double sqrt(double n, int x) {

        double v = (x/n + n) / 2;
        if (v == x) {
            return v;
        } else {
            return sqrt(v, x);
        }


    }

}
