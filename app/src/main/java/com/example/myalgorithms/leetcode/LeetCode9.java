package com.example.myalgorithms.leetcode;

/**
 *
 * 判断一个树是否是回文数
 *
 */
public class LeetCode9 {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(1000021);
        System.out.println(palindrome);

    }

    public static boolean isPalindrome(int x) {
//        boolean isPalindrome = false;
//        if (x < 0) {
//            return false;
//        }else if (x>0 && x<10){
//            return true;
//        }
//        String newX = String.valueOf(x);
//        for (int i = 0; i < newX.length(); i++) {
//            int last = newX.length() - i-1;
//            char c = newX.charAt(i);
//            char c1 = newX.charAt(last);
//            if (i < last && c1 != 0) {
//                isPalindrome = String.valueOf(c).equals(String.valueOf(c1));
//                if (!isPalindrome) return false;
//            }
//        }
//        return isPalindrome;


        //利用StringBuilder的性质
//        StringBuffer sb = new StringBuffer( x + "");
//        sb.reverse();
//        return sb.toString().equals(x + "");


        //todo 待研究
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }
}
