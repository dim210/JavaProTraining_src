package com.itea.StyrenkoD.Lection12.Dz.Dz9;

import java.util.ArrayList;

public class Dz9Main {
    public static void main(String[] args) {
        ArrayList<Student> faculty = new ArrayList<>();

        Student st1 = new Student("Иван",4,5);
        Student st2= new Student("Галина",1,5);
        Student st3 = new Student("Сергей",2,1);

        faculty.add(st1);
        faculty.add(st2);
        faculty.add(st3);

        Dekan.printAllStudents(faculty);

        st1.addScores("программирование",5);
        st1.addScores("физика",4);
        st1.addScores("история",3);
        st2.addScores("программирование",5);
        st2.addScores("физика",5);
        st2.addScores("история",4);
        st3.addScores("программирование",3);
        st3.addScores("физика",3);
        st3.addScores("история",2);

        Dekan.printCourseStudents(faculty,5);

        Dekan.listAboveScore(faculty,3);
    }
}
