package com.saharsh.SpringJdbc.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int Rollno;
    private String name;
    private int marks;

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "student{" +
                "Rollno=" + Rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
