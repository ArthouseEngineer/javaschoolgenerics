package com.sbt.javaschool.generics.example3.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Credit extends Product {
    private BigDecimal loanPercent;


    public Credit() {
        super();
    }

    public BigDecimal getLoanPercent() {
        return loanPercent;
    }

    public void setLoanPercent(BigDecimal loanPercent) {
        this.loanPercent = loanPercent;
    }

    public Credit(Date beginDate, Date endDate, long productNumber, BigDecimal loanPercent) {

        super(beginDate, endDate, productNumber);
        this.loanPercent = loanPercent;
    }

    @Override
    public String toString() {
      return   " Credit number " + super.getProductNumber() + " { " +
                "beginDate = " + super.getBeginDate() +   " }";
    }
}
