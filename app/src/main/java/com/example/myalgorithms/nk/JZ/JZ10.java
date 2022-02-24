package com.example.myalgorithms.nk.JZ;

import java.util.ArrayList;
import java.util.List;

public class JZ10 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(4));
    }

    public static int Fibonacci(int n) {
       int[] ans = new int[40];
       ans[0] = 0;
       ans[1] = 1;
       for (int i =2;i<=n;i++){
           ans[i] = ans[i-1]+ans[i-2];
       }
       return ans[n];
    }
}
