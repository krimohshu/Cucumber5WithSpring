package com.aryeet.scenarios.steps;

import com.aryeet.model.RandomGeneratorSearchCriteria;
import com.aryeet.model.ReviewFilter;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class TypeConversionStepDefinitions {
    @DataTableType
    public RandomGeneratorSearchCriteria rgscEntry(Map<String, String> entry) {
        return new RandomGeneratorSearchCriteria(
                entry.get("NumOfDates"),
                entry.get("outPutFormat"),
                entry.get("customDateFormat"),
                entry.get("startDate"),
                entry.get("endDate"));
    }

    @DataTableType
    public ReviewFilter whichFilterCriteria(Map<String, String> entry) {
        return new ReviewFilter().setReviewFilter(entry);
    }

}
