package com.itea.StyrenkoD.Lection6.Dz;

public class DzMain {
    public static void main(String[] args) {
        double degree = 20;

        System.out.println(degree + " градусов цельсия это " + BaseConverter.Convert.celsiusToFahrenheit(degree) + " градусов фарингейта");
        System.out.println(degree + " градусов фарингейта это " + BaseConverter.Convert.fahrenheitToCelsius(degree) + " градусов цельсия");

        System.out.println(degree + " градусов цельсия это " + BaseConverter.Convert.celsiusToKelvin(degree) + " градусов кельвина");
        System.out.println(degree + " градусов кельвина это " + BaseConverter.Convert.KelvinToCelsius(degree) + " градусов цельсия");

        System.out.println(degree + " градусов фарингейта это " + BaseConverter.Convert.fahrenheitToKelvin(degree) + " градусов кельвина");
        System.out.println(degree + " градусов кельвина это " + BaseConverter.Convert.KelvinToFahrenheit(degree) + " градусов фарингейта");
    }
}
