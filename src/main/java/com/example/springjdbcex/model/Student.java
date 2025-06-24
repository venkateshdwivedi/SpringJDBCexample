package com.example.springjdbcex.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int rollNo;
    private int marks;
    private String name;

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
    }

    
}
