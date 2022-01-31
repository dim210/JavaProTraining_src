package com.itea.StyrenkoD.Lection12.Dz.Dz7;

import java.util.ArrayList;
import java.util.Iterator;

public class Dz7Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes = new ArrayList<>();
        ArrayList<HeavyBox> rejectBoxes = new ArrayList<>();

        boxes.add(new HeavyBox(150));
        boxes.add(new HeavyBox(750));
        boxes.add(new HeavyBox(1200));

        System.out.println("----Before check:");
        System.out.println(boxes);
        System.out.println(rejectBoxes);

        System.out.println("\n ----check: ");
        BoxManager.CheckWeight(boxes,rejectBoxes,300);

        System.out.println("----After check:");
        System.out.println(boxes);
        System.out.println(rejectBoxes);
    }
}
