
package com.sbt.javaschool.generics.example4.basicstore;

import java.util.Collection;
import java.util.Map;

public interface MyObjectStore<K,V> {
    void put(K key, V value);

    V get(K key);

    void putAll(Map<K, ? extends V> values);

    Collection<V> getAll();

    Collection<V> getAll(Predicate<? super V> predicate);
}
