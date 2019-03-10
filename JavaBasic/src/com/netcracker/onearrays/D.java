package com.netcracker.onearrays;

import java.util.Random;

public class D {


    public static void main(String[] args) {
        Random random = new Random();

        int n = 15;
        int[] array = new int[n];
        int b = 50;
        int a = -50;
        int max, min;
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((random.nextDouble() * (b - a) + a));
        }

        max = min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] <= min) {
                min = array[i];
                minIndex = i;
            }

            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("min = " + min + ", minIndex = " + minIndex);
        System.out.println("max = " + max + ", maxIndex = " + maxIndex);
    }
}
