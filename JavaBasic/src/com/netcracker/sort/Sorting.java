package com.netcracker.sort;

import java.util.Arrays;
import java.util.Random;

public class Sorting {


    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        long sys = System.nanoTime();
        Arrays.sort(array);
        sys = System.nanoTime() - sys;

        System.out.println(" Arrays.sort() time: " + sys);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.print("\n");

        sys = System.nanoTime();
        for (int j = array.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    int c = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = c;
                }
            }
        }

        sys = System.nanoTime() - sys;
        System.out.println("Bubble sort time: " + sys);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }


        System.out.print("\n");

        sys = System.nanoTime();
        for (int min = 0; min < array.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int tmp = array[min];
            array[min] = array[least];
            array[least] = tmp;
        }

        sys = System.nanoTime() - sys;
        System.out.println("Selection sort time: " + sys);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }


}
