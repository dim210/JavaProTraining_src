package com.itea.StyrenkoD.Lection6.Dz;

public class BaseConverter {
    public static class Convert {
        /**
         * конвертация градусов цельсия в градусы фарингейта
         * @param celsius градусы цельсия
         * @return градусы фаренгейта
         */
        public static double celsiusToFahrenheit(double celsius) {
            return celsius * 1.8 + 32;
        }

        public static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) / 1.8;
        }

        public static double celsiusToKelvin(double celsius) {
            return celsius + 273.15;
        }

        public static double KelvinToCelsius(double kelvin) {
            return kelvin - 273.15;
        }

        public static double fahrenheitToKelvin(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9 + 273.15;
        }

        public static double KelvinToFahrenheit(double kelvin) {
            return (kelvin - 273.15) * 9 / 5 + 32;
        }
    }
}
