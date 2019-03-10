package com.netcracker.twoarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class D {


    public static void main(String[] args) {
        Random random = new Random();

        int n = 7;
        int m = 10;
        int b = 10;
        int a = -10;

        int array[][] = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(100);
            }

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < m; i++) {
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = array[i][j];
            }
            Arrays.sort(arr);
            for (int j = 0; j < n; j++) {
                array[i][j] = arr[j];
            }
        }

        System.out.println("Sorting array: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
