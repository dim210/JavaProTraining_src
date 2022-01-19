package com.itea.StyrenkoD.Lection5.Dz;

public class HenFactory {
    public Hen getHen(String country){
        switch (country) {
            case "Ukrain": return new UkrainianHen();
            case "Poland": return new PolishHen();
            case "Moldova": return new MoldovianHen();
            default: return new BelarusianHen();
        }
    }
}
