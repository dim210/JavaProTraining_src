package com.itea.StyrenkoD.Lection2;

import java.util.Arrays;

public class task2_4 {
    public static void main(String[] args) {
        String arr [] = {"Hello","my","best","Friend","!"};
        String tmpVal;

        System.out.println(Arrays.toString(arr));

        for(int i=0;i<=(arr.length-1)/2;i++){
            tmpVal = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tmpVal;
        }
        System.out.println(Arrays.toString(arr));
    }
}
