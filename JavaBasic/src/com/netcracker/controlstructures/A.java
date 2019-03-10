package com.netcracker.controlstructures;

import java.util.Arrays;
import java.util.Random;

public class A {

    enum Day{
        MONDAY,
        THUESDAY,
        WEDNESDAY,
        THUERSDAY,
        FRIDAY
    }

    public static void main(String[] args) {

        Random random = new Random();

        Day day = Day.FRIDAY;

        long sys = System.nanoTime();
        switch(day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case THUESDAY:
                System.out.println("Thuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THUERSDAY:
                System.out.println("Thuersday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
        }

        sys = System.nanoTime() - sys;
        System.out.println(" switch-case = " + sys);

        sys = System.nanoTime();

        if (day == Day.MONDAY) System.out.println("Monday");
            else if(day == Day.THUESDAY) System.out.println("Thuesday");
                else if (day == Day.WEDNESDAY) System.out.println("Wednesday");
                    else if(day == Day.THUERSDAY) System.out.println("Thuersday");
                        else if (day == Day.FRIDAY) System.out.println("Friday");

        sys = System.nanoTime() - sys;
        System.out.println(" if-else = " + sys);
        System.out.println();

        int n = 50;
        int[] array = new int[n];

        for (int j = 0; j < n; j++) {
            array[j] = random.nextInt(10);
        }

        int val0 = 0;
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;
        int val4 = 0;
        int val5 = 0;
        int val6 = 0;
        int val7 = 0;
        int val8 = 0;
        int val9 = 0;
        int val10 = 0;

        sys = System.nanoTime();
        for (int i = 0; i < n; i++) {
            switch (array[i]) {
                case 0:
                    val0++;
                    break;
                case 1:
                    val1++;
                    break;
                case 2:
                    val2++;
                    break;
                case 3:
                    val3++;
                    break;
                case 4:
                    val4++;
                    break;
                case 5:
                    val5++;
                    break;
                case 6:
                    val6++;
                    break;
                case 7:
                    val7++;
                    break;
                case 8:
                    val8++;
                    break;
                case 9:
                    val9++;
                    break;
                case 10:
                    val10++;
                    break;
            }
        }


        sys = System.nanoTime() - sys;
        System.out.println(" switch-case = " + sys);

           val0 = 0;
           val1 = 0;
           val2 = 0;
           val3 = 0;
           val4 = 0;
           val5 = 0;
           val6 = 0;
           val7 = 0;
           val8 = 0;
           val9 = 0;
           val10 = 0;

            sys = System.nanoTime();
        for (int i = 0; i < n; i++) {

            if (array[i] == 0) val0++;
            else if (array[i] == 1) val1++;
            else if (array[i] == 2) val2++;
            else if (array[i] == 3) val3++;
            else if (array[i] == 4) val4++;
            else if (array[i] == 5) val5++;
            else if (array[i] == 6) val6++;
            else if (array[i] == 7) val7++;
            else if (array[i] == 8) val8++;
            else if (array[i] == 9) val9++;
            else if (array[i] == 10) val10++;

        }

        sys = System.nanoTime() - sys;
        System.out.println(" if-else = " + sys);

        System.out.println(val0);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);
        System.out.println(val8);
        System.out.println(val9);
        System.out.println(val10);
    }
}
