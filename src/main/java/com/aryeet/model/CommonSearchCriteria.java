package com.aryeet.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommonSearchCriteria {
    private List<RandomGeneratorSearchCriteria> listOfRandomGeneratorSearchCriteria = new ArrayList<>();

    public List<RandomGeneratorSearchCriteria> getListOfRandomGeneratorSearchCriteria() {
        return listOfRandomGeneratorSearchCriteria;
    }

    public void setListOfRandomGeneratorSearchCriteria(List<RandomGeneratorSearchCriteria> listOfRandomGeneratorSearchCriteria) {
        this.listOfRandomGeneratorSearchCriteria = listOfRandomGeneratorSearchCriteria;
    }
}
