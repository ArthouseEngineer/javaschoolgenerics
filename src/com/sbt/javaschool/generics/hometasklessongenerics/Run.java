package com.sbt.javaschool.generics.hometasklessongenerics;


import com.sbt.javaschool.generics.hometasklessongenerics.implementation.CountMapImpl;
import com.sbt.javaschool.generics.hometasklessongenerics.interfaces.CountMap;

import java.util.Map;

public class Run {

    public static void main(String[] args) {
        CountMap<Integer> countMap = new CountMapImpl<>();

        countMap.add(10);
        countMap.add(10);
        countMap.add(5);
        countMap.add(6);
        countMap.add(5);
        countMap.add(10);


        System.out.println("Map size is : " + countMap.size());
        System.out.println("Count of element 10 is : " + countMap.getCount(10));
        System.out.println("Count of element 5 is : " + countMap.getCount(5));
        System.out.println("Count of element 6 is : " + countMap.getCount(6));

        Map<Integer,Integer>  newMap = countMap.toMap();

        System.out.println("-----------------------------------------------");

        for (Map.Entry<Integer,Integer> element: newMap.entrySet()) {
            System.out.println("Element " + element.getKey() + " Count of element is :" + element.getValue() );
        }

        System.out.println("-----------------------------------------------");

        CountMap<Integer> countMapSecond = new CountMapImpl<>();
        countMapSecond.add(10);
        countMapSecond.add(10);
        countMapSecond.add(15);
        countMapSecond.add(18);
        countMapSecond.add(13);

        countMap.addAll(countMapSecond); 

        System.out.println("Before AddAll Call");
        System.out.println("Map size is : " + countMap.size());
        System.out.println("Count of element 10 is : " + countMap.getCount(10));
        System.out.println("Count of element 5 is : " + countMap.getCount(5));
        System.out.println("Count of element 6 is : " + countMap.getCount(6));

        CountMapImpl<String> stringCountMap = new CountMapImpl<>();

        stringCountMap.add("Generics");
        stringCountMap.add("Is");
        stringCountMap.add("Awesome!");
        stringCountMap.add("And");
        stringCountMap.add("Cool!");
        stringCountMap.add("And");
        stringCountMap.add("And");

        System.out.println("-----------------------------------------------");

        System.out.println("StringCountMap size is : " + stringCountMap.size());
        System.out.println("Count of element \"And\" is : " + stringCountMap.getCount("And"));

    }

}
