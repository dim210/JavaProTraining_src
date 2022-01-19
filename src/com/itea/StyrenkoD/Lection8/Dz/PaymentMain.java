package com.itea.StyrenkoD.Lection8.Dz;

public class PaymentMain {
    public Payment payment;
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addProductToOrder(3572,"Фен",535.42);
        payment.addProductToOrder(1123,"Пылесос",2599.99);
        System.out.println(payment);
        payment.toPayOrder();
        System.out.println(payment);
    }
}
