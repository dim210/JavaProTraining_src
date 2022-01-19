package com.itea.StyrenkoD.Lection5.Dz;

public class DzMain {

    public static void main(String[] args) {
        Hen hen[] = new Hen[4];
        HenFactory factory =new HenFactory();

        hen[0] = factory.getHen("Ukrain");
        hen[1] = factory.getHen("Poland");
        hen[2] = factory.getHen("Moldova");
        hen[3] = factory.getHen("Belarus");

        for (Hen Item : hen) {
            System.out.println(Item.getDescription());
        }
    }
}
