package com.sbt.javaschool.generics.example4;

import com.sbt.javaschool.generics.example3.entities.Credit;
import com.sbt.javaschool.generics.example3.entities.Product;
import com.sbt.javaschool.generics.example4.impl.GetOpenProducts;
import com.sbt.javaschool.generics.example4.impl.MyObjectStoreImpl;


import java.math.BigDecimal;
import java.util.*;

public class Example {
    public static void main(String[] args) {

        Map<String, Product> stringProductMap = new HashMap<>();

        MyObjectStoreImpl<String,Product> myStore = new MyObjectStoreImpl();

        stringProductMap.put("1", new Product(new Date(), null, 1L));
        stringProductMap.put("2", new Product(new Date(), null, 2L));
        stringProductMap.put("3", new Product(new Date(), new Date(), 3L));
        stringProductMap.put("4", new Product(new Date(), new Date(), 4L));

        myStore.putAll(stringProductMap);

        System.out.println("Get all product with open end Date");
        System.out.println(myStore.getAll(new GetOpenProducts()));
        System.out.println("-----------------------------------------------");

        Map<String,Credit> stringCreditMap = new HashMap<>();

        stringCreditMap.put("1",new Credit(new Date(),new Date(),1L,new BigDecimal(7.7)));
        stringCreditMap.put("2",new Credit(new Date(),new Date(),2L,new BigDecimal(6.5)));
        stringCreditMap.put("3",new Credit(new Date(),null,3L,new BigDecimal(10)));
        stringCreditMap.put("4",new Credit(new Date(),null,4L,new BigDecimal(15)));

        myStore.putAll(stringCreditMap);

        System.out.println("Get all Credit product with open end Date");
        System.out.println(myStore.getAll(new GetOpenProducts()) + "\n");

    }
}
