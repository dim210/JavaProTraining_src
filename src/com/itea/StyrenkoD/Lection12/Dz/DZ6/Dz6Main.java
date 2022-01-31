package com.itea.StyrenkoD.Lection12.Dz.DZ6;

import java.util.ArrayDeque;

public class Dz6Main {
    public static void main(String[] args) {
        ArrayDeque<HeavyBox> arrHb = new ArrayDeque<>();
        arrHb.offer(new HeavyBox(10));
        arrHb.offer(new HeavyBox(20));
        arrHb.offer(new HeavyBox(12));
        System.out.println(arrHb);

        System.out.println("--------");
        HeavyBox hb = arrHb.poll();
        System.out.println("polled box: "+ hb);
        System.out.println(arrHb);

        System.out.println("--------");
        hb = arrHb.poll();
        System.out.println("polled box: "+ hb);
        System.out.println(arrHb);
    }
}
