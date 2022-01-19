package com.itea.StyrenkoD.Lection3;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practic {
    public static void main(String[] args) {
        //String s = "\uD83D\uDC7B";
        //System.out.println(s);

        String input = "Hello Java! Hello JavaScript! JavaSe 8.";
        Pattern pattern = Pattern.compile("Java\\w*");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
