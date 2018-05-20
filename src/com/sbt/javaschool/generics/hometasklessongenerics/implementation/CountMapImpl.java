package com.sbt.javaschool.generics.hometasklessongenerics.implementation;


import com.sbt.javaschool.generics.hometasklessongenerics.interfaces.CountMap;

import java.util.HashMap;
import java.util.Map;

public class CountMapImpl<T> implements CountMap<T> {

    private Map<T, Integer> integerMap = new HashMap<>();

    /**
     * Добавляет элемент в контейнер
     * @param value Добавляемое значание
     */
    @Override
    public void add(T value) {
        if (!integerMap.containsKey(value)) {
            integerMap.put(value, 1);
        } else integerMap.put(value, integerMap.get(value) + 1);
    }

    /**
     * Считает количество добавлений элемента в Map
     * @param element - Элемент чье количетсво добовлений будем считать
     * @return
     */
    @Override
    public int getCount(T element) {
        return integerMap.get(element);
    }

    /**
     * @param element - Элемент который необходимо удалить из Map'a
     * @return Количество добовлений элемента до удаления элемента
     */
    @Override
    public int remove(T element) {
        int count = integerMap.get(element);
        integerMap.remove(element);
        return count;
    }

    /**
     * @return Возвращает количество различных элементов Map'a
     */
    @Override
    public int size() {
        return integerMap.size();
    }

    /**
     * @param source Исходный CountMap из которого небходимо добавить элементы в текущий контейнер
     */
    @Override
    public void addAll(CountMap source) {
        Map<T, Integer> tempMap = source.toMap();
        for (Map.Entry<T, Integer> entry : tempMap.entrySet()) {
            if (integerMap.containsKey(entry.getKey())) {
                integerMap.put(entry.getKey(), integerMap.get(entry.getKey()) + entry.getValue());
            } else
                integerMap.put(entry.getKey(), entry.getValue());
        }
    }

    /**
     * @return Возвращает java.util.map
     * @key - Добавленный элемент
     * @value - Количество добавлений элемента
     */
    @Override
    public Map toMap() {
        return integerMap;
    }

    /**
     * @param destination
     */
    @Override
    public void toMap(Map destination) {
        destination = (Map) this;
    }
}
