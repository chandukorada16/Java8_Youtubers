package com.practicelab.java8.capgemini2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDetails {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", Arrays.asList("123-456-7890", "987-654-3210")));
        persons.add(new Person("Bob", Arrays.asList("555-555-5555")));
        persons.add(new Person("Charlie", Arrays.asList("444-444-4444", "333-333-3333")));

        System.out.println(combinePhoneNumbers(persons));


    }

    private static List<String> combinePhoneNumbers(List<Person> persons) {
        List<String> combinePhoneNum = persons.stream()
                .flatMap(i -> i.getPhoneNum().stream())
                .collect(Collectors.toList());
        return combinePhoneNum;
    }


}
