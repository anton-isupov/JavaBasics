package com.netcracker.twoarrays;

import java.util.Random;

public class C {


    public static void main(String[] args) {
        Random random = new Random();

        int n = 5;
        int m = 8;
        int b = 10;
        int a = -10;

        int array[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) ((random.nextDouble() * (b - a) + a));
            }
        }

        int maxMult = 1;
        int currentMult = 1;

        for (int i = 0; i < m; i++) {
            currentMult = 1;
            for (int j = 0; j < n; j++) {
                currentMult *= Math.abs(array[i][j]);
            }
            if (currentMult > maxMult) maxMult = currentMult;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("max multiply = " + maxMult);
    }
}
