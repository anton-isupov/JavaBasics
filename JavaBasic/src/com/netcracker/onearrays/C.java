package com.netcracker.onearrays;

import java.util.Random;

public class C {


    public static void main(String[] args) {

        Random random = new Random();

        int n = 10;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99) + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length ; i++) {
            if (i % 2 != 0) array[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
