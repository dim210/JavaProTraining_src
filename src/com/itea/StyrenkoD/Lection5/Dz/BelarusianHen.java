package com.itea.StyrenkoD.Lection5.Dz;

public class BelarusianHen extends Hen {
    private final String country = "Belarus";
    private final int countEggs = 23;

    @Override
    public int getCountOfEggsPerMonth() {
        return countEggs;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ". Моя страна " + this.country + ". Я несу " +
                this.getCountOfEggsPerMonth() + " в месяц";
    }
}