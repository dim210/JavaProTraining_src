package com.itea.StyrenkoD.Lection5.Dz;

public class MoldovianHen extends Hen {
    private final String country = "Moldovan";
    private final int countEggs = 20;

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