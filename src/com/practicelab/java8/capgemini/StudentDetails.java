package com.practicelab.java8.capgemini;

import com.practicelab.java8.cognizant.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDetails {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("G1",65,"Fifth","Female"));
        students.add(new Student("G2",70,"Sixth","Female"));
        students.add(new Student("B1",64,"Fifth","Male"));
        students.add(new Student("B2",69,"Fifth","Male"));
        students.add(new Student("G3",75,"Fifth","Female"));
        students.add(new Student("G4",50,"Tenth","Female"));

        long countOfTheGirls = students.stream()
                .filter(student -> student.getMarks() > 60 && student.getGender().equals("Female")&&student.getStandard().equals("Fifth"))
                .count();
        List<Student> thoseGirls = students.stream()
                .filter(student -> student.getMarks() > 60 && student.getGender().equals("Female")&&student.getStandard().equals("Fifth"))
                .collect(Collectors.toList());
        System.out.println("Count Of The Girls "+countOfTheGirls);
        System.out.println(thoseGirls);
    }
}
