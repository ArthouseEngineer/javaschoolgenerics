package com.sbt.javaschool.generics.example4.impl;

import com.sbt.javaschool.generics.example4.basicstore.Predicate;
import com.sbt.javaschool.generics.example4.basicstore.MyObjectStore;

import java.util.*;

public class MyObjectStoreImpl<K, V> implements MyObjectStore<K, V> {

    Map<K, V> store = new HashMap<>();

    @Override
    public void put(K key, V value) {
        store.put(key, value);
    }

    @Override
    public V get(K key) {
        return store.get(key);
    }

    @Override
    public void putAll(Map<K, ? extends V> values) {
        store.putAll(values);
    }

    @Override
    public Collection<V> getAll() {
        return store.values();
    }

    @Override
    public Collection<V> getAll(Predicate<? super V> predicate) {
        List<V> elements = new ArrayList<>();

        for (V element : store.values()) {
            if (predicate.apply(element)) {
                elements.add(element);
            }
        }
        return elements;
    }
}
