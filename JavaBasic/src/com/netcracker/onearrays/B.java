package com.netcracker.onearrays;

import java.util.Random;

public class B {


    public static void main(String[] args) {

        Random random = new Random();

        int n = 20;
        int[] array = new int[n];

        int odd = 0, even = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            if (array[i] % 2 == 0 && array[i] != 0) even++;
            if (array[i] % 2 != 0 && array[i] != 0) odd++;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Odd = " + odd);
        System.out.println("Even = " + even);
    }
}
