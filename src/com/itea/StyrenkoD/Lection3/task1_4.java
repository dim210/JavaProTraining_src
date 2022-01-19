package com.itea.StyrenkoD.Lection3;

public class task1_4 {
    public static void main(String[] args) {
        String str1 = "test string";
        String str2 [] = str1.split(" ");
        System.out.println("The given string is: "+str1);
        str1 = "";

        for (int j=0; j<str2.length; j++) {
            if (j>0){
                str1 +=" ";
            }
            for (int i = 0; i < str2[j].toCharArray().length; i += 2) {
                //System.out.print(str2[j].charAt(i));
                str1 += str2[j].charAt(i);
            }
        }
        System.out.print("The new string is: "+str1);
    }
}
