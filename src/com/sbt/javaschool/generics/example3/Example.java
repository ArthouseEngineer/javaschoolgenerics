package com.sbt.javaschool.generics.example3;

import com.sbt.javaschool.generics.example3.entities.*;
import com.sbt.javaschool.generics.example3.utils.Utils;

public class Example {

    public static void main(String[] args) {

        Product product = Utils.createProduct(Product.class);

        System.out.println(product);
    }

}
