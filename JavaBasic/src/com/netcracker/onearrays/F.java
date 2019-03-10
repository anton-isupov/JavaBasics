package com.netcracker.onearrays;

import java.util.Random;

public class F {


    public static void main(String[] args) {
        Random random = new Random();

        int n = 15;
        double[] array = new double[n];
        int b = 1;
        int a = -1;
        int max1 = 0, max0 = 0, maxNo1 = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = ((random.nextDouble() * (b - a) + a));
            if (array[i] <= -0.5 ) {
                array[i] = -1;
                maxNo1++;
            }
            if (array[i] >= 0.5 ) {
                array[i] = 1;
                max1++;
            }
            if (array[i] >= -0.5 && array[i] <= 0.5) {
                array[i] = 0;
                max0++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        if (max1 > max0 && max1 > maxNo1) System.out.println("1 more ");
        if (max0 > max1 && max0 > maxNo1) System.out.println("0 more ");
        if (max1 > max0 && maxNo1 > max0) System.out.println("-1 more ");
        if (max1 == max0 && max0 == maxNo1) System.out.println("all equals");
        if (max1 == max0) System.out.println("equally 1 and 0");
        if (max0 == maxNo1) System.out.println("equally 0 and -1");
        if (max1 == maxNo1) System.out.println("equally 1 and -1");

    }
}
