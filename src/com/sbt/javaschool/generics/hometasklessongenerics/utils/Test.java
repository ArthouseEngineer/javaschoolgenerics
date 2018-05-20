package com.sbt.javaschool.generics.hometasklessongenerics.utils;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(2);
        integerList.add(1);
        integerList.add(5);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(12);
        integerList.add(15);


        List<Integer>   newArrayList = CollectionUtils.limit(integerList,4);

        System.out.println("Limit test ");
        print(newArrayList);
        
        System.out.println("--------------------");

        List<Integer> copy = CollectionUtils.newArrayList();
        CollectionUtils.addAll(integerList,copy);
        System.out.println("add all test ");

        print(copy);

        System.out.println("--------------------");

        System.out.println("Index of test ");
        System.out.println(CollectionUtils.indexOf(integerList,15));

        System.out.println("--------------------");
        System.out.println("containsAll test - " + CollectionUtils.containsAll(integerList,copy));

        System.out.println("--------------------");
        System.out.println("containsAny test - " + CollectionUtils.containsAny(integerList,newArrayList));

    }

    private static void print(Collection<Integer> collection){
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
