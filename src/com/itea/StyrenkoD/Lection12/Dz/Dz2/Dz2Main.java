package com.itea.StyrenkoD.Lection12.Dz.Dz2;

import java.util.ArrayList;
import java.util.Iterator;

public class Dz2Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes = new ArrayList<>();

        boxes.add(new HeavyBox(10));
        boxes.add(new HeavyBox(20));
        boxes.add(new HeavyBox(12));

        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
        System.out.println("-----");

        Iterator<HeavyBox> iterator = boxes.iterator();
        for (Iterator<HeavyBox> it = iterator; it.hasNext(); ) {
            System.out.println(it.next());
        }
        System.out.println("-----");
        Object[] arrBoxes = boxes.toArray();

        for (int i = 0; i < arrBoxes.length; i++) {
            System.out.println(arrBoxes[i]);
        }
    }
}
