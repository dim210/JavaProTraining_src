package com.itea.StyrenkoD.Lection12.Dz.Dz5;

import java.util.Set;
import java.util.TreeSet;

public class SetManager {
    public static <T> Set<T> union(Set<T> st1, Set<T> st2){
        Set<T> tmp = new TreeSet<>();
        tmp.addAll(st1);
        tmp.addAll(st2);
        return tmp;
    }
    public static <T> Set<T>  intersect(Set<T> st1, Set<T> st2){
        Set<T> tmp = new TreeSet<>();
        tmp.addAll(st1);
        tmp.retainAll(st2);
        return tmp;
    }
}
