package com.itea.StyrenkoD.Lection7.Dz1;

public class Dz1Main {
    public static void main(String[] args) {
        Book book1;
        Book book2;

        book1 = new Book("Война и мир","Л.Толстой","Основы",20);
        book2 = new Book("Вий","Н.Гоголь","Фолио",8);

        book1.getInfo();
        book2.getInfo();
    }
}
