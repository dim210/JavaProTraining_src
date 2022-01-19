package com.itea.StyrenkoD.Lection2;

import java.util.Arrays;
import java.util.Random;

public class task2_1 {
    public static void main(String[] args) {
        int arr [] = new int[8];
        Random rand = new Random();

        for (int i=0; i<arr.length;i++) {
            arr[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        for (int i=0; i<arr.length;i+=2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
