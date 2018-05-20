package com.sbt.javaschool.generics.example1;

public class Box<K,V> {

    private K k;

    private  V v;

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
