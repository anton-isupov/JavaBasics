package com.netcracker.onearrays;

public class A {


    public static void main(String[] args) {
        int n = 100;
        int arr[] = new int[n/2];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = i * 2 + 1;
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("reverse:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
