package com.itea.StyrenkoD.Lection4;

public class Task1 {
    public static void main(String[] args) {
        Group group = new Group(10);
        group.addStudent("Вася", "Васильев", "ФИТ", 11, 2019);
        group.addStudent("Ваня", "Иванов", "ФИТ", 7, 2019);
        group.addStudent("Петя", "Петров", "ФИТ", 10, 2019);
        group.studentsList();

        group.getIdBySurname("Иванов");
        System.out.println("=======================");
        group.delBySurname("Иванов");
        group.studentsList();
    }
}
