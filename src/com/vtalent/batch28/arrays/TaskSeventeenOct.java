package com.vtalent.batch28.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class TaskSeventeenOct {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input="to print the all given words";
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(secondMaxGivenArray(arr));
        System.out.println(NthLargestOfGivenArray(arr,target));
        System.out.println(findNthLargest(arr,target));
        System.out.println(reverseOfWordsWithoutChangingWords(input));
        reverseOfWordsWithoutChangingWordsJava7(input);
    }
    private static Integer secondMaxGivenArray(int arr[]){
        Integer secondMax = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        return secondMax;
    }
    private static Optional<Integer> NthLargestOfGivenArray(int arr[], int target){
        if (target <= 0 || target > arr.length) {
            return Optional.empty();
        }
        List<Integer> list = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        return Optional.of(list.get(target-1));
    }

    public static int findNthLargest(int[] arr, int N) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[N - 1];
    }
    private static String reverseOfWordsWithoutChangingWords(String input){
        String rev = Arrays.stream(input.split(" "))
                .map(i -> new StringBuilder(i).reverse().toString())
                .collect(Collectors.joining(" "));
        return rev;
    }
    private static void reverseOfWordsWithoutChangingWordsJava7(String input){
        String[] splitArray=input.split(" ");
        for(int i=0;i<splitArray.length;i++){
            for(int j=splitArray[i].length()-1;j>=0;j--){
                System.out.print(splitArray[i].charAt(j));
            }
            System.out.print(" ");
        }

    }

}
