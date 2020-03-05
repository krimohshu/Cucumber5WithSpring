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

    public String getNumOfDates() {
        return NumOfDates;
    }

    public void setNumOfDates(String numOfDates) {
        NumOfDates = numOfDates;
    }

    public String getOutPutFormat() {
        return outPutFormat;
    }

    public void setOutPutFormat(String outPutFormat) {
        this.outPutFormat = outPutFormat;
    }

    public String getCustomDateFormat() {
        return customDateFormat;
    }

    public void setCustomDateFormat(String customDateFormat) {
        this.customDateFormat = customDateFormat;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
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
