package com.netcracker.twoarrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class B {


    public static void main(String[] args) {
        Random random = new Random();

        int n = 5;
        int m = 8;
        int b = 99;
        int a = -99;

        int array[][] = new int[m][n];
        int max = array[0][0];
        int index1 = 0, index2 = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) ((random.nextDouble() * (b - a) + a));
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    index1 = i;
                    index2 = j;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("max element = "+ max + ", i = " + index1 + ", j = " + index2);
    }
}
