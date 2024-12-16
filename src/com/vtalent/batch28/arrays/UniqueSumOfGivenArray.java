package com.vtalent.batch28.arrays;

import java.util.Arrays;

public class UniqueSumOfGivenArray {
    public static void main(String[] args) {
        int[] arr={1,3,2,3,2,4};
        int sum=sumOfUniqueArray(arr);
        System.out.println(sum);
    }
    private static int sumOfUniqueArray(int[] arr){
        int uniqueSum= Arrays.stream(arr).boxed().distinct().reduce((a, b)->a+b).get();
        return uniqueSum;

    }
}
