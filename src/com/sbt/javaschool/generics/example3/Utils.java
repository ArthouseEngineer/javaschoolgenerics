package com.sbt.javaschool.generics.example3;

import com.sbt.javaschool.generics.example3.entities.Product;

import java.util.Date;

public class Utils {


    public static <P extends Product> P createProduct(Class<P> exemplar) {

        P product = null;

        try {
            product = exemplar.newInstance();
        } catch (InstantiationException e) {

            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        product.setBeginDate(new Date());

        return product;
    }
}
