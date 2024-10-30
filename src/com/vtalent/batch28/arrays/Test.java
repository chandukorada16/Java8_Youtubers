package com.vtalent.batch28.arrays;

public class Test {

    public static void main(String[] args) {
        String s = "chandu@123#";
        System.out.println(countOfSpecialCharcters(s));
        System.out.println(countOfSpecialCharctersInJava8(s));
    }
        private static int countOfSpecialCharcters(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
                count++;
            }
        }
        return count;
    }
    private static long countOfSpecialCharctersInJava8(String s){
        long count = s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !Character.isLetterOrDigit(c) && !Character.isWhitespace(c))
                .count();
        return count;

    }
}
