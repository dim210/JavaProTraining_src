package com.itea.StyrenkoD.Lection8.Dz;

public class StudentBook {
    private String studentFio;
    private String getStudentFaculty;
    private int groupNumber;
    private final int SESSIONSCOUNT = 10;
    private Session[] sessions = new Session[SESSIONSCOUNT];

    public StudentBook(String studentFio, String getStudentFaculty, int groupNumber) {
        this.studentFio = studentFio;
        this.getStudentFaculty = getStudentFaculty;
        this.groupNumber = groupNumber;
    }

    private boolean isAddSession(int sessNum) {
        if (sessNum > SESSIONSCOUNT - 1) {
            System.out.println("всего только " + SESSIONSCOUNT + " сессий на курсе!");
            return false;
        } else {
            if (sessions[sessNum-1] == null) {
                sessions[sessNum-1] = new Session(sessNum-1);
                System.out.println("сессия открыта!");
            }
            return true;
        }
    }

    public void addExam(int sessNum, String name, int rating) {
        if (isAddSession(sessNum)) {
            sessions[sessNum-1].addExam(name, rating);
        }
    }

    @Override
    public String toString() {
        String allSessions = "";
        for (int i = 0; i < sessions.length; i++) {
            if (sessions[i] != null) {
                allSessions = allSessions+"сессия: " + (i + 1) + "\n" + sessions[i] + "\n";
            }
        }
        return allSessions;
    }

    private class Session {
        private int sessionNumber;
        private final int MAXEXAMS = 10;
        private Exam[] exams = new Exam[MAXEXAMS];
        private int examCount = 0;

        public Session(int sessionNumber) {
            this.sessionNumber = sessionNumber;
        }

        public int getSessionNumber() {
            return sessionNumber;
        }


        public void addExam(String name, int rating) {
            if (examCount >= MAXEXAMS - 1) {
                System.out.println("может быть не более " + MAXEXAMS + " экзаменов в сессию");
            } else {
                this.exams[examCount++] = new Exam(name, rating);
            }
        }

        @Override
        public String toString() {
            String allExams = "";
            for (int i = 0; i < this.exams.length; i++) {
                if (this.exams[i] != null) {
                    allExams = allExams + "exam #:" + (i + 1) + " " + this.exams[i] + "\n";
                }
            }
            return allExams;
        }
    }

    private class Exam {
        private String name;
        private int rating;

        public Exam(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            if (rating > 5) {
                System.out.println("максимальная оценка 5");
                rating = 5;
            }
            this.rating = rating;
        }

        @Override
        public String toString() {
            return "exam:" + this.getName() + " rate:" + this.getRating();
        }
    }
}
