package com.itea.StyrenkoD.Lection2;

import java.util.Scanner;

public class task1_7 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Что такое: синий, большой, с усами, полный зайцев?");
        endfor:
        for (int i=1; i<=3;i++){
            switch (answer.next().toUpperCase()) {
                case "ТРОЛЛЕЙБУС": {
                    System.out.println("Правильно!");
                    break endfor;
                }
                case "СДАЮСЬ":{
                    System.out.println("Правильный ответ: Троллейбус");
                    break endfor;
                }
                default:
                    if (i!=3)
                        System.out.println("Попробуйте еще раз");
                    else
                        System.out.println("Вы не угадали!");

            }

        }
    }
}
