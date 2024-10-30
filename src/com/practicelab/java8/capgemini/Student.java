package com.practicelab.java8.capgemini;

public class Student {
    private String name;
    private int marks;
    private String standard;
    private String gender;

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

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(String name, int marks, String standard, String gender) {
        this.name = name;
        this.marks = marks;
        this.standard = standard;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", standard='" + standard + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
