package com.aryeet.scenarios.steps;

import com.aryeet.model.CommonSearchCriteria;
import com.aryeet.model.RandomGeneratorSearchCriteria;
import com.aryeet.pages.AppLandingPage;
import com.aryeet.secnarios.RandomGeneratorAppTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;


//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class RandomGenSteps extends AbstractStepDefinition {
    private static final Logger log = LoggerFactory.getLogger(RandomGenSteps.class);

    @Autowired
    private CommonSearchCriteria commonSearchCriteria;

    @Autowired
    private AppLandingPage appLandingPage;

   /* @Autowired
    private RandomGeneratorAppTest randomGeneratorAppTest;*/

    @Given("Valid user provide following Randomization criteria")
    public void valid_user_provide_following_Randomization(List<RandomGeneratorSearchCriteria> rgscEntry) {
        rgscEntry.stream().forEach(x-> System.out.println(x));
        appLandingPage.getDriver();
       commonSearchCriteria.setListOfRandomGeneratorSearchCriteria(rgscEntry);
    }

    @Then("{string} result should match {string} expected result on UI")
    public void result_should_match_expected_result(String string, String string2) {



    }



}
