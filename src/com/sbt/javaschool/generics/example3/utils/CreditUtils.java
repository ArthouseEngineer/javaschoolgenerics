package com.sbt.javaschool.generics.example3.utils;

import com.sbt.javaschool.generics.example3.entities.Credit;

import java.math.BigDecimal;

public class CreditUtils {
    public static Credit createCredit() {

        Credit credit =  Utils.createProduct(Credit.class);

        credit.setLoanPercent(new BigDecimal(10L));

        return credit;
    }
}
