package com.example.myalgorithms.bilibili_tuling_practice;


/**
 * 删除排序数组中的重复项
 * 一个有序数组nums，原地删除重复出现的元素，使每个元素只出现一次，返回删除后数组的新长度
 * <p>
 * 不能使用额外的数组空间，必须在原地修改输入数组并在使用O(1)额外空间的条件下完成
 * <p>
 * 例如 ： 输入 [0,1,2,2,3,3,4]
 * 输出： 5
 * 重点考察 ： 双指针算法：
 * <p>
 * 前提： 有数组int[] arr = new int[];
 * 1.定义慢指针slow，初始值等于0
 * 2.定义快指针fast,初始值等于1
 * 3.遍历数组，当arr[fast]!=arr[slow] ,记录位置，这个时候的数据是有用的，slow++
 * 4.返回慢指针的长度 + 1
 */
public class P06_删除数组重复项 {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }


}
