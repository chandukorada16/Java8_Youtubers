package com.vtalent.batch28.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class TaskSixteenOct {
    public static void main(String[] args) {
        int arr[]={8,2,4,7,5,9,6,7,7,5};
        String word="String";
        System.out.println("max Element "+maxElementArray(arr));
        System.out.println("min Element "+minElementArray(arr));
        System.out.println(maxElementInArrayJavaStream(arr));
        System.out.println(minElementInArrayJavaStream(arr));
        System.out.println(reverseOfString(word));
        System.out.println(reverseOfStringApproach(word));
        System.out.println(reverseOfStringUsingStreams(word));
    }
    private static int maxElementArray(int arr[]){
        int maxElement=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxElement){
                maxElement=arr[i];
            }
        }
        return maxElement;
    }

    private static int minElementArray(int arr[]){
        int minElement=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minElement){
                minElement=arr[i];
            }
        }
        return minElement;
    }

    private static int maxElementInArrayJavaStream(int arr[]){
        int maxElement = Arrays.stream(arr).max().getAsInt();
        return maxElement;
    }

    private static int minElementInArrayJavaStream(int arr[]){
        int minElement = Arrays.stream(arr).min().getAsInt();
        return minElement;
    }

    private static String reverseOfString(String word){
        String rev="";
        for(int i=word.length()-1;i>=0;i--){
            rev=rev+word.charAt(i);
        }
        return rev;
    }

    private static String reverseOfStringApproach(String word){
        return new StringBuilder(word).reverse().toString();
    }

    private static String reverseOfStringUsingStreams(String word){
        String reverse = Stream.of(word.split("")).reduce((a, b) -> b + "" + a).get();
        return reverse;
    }



}
