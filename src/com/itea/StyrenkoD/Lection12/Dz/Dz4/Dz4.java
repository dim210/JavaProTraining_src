package com.itea.StyrenkoD.Lection12.Dz.Dz4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Dz4 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Введите последовательность через запятую");
        String[] answStr = answer.next().split(",");
        HashSet<String> hs = new HashSet<String>();

        for (String el : answStr) {
            hs.add(el);
            System.out.println("add: " + el);
        }
        System.out.println(hs);
    }
}
