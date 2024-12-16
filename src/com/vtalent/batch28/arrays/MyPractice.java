package com.vtalent.batch28.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyPractice {
    public static void main(String[] args) {
        String input = "abbc";
        String name="String";
        List<Integer> list = Arrays.asList(8, 2, 4, 7, 5, 9, 6, 7, 7, 5);
        List<Integer> numbers = Arrays.asList(11, 18, 20, 24, 85, 66, 13);
        List<String> words=Arrays.asList("devarA","vara","tangam","Anvesh","Uva","europe");
        List<String> backend = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        System.out.println(removeDuplicatesInList(list));
        System.out.println(findNamesLengthMorethanFive(backend));
        System.out.println(reverseOfName(name));
        printRandomNumbers();
        System.out.println(frequencyofEachCharacter(input));
        System.out.println(lastElementOfGivenList(backend));
        System.out.println(numberStartWithOne(numbers));
        System.out.println(firstTenOddNum());
        System.out.println(fibonacciRange());
        System.out.println(sumOfEvenNum(numbers));
        System.out.println(findDuplictaes(list));
        System.out.println(findWordsStartingWithVowels(words));
        System.out.println(findWordsEndingWithVowels(words));
        System.out.println(mostRepeatedInGivenArray(list));

    }
    private static List<Integer> removeDuplicatesInList(List<Integer> list){
     return  list.stream().distinct().collect(Collectors.toList());
    }
    private static List<String> findNamesLengthMorethanFive(List<String> backend){
       return backend.stream().filter(i->i.length()>5).collect(Collectors.toList());
    }
    private static String reverseOfName(String name){
       // return new StringBuilder(name).reverse().toString();
        return Arrays.stream(name.split("")).reduce((a,b)->b+""+a).get();
    }
    private static void printRandomNumbers(){
        Random random=new Random();
        IntStream ints = random.ints(5, 10, 100);
        ints.forEach(i-> System.out.println(i));
    }

    private static Map<Character,Long> frequencyofEachCharacter(String input){
      return   input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
    private static String lastElementOfGivenList(List<String> backend){
       return backend.stream().skip(backend.size()-1).findFirst().get();
    }
    private static List<Integer> numberStartWithOne(List<Integer> numbers){
        return numbers.stream()
                .map(String::valueOf)
                .filter(i->i.startsWith("1"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }
    private static List<Integer> firstTenOddNum(){
       return IntStream.iterate(1,n->n+2).boxed().limit(10).collect(Collectors.toList());
    }
    private static List<Integer> fibonacciRange(){
       return Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]}).limit(10).map(f->f[0]).collect(Collectors.toList());
    }
    private static Integer sumOfEvenNum(List<Integer> numbers){
        return numbers.stream().filter(i->i%2==0).reduce((a,b)->a+b).get();
    }
    private static Set<Integer> findDuplictaes(List<Integer> list){
       return list.stream().filter(i-> Collections.frequency(list,i)>1).collect(Collectors.toSet());
        /*Set<Integer> set=new HashSet<>();
        return list.stream().filter(i->!set.add(i)).collect(Collectors.toList());*/
    }
    private static List<String> findWordsStartingWithVowels(List<String> words){
       return words.stream().filter(i->i.matches("[aeiouAEIOU].*")).collect(Collectors.toList());
    }
    private static List<String> findWordsEndingWithVowels(List<String> words){
        return words.stream().filter(i->i.matches(".*[aeiouAEIOU]")).collect(Collectors.toList());
    }
    private static Integer mostRepeatedInGivenArray(List<Integer> list){
      return   list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .max((e1,e2)->e1.getValue().compareTo(e2.getValue()))
                .map(Map.Entry::getKey)
                .orElse(null);
    }


}
