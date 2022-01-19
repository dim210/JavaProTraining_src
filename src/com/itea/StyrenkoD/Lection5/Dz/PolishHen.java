package com.itea.StyrenkoD.Lection5.Dz;

public class PolishHen extends Hen {
    private final String country = "Poland";
    private final int countEggs = 22;

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
