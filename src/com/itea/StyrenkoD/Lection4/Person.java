package com.itea.StyrenkoD.Lection4;

public class Person {
    private String name;
    private String surname;


    private void setName(String name) {
        this.name = name;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }


    public Person(String name, String surname) {
        this.setName(name);
        this.setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void info() {
        System.out.println(this.getName() + " " + this.getSurname());
    }

}
