package com.itea.StyrenkoD.Lection2;

import java.util.Arrays;
import java.util.Random;

public class task2_2 {
    public static void main(String[] args) {
        int arr [] = new int[12];
        Random rand = new Random();
        int maxVal = -15;
        int maxInd = 0;

        for (int i=0; i<arr.length;i++) {
            arr[i] = rand.nextInt(-15,15);
        }
        System.out.println(Arrays.toString(arr));

        for (int i=0; i<arr.length;i++) {
            if (arr[i] >= maxVal) {
                maxVal = arr[i];
                maxInd = i;
            }
        }
        System.out.println("Элемент["+maxInd+"] последним содержит максимальное значение: "+maxVal);
    }
}
