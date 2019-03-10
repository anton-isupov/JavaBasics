package com.netcracker.figures;

public class Triangle {

    public static void main(String[] args) {
        int size = 5;

        for (int j = 0; j < size; j++) {
            for (int i = j; i < size; i++) {
                System.out.print(" # ");
            }
            System.out.println("\n");
        }

        for (int j = size; j >= 0; j--) {
            for (int i = j; i < size; i++) {
                System.out.print(" # ");
            }
            System.out.println("\n");
        }

        for (int j = size ; j >= 0; j--) {
            for (int i = 0; i < j ; i++) {
                System.out.print("   ");
            }
            for (int i = j; i < size; i++) {
                System.out.print(" # ");
            }
            System.out.println("\n");
        }


    }
}
