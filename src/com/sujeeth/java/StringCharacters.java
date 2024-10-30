package com.sujeeth.java;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCharacters {
    public static void main(String[] args) {
        String word="Baby Surresetti";
        String java17TextBlock=  """ 
                I am from Andhra,
                Working as a Java Developer.
                   in hyd.
                   """;

        Map<String, Long> collect = Arrays.stream(word.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        System.out.println(java17TextBlock);

    }
}
