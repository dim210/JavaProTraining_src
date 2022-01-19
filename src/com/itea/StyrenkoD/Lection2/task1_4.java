package com.itea.StyrenkoD.Lection2;
//Дмитрий Сатиренко;
import java.util.Scanner;

public class task1_4 {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        int result = 0;
        int answerInt;
        System.out.println("Введите целое положительное число:");
        answerInt = answer.nextInt();
        for (int i=1;i<=answerInt;i++) {
            result += i;
        }
        System.out.println(result);
    }
}
