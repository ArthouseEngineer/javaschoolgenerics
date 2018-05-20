package com.sbt.javaschool.generics.example2;


public class OrderedPair<K,V> implements Pair<K,V> {

    private  K key;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    private  V value;

    @Override
    public K getkey() {
        return null;
    }

    @Override
    public V getValue() {
        return null;
    }
}
