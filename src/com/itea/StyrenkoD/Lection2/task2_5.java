package com.itea.StyrenkoD.Lection2;

import java.util.Arrays;
import java.util.Random;

public class task2_5 {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        float avg1 =0;
        float avg2 =0;
        Random rand = new Random();

        for (int i=0; i<arr1.length;i++) {
            arr1[i] = rand.nextInt(5);
            arr2[i] = rand.nextInt(5);
        }
        System.out.println("массив1:"+Arrays.toString(arr1));
        System.out.println("массив2:"+Arrays.toString(arr2));

        for (int el: arr1 ) {
            avg1 += el;
        }
        avg1 /= arr1.length;

        for (int el: arr2 ) {
            avg2 += el;
        }
        avg2 /= arr2.length;

        if (avg1 > avg2) {
            System.out.println("среднее "+avg1+ " массива1 больше чем среднее "+avg2+" массива2");
        } else if (avg1 < avg2) {
            System.out.println("среднее "+avg1+ " массива1 меньше чем среднее "+avg2+" массива2");
        } else {
            System.out.println("среднее "+avg1+ " массива1 равно среднему "+avg2+" массива2");
        }
    }
}
