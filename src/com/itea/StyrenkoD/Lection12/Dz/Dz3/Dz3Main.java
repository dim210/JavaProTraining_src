package com.itea.StyrenkoD.Lection12.Dz.Dz3;

import java.util.TreeSet;

public class Dz3Main {
    public static void main(String[] args) {
        TreeSet<HeavyBox> boxes = new TreeSet<>();

        boxes.add(new HeavyBox(10));
        boxes.add(new HeavyBox(20));
        boxes.add(new HeavyBox(12));

        for (HeavyBox hb: boxes){
            System.out.println(hb);
        }
    }
}
