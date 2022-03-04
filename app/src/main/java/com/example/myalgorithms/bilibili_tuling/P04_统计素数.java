package com.example.myalgorithms.bilibili_tuling;

public class P04_统计素数 {

    public static void main(String[] args) {
        int i = primeNum(100);
        System.out.println(i);
    }

    private static int primeNum(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if ((n % i) == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


}
