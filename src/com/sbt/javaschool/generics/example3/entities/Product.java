package com.sbt.javaschool.generics.example3.entities;

import java.util.Date;

public class Product {
    private Date beginDate;
    private Date endDate;

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(long productNumber) {
        this.productNumber = productNumber;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return " Product number " + getProductNumber() + " { " +
                "beginDate = " + beginDate +   "}";
    }

    public Product(Date beginDate, Date endDate, long productNumber) {

        this.beginDate = beginDate;
        this.endDate = endDate;
        this.productNumber = productNumber;
    }

    private long productNumber;
}
