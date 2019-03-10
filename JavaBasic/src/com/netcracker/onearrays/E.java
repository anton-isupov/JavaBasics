package com.netcracker.onearrays;

import java.util.Random;

public class E {


    public static void main(String[] args) {

        Random random = new Random();

        int n = 10;
        int[] array = new int[n];
        int[] secondArray = new int[n];

        int odd = 0, even = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            secondArray[i] = random.nextInt(10);
        }
        int firstSred = 0, secondSred = 0;
        for (int i = 0; i < array.length; i++) {
            firstSred+=array[i];
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < secondArray.length; i++) {
            secondSred+=secondArray[i];
            System.out.print(secondArray[i] + " ");
        }

        firstSred /= n;
        secondSred/= n;

        System.out.println();

        System.out.println(firstSred);
        System.out.println(secondSred);

        if (firstSred > secondSred) System.out.println("First more");
        if (firstSred < secondSred) System.out.println("Second more");
        if (firstSred == secondSred) System.out.println("Equals");
    }
}
