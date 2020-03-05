package com.aryeet.model;

import lombok.Getter;
import lombok.Setter;

public class RandomGeneratorSearchCriteria {

    String NumOfDates;
    String outPutFormat;
    String customDateFormat;
    String startDate;
    String endDate;

    public RandomGeneratorSearchCriteria(String numOfDates, String outPutFormat, String customDateFormat, String startDate, String endDate) {
        NumOfDates = numOfDates;
        this.outPutFormat = outPutFormat;
        this.customDateFormat = customDateFormat;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "RandomGeneratorSearchCriteria{" +
                "NumOfDates='" + NumOfDates + '\'' +
                ", outPutFormat='" + outPutFormat + '\'' +
                ", customDateFormat='" + customDateFormat + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
