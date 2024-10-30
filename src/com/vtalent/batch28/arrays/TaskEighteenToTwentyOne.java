package com.vtalent.batch28.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskEighteenToTwentyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        int arr[]={8,2,4,7,5,9};
        char arrayChar[]={'d','e','v','a','r','a'};
        int[] array1 = {4, 10, 7, 19, 22, 29, 11};
        Arrays.sort(array);
        int count=4;
        System.out.println(firstThreeBiggestElements(arr));
        getConsonants(arrayChar);
        primntingNumbersBelowKey(array,key,n);
        findMissingNumbers(array1,count);

    }
    private static List<Integer> firstThreeBiggestElements(int arr[]){
        List<Integer> firstMaxThree = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        return firstMaxThree;
    }

    private static void getConsonants(char arrayChar[]){
        for (char ch : arrayChar) {
            // Convert character to lowercase to handle both uppercase and lowercase letters
            ch = Character.toLowerCase(ch);

            // Check if the character is a consonant and print it
            if (ch >= 'a' && ch <= 'z' && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                System.out.print(ch + " ");
            }
        }
    }
    private static void primntingNumbersBelowKey(int[] array,int key,int n){
        for (int i = 0; i < n; i++) {
            if (array[i] < key) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void findMissingNumbers(int[] array1, int count) {
        int missingCount = 0;
        int expectedNumber = 1;
        int index = 0;

        System.out.print("Missing numbers: ");
        while (missingCount < count) {
            if (index < array1.length && array1[index] == expectedNumber) {
                // If the current number matches the expected number, move to the next one
                index++;
            } else {
                // If the current number is missing, print it and increase missingCount
                System.out.print(expectedNumber + " ");
                missingCount++;
            }
            expectedNumber++;
        }
    }



}
