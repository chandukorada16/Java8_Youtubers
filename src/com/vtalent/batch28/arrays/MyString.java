package com.vtalent.batch28.arrays;

public class MyString {
    public static void main(String[] args) {

        String s1 = "chandu";
        String s3=new String("chandu");
        String s2 = "chandu";
        String s4=new String("ramu");
        StringBuffer s5=new StringBuffer("somu");
        StringBuffer s6=new StringBuffer("somu");
        System.out.println(s1==s2);//true
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s5.equals(s6));//false
        System.out.println(s2.equals(s3));//false
        System.out.println(s2==s3);
        System.out.println(s1.intern().hashCode()==s3.hashCode());

    }


}
