package com.netcracker.twoarrays;

import java.util.Random;

public class A {

    public static void main(String[] args) {

        Random random = new Random();

        int n = 8;
        int array[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(98) + 1;
            }
        }

        int sumMain = 0, sumInc = 0;
        double multMain = 1, multInc = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( i == j) {
                    sumMain += array[i][j];
                    multMain *= array[i][j];
                }
                if (i == n - j) {
                    sumInc += array[i][j];
                    multInc *= array[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum main = " + sumMain);
        System.out.println("Multiply main = " + multMain);

        System.out.println("Sum inc = " + sumInc);
        System.out.println("Multiply inc = " + multInc);
    }
}
