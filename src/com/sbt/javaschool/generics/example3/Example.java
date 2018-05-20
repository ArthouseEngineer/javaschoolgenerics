package com.sbt.javaschool.generics.example3;

import com.sbt.javaschool.generics.example3.entities.Credit;
import com.sbt.javaschool.rnd.generics.example3.entities.*;

public class Example {

    public static void main(String[] args) {

        Credit credit = CreditUtils.createCredit();


        System.out.println(credit);
    }

}
