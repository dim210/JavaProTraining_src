package com.itea.StyrenkoD.Lection12.Dz.Dz5;

import java.util.Set;
import java.util.TreeSet;

public class Dz5Main {
    public static void main(String[] args) {
        Set<String> st = new TreeSet<String>();
        st.add("a");
        st.add("b");
        st.add("c");
        st.add("d");
        System.out.println("st: " + st);

        Set<String> st2 = new TreeSet<>();
        st2.add("c");
        st2.add("d");
        st2.add("e");
        st2.add("f");
        st2.add("g");
        System.out.println("st2: " + st2);

        System.out.println("union: " + SetManager.union(st, st2));
        System.out.println("intersect: " + SetManager.intersect(st, st2));
    }
}
