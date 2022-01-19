package com.itea.StyrenkoD.Lection8.Dz;

public class Department {
    private String name;
    private int employeesCount = 0;
    private int positionssCount = 0;
    private int contractsCount = 0;
    private Contract[] contracts = new Contract[10];
    private Position[] positions = new Position[10];
    private Person[] persons = new Person[10];

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return "Department " + name;
    }

    public Position getPosition(int id) {
        if (positions[id] == null) {
            System.out.println("position with id " + id + " not exists");
        }
        return positions[id];
    }

    public Person getPerson(int id) {
        if (persons[id] == null) {
            System.out.println("person with id " + id + " not exists");
        }
        return persons[id];
    }

    public void addPerson(String name, String surname) {
        if (employeesCount < 9) {
            this.persons[++employeesCount] = new Person(name, surname);
            this.persons[employeesCount].setId(employeesCount);
        }
    }

    public void EmployeesList() {
        System.out.println("Employees:\n");
        for (int i = 0; i < this.persons.length; i++) {
            if (this.persons[i] != null) {
                System.out.println(this.persons[i]);
            }
        }
    }

    public void addPosition(String name) {
        if (positionssCount < 9) {
            this.positions[++positionssCount] = new Position(name);
            this.positions[positionssCount].setId(positionssCount);
        }
    }

    public void PositionsList() {
        System.out.println("Positions:\n");
        for (int i = 0; i < this.positions.length; i++) {
            if (this.positions[i] != null) {
                System.out.println(this.positions[i]);
            }
        }
    }

    public void createContract(int personId, int positionId) {
        if (this.getPerson(personId) != null && this.getPosition(positionId) != null) {
            if(contractsCount <9) {
                contracts[++contractsCount]= new Contract(contractsCount,this.getPerson(personId),this.getPosition(positionId));
            }
        } else {
            System.out.println("contract did not created");
        }
    }

    @Override
    public String toString() {
        String allDepartment = this.getName() + "\n All employees:\n";
        for (int i = 0; i < contracts.length; i++) {
            if (contracts[i] != null) {
                allDepartment = allDepartment + contracts[i] + "\n";
            }
        }
        return allDepartment;
    }


    private class Contract {
        private int id;
        private Person person;
        private Position position;

        public Contract(int id, Person person, Position position) {
            this.id = id;
            this.person = person;
            this.position = position;
        }

        @Override
        public String toString() {
            return this.position + ", " + this.person;
        }
    }

    private class Position {
        private String name;
        private int id;
        private boolean isBusy = false;

        public Position(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isBusy() {
            return isBusy;
        }

        public void setBusy(boolean busy) {
            isBusy = busy;
        }

        @Override
        public String toString() {
            return "position id: " + this.getId() + ", description: "+ this.getName();
        }
    }

    private class Person {
        String name;
        String surname;
        private int id;
        private boolean isBusy = false;

        public Person(String name, String surname) {
            this.setName(name);
            this.setSurname(surname);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isBusy() {
            return isBusy;
        }

        public void setBusy(boolean busy) {
            isBusy = busy;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "employee id: " + this.getId() + ", name: "+ this.getName() + " " + this.getSurname();
        }
    }
}
