package com.vtalent.batch28.arrays;

import java.util.Objects;

class Myclass {
    int id;
    String name;

    public Myclass(int i, String chandu) {
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Myclass myclass = (Myclass) o;
        return id == myclass.id && Objects.equals(name, myclass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class Test1{
    public static void main(String[] args) {
        Myclass m1=new Myclass(101,"chandu");
        Myclass m2=new Myclass(101,"chandu");
        System.out.println(m1.equals(m2));

    }
}

