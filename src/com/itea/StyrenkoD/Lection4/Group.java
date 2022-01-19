package com.itea.StyrenkoD.Lection4;

public class Group {
    private final int maxMembers;
    private int count = 0;
    private Student[] students;

    public Group(int maxMembers) {
        this.maxMembers = maxMembers;
        students = new Student[maxMembers];
    }

    public void addStudent(String name, String surname, String faculty, int avgScore, int entYear) {
        if (this.count < maxMembers) {
            students[this.count] = new Student(++this.count, name, surname, faculty, avgScore, entYear);
            System.out.println("Студент " + surname + " добавлен в группу");
        } else {
            System.out.println("Группа уже укомплектована, студент " + surname + " добален не будет");
        }
    }

    public int getIdBySurname(String surname) {
        int id = 0;
        System.out.println("Поиск студента: " + surname);
        for (int i = 0; i < this.count; i++) {
            //if (students[i].getSurname().toUpperCase() == surname.toUpperCase()) {
            if (students[i].getSurname() == surname) {
                id = students[i].getId();
                System.out.println("Найден " + students[i]);
            }
        }
        if (id == 0) {
            System.out.println("Студент по фамилии " + surname + " не найден");
        }
        return id;
    }

    public void delBySurname(String surname) {
        System.out.println("Удаление студента " + surname+"....");
        int delId = this.getIdBySurname(surname);

        if (delId != 0) {

            for (int i = 0; i < this.count; i++) {
                if (students[i].getId() == delId) {
                    students[i] = null;
                    this.reOrder(i);
                    students[this.count - 1] = null;
                    --this.count;
                    System.out.println("Студент " + surname + " удален");
                    return;
                }
            }
        } else {
            System.out.println("Удалять некого");
        }
    }

    private void reOrder(int ind) {
        for (int i = ind; i < this.count - 1; i++) {
            students[i] = students[i + 1];
        }

    }

    public void studentsList() {
        System.out.println("-------------------");
        System.out.println("В группе " + count + " студентов:");
        for (int i = 0; i < this.count; i++) {
            System.out.println(this.students[i]);
        }
        System.out.println("-------------------");
    }
}
