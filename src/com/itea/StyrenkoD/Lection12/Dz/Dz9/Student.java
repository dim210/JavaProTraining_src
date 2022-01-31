package com.itea.StyrenkoD.Lection12.Dz.Dz9;

import java.util.HashMap;
import java.util.Set;

public class Student {
    private String name;
    private int groupNum;
    private int course;
    private HashMap<String, Integer> scores;

    public Student(String name, int groupNum, int course) {
        this.name = name;
        this.groupNum = groupNum;
        this.course = course;
        scores = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void addScores(String subj, Integer scores) {
        this.scores.put(subj, scores);
    }

    public float getAvgScore() {
        Integer avgScore = 0;
        int count = this.scores.size();
        if (count > 0) {
            Set<String> keys = this.scores.keySet();
            for (String key : keys) {
                avgScore += this.scores.get(key);
            }
            return avgScore / count;
        } else {
            return avgScore;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupNum=" + groupNum +
                ", course=" + course +
                ", avgScore=" + getAvgScore() +
                '}';
    }
}
