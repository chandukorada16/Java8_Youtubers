package com.vtalent.batch28.arrays;

import java.util.TreeSet;

public class TreesetComparator {
    public static void main(String[] args) {


        TreeSet tree = new TreeSet(new MyComparator());
        tree.add(101);
        tree.add(9);
        tree.add(258);
        tree.add(12);
        tree.add(45);
        System.out.println(tree);

    }

}
