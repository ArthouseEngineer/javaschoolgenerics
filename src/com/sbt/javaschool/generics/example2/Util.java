package com.sbt.javaschool.generics.example2;


public class Util {

    public static<K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2){
        return p1.getkey().equals(p2.getkey()) &&
                p1.getValue().equals(p2.getValue());
    }
}
