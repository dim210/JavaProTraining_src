package com.itea.StyrenkoD.Lection12.Dz.Dz1;

import java.util.ArrayList;

public class Dz1Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes =new ArrayList<>();

        boxes.add(new HeavyBox(10));
        boxes.add(new HeavyBox(20));
        boxes.add(new HeavyBox(12));

        for (HeavyBox box: boxes){
            System.out.println(box);
        }
        System.out.println("-----");

        boxes.get(0).setWeight(boxes.get(0).getWeight()+1);

        for (HeavyBox box: boxes){
            System.out.println(box);
        }
    }
}
