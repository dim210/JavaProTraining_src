package com.itea.StyrenkoD.Lection4;

import java.util.Date;

public class Student extends Person {
    private int id;
    private String faculty;
    private int avgScore;
    private int entYear;

    public Student(int id, String name, String surname, String faculty, int avgScore, int entYear) {
        super(name, surname);
        this.setId(id);
        this.setFaculty(faculty);
        this.setAvgScore(avgScore);
        this.setEntYear(entYear);
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    private void setAvgScore(int avgScore) {
        this.avgScore = avgScore;
    }

    private void setEntYear(int entYear) {
        this.entYear = entYear;
    }

    public int getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getAvgScore() {
        return avgScore;
    }

    public int getEntYear() {
        return entYear;
    }

    @Override
    public void info(){
        System.out.println("Студент "+this.getName()+" "+this.getSurname());
        System.out.println("Id:"+this.getId()+ " факультет: "+this.getFaculty()+" средний балл:"+this.getAvgScore()+" год поступления:"+this.getEntYear());
    }
    @Override
    public String toString(){
        return "Студент "+this.getName()+" "+this.getSurname()+", рейтинг:"+this.getAvgScore();
    }
}
