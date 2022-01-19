package com.itea.StyrenkoD.Lection5.Dz;

public class UkrainianHen extends Hen {
    private final String country = "Ukrain";
    private final int countEggs = 24;

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
