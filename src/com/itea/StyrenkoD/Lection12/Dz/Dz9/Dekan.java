package com.itea.StyrenkoD.Lection12.Dz.Dz9;

import java.util.List;

public class Dekan {
    public static void printAllStudents(List<Student> students) {
        System.out.println("------ All Students:");
        for (Student el : students) {
            System.out.println(el);
        }
    }

    public static void printCourseStudents(List<Student> students, int course) {
        System.out.println("------ Students of course: " + course);
        for (Student el : students) {
            if (el.getCourse() == course) {
                System.out.println(el);
            }
        }
    }

    public static void listAboveScore(List<Student> students, int chScore) {
        System.out.println("------ Students with avarage score above " + chScore);
        for (Student el : students) {
            if (el.getAvgScore() >= chScore) {
                System.out.println(el);
            }
        }
    }
}
