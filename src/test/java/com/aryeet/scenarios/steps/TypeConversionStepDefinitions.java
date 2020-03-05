package com.aryeet.scenarios.steps;
import com.aryeet.model.RandomGeneratorSearchCriteria;
import com.aryeet.secnarios.SpringBootBaseIntegrationTest;
import io.cucumber.java.DataTableType;
import org.springframework.beans.factory.annotation.Value;

import java.util.Map;

public class TypeConversionStepDefinitions  {
    @DataTableType
    public RandomGeneratorSearchCriteria rgscEntry(Map<String, String> entry) {
        return new RandomGeneratorSearchCriteria(
                entry.get("NumOfDates"),
                entry.get("outPutFormat"),
                entry.get("customDateFormat"),
                entry.get("startDate"),
                entry.get("endDate"));
    }

}
