package com.sujeeth.java;

import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

public class RandomNumbers {
    public static void main(String[] args) {
        RandomGenerator random = RandomGenerator.getDefault();

        int number = random.nextInt(1, 11);
        System.out.println(number);

        long l = random.nextLong(100, 1001);
        System.out.println(l);

        boolean b = random.nextBoolean();
        System.out.println(b);

        IntStream ints = random.ints(5, 20, 50);
        ints.forEach(i-> System.out.println(i));
    }
}
