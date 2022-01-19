package com.itea.StyrenkoD.Lection8.Dz;

public class StudentBookMain {
    public static void main(String[] args) {
        StudentBook studentBook = new StudentBook("Ваня Петров","FIT",2);
        studentBook.addExam(1,"Математика",5);
        studentBook.addExam(1,"Рисование",3);
        studentBook.addExam(1,"Пение",4);
        System.out.println(studentBook);

        studentBook.addExam(2,"Математика",5);
        studentBook.addExam(2,"Рисование",5);
        studentBook.addExam(2,"Пение",5);
        System.out.println(studentBook);
    }
}
