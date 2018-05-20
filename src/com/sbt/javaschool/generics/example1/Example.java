package com.sbt.javaschool.generics.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Example {

    public static void main(String[] args) {
        Box<List<Date>,String> stringBox = new Box<>();

        stringBox.setK(new ArrayList<Date>());

        stringBox.getK().add(new Date());

    }
}
