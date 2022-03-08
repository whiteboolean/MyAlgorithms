package com.example.myalgorithms.bilibili_tuling_practice;

public class P04_统计素数 {

    public static void main(String[] args) {
        int i = primeNum(100);
        System.out.println(i);
    }


    public static int primeNum(int n){
        int num = 0 ;
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            for (int i1 = 2; i1 <= Math.sqrt(i); i1++) {
                if (i % i1 == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                num++;
            }
            isPrime = true;
        }
        return num;
    }



}
