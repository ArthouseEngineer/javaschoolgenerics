package com.sbt.javaschool.generics.example2;

public class Example {

    public static void main(String[] args) {

        Pair<Integer,String> p1 = new OrderedPair<>(1,"First");
        Pair<Integer,String> p2 = new OrderedPair<>(1,"Second");

        System.out.println(Util.compare(p1,p2));
    }
}
