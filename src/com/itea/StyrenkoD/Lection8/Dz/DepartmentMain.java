package com.itea.StyrenkoD.Lection8.Dz;

public class DepartmentMain {
    public static void main(String[] args) {
        Department department = new Department("IT");
        department.addPerson("Петя","Иванов");
        department.addPerson("Катя","Сидорова");
        department.EmployeesList();
        department.addPosition("it engenier");
        department.addPosition("HR manager");
        department.PositionsList();
        department.createContract(1,1);
        department.createContract(2,2);
        System.out.println("------------------\n"+department);
    }
}
