package com.itea.StyrenkoD.Lection12.Dz.DZ6;

public class HeavyBox implements Comparable<HeavyBox>{
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

    @Override
    public int compareTo(HeavyBox other) {
        return this.getWeight() - other.getWeight();
    }
}
