package com.itea.StyrenkoD.Lection2;

import java.util.Arrays;
import java.util.Random;

public class task2_3 {
    public static void main(String[] args) {
        int arr [] = new int[4];
        Random rand = new Random();
        String answer = "Возрастающая последовательность";

        for (int i=0; i<arr.length;i++) {
            arr[i] = rand.nextInt(10,99);
        }
        System.out.println(Arrays.toString(arr));

        for (int i=0; i<arr.length;i++) {
            if (i>0) {
                if ( arr[i] <= arr[i-1]) {
                    answer = "Не строго возрастающая последовательность";
                }
            }
        }
        System.out.println(answer);
    }
}
