package com.example.myalgorithms.bilibili_tuling_practice;

/**
 * x的平方根
 * 在不使用sqrt(x) 函数的情况下，得到x的平方根的整数部分
 * 重点考察： 二分法，牛顿迭代
 * <p>
 * 经典二分法的妙用
 *
 * 找平方小于某个数的那个值
 */
public class P08_x的平方根_二分查找 {

    public static void main(String[] args) {
//        binarySearch(5);
//        int[] arr = {7,8,9,10,12,20};
//        int index = standardBinarySearch(arr, 8);
//        System.out.println(index);
        System.out.println(Math.sqrt(6));
    }



    /**
     * 标准二分法查找
     * <p>
     * 时间复杂度为O(log^n)
     */
    public static int standardBinarySearch(int[] arr, int value) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int midVal = arr[mid];
            if (value == midVal) {
                return mid;
            } else if (value > midVal) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1; //没有找到返回 -1
    }

    /**
     * 二分查找
     */
    public static int binarySearch(int x) {
        int index = -1;
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (Math.pow(mid, 2) <= x) {
                index = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }


}
