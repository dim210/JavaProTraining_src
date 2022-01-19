package com.itea.StyrenkoD.Lection3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1_5 {
    public static void main(String[] args) {
        String str1 = "rabbit bribe dog";
        String str2 = "bib";

        Pattern pattern = Pattern.compile("\\w*["+str2+"]\\w*");
        Matcher matcher = pattern.matcher(str1);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        //"красивое" решение - постоить правильное регулярное выражение на основе второй строки
        //2 точный вариант - разложить первую строку на массив слов, потом обе строки на массивы символов
        //сделать промежуточный массив текущего слова, в котором ведем поиск циклом, в нем
        //удалять первое вхождение найденного символа, для контроля символов, которые повторяются
        // и т.д., займет много времени, не успеваю..
    }
}
