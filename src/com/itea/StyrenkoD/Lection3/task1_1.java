package com.itea.StyrenkoD.Lection3;

public class task1_1 {
    public static void main(String[] args) {
        String str1 = "123ACA321";
        String answer = " is ";

        for (int i=0; i<=(str1.toCharArray().length-1)/2;i++) {
            if (str1.charAt(i) != str1.charAt(str1.toCharArray().length-1 - i)) {
                answer = " is not ";
            }

        }
        System.out.println("Your string: "+str1+answer+" a palindrome");
    }
}
