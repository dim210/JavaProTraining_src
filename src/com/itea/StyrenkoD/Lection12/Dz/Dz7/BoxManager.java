package com.itea.StyrenkoD.Lection12.Dz.Dz7;

import java.util.ArrayList;

public class BoxManager {
    public static void CheckWeight(ArrayList<HeavyBox> in, ArrayList<HeavyBox> reject, int checkWeight) {
        HeavyBox hb;
        for (int i = 0; i < in.size(); i++) {
            if (in.get(i).getWeight() < checkWeight) {
                hb = in.remove(i);
                reject.add(hb);
                System.out.println("element " + hb + "was rejected");
            }
        }
    }
}
