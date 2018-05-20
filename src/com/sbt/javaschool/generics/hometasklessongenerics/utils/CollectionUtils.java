package com.sbt.javaschool.generics.hometasklessongenerics.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List newArrayList() {
        return new ArrayList<T>();
    }

    public static int indexOf(List source, Object o) {
        return source.indexOf(o);
    }

    public static List limit(List source, int size) {
        List temp = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            temp.add(source.get(i));
        }
        return temp;
    }

    public static void add(List source, Object o) {
        source.add(o);
    }

    public static void removeAll(List removeFrom, List c2) {
        removeFrom.removeAll(c2);
    }

    public static boolean containsAll(List c1, List c2) {
        return c1.containsAll(c2);
    }

    public static boolean containsAny(List c1, List c2) {
        return !Collections.disjoint(c1, c2);
    }

    //Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
    // Элементы сравнивать через Comparable.
    // Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    public static List range(List list, Object min, Object max) {
        return newArrayList();
    }


    //Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
    // Элементы сравнивать через Comparable.
    // Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    public static List range(List list, Object min, Object max, Comparator comparator) {
        return newArrayList();
    }

}
