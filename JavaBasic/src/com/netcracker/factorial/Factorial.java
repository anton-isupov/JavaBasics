package com.netcracker.factorial;

public class Factorial {

    public static int fact(int n) {
        if (n == 1) return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        long sys = System.nanoTime();
        int f = fact(n);
        sys = System.nanoTime() - sys;
        System.out.println("fact = " + f + " Time = " + sys);

        int factorial = 1;
        sys = System.nanoTime();
        for (int i = 1; i <= n; i++) {
            factorial*=i;
        }
        sys = System.nanoTime() - sys;
        System.out.println("for = " + factorial + " Time = " + sys);
    }
}
