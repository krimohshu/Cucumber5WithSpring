package com.aryeet.model;

import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Component
public class CommonSearchCriteria {
   private List<RandomGeneratorSearchCriteria> ListOfRandomGeneratorSearchCriteria;

    public List<RandomGeneratorSearchCriteria> getListOfRandomGeneratorSearchCriteria() {
        return ListOfRandomGeneratorSearchCriteria;
    }

    public void setListOfRandomGeneratorSearchCriteria(List<RandomGeneratorSearchCriteria> listOfRandomGeneratorSearchCriteria) {
        ListOfRandomGeneratorSearchCriteria = listOfRandomGeneratorSearchCriteria;
    }
}
