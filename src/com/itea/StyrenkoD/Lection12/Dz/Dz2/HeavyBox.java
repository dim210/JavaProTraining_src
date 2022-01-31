package com.itea.StyrenkoD.Lection12.Dz.Dz2;

public class HeavyBox {
    int weight;

    public HeavyBox(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + getWeight() +
                '}';
    }
}
