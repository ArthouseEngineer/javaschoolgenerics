package com.sbt.javaschool.generics.example4.impl;

import com.sbt.javaschool.generics.example4.basicstore.Predicate;
import com.sbt.javaschool.generics.example3.entities.Product;

public class GetOpenProducts implements Predicate<Product> {
    @Override
    public boolean apply(Product ext) {
        return ext.getEndDate() == null;
    }
}
