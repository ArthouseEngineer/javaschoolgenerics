package com.sbt.javaschool.generics.hometasklessongenerics.interfaces;

import java.util.Map;

public interface CountMap<T> {
    /**
     * Добавление элемента в контейнер
     * @param value Добавляемое значание
     */
    void add(T value);

    /**
     * @param element - Элемент чье количетсво повторений будем считать
     * @return Возвращает количество повторений элемента
     */
    int getCount(T element);

    //Удаляет элемент и контейнера и возвращает количество его добавлений(до удаления)
    int remove(T element);

    //количество разных элементов
    int size();

    //Добавить все элементы из source в текущий контейнер, при совпадении ключей, суммировать значения
    void addAll(CountMap source);

    //Вернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений
    Map toMap();

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    void toMap(Map destination);

}
