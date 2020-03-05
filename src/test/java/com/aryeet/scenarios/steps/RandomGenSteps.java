package com.aryeet.scenarios.steps;

import com.aryeet.model.CommonSearchCriteria;
import com.aryeet.model.RandomGeneratorSearchCriteria;
import com.aryeet.pages.AppLandingPage;
import com.aryeet.secnarios.RandomGeneratorAppTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.annotation.DirtiesContext;

import java.util.Arrays;
import java.util.List;


//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class RandomGenSteps extends AbstractStepDefinition {
    private static final Logger log = LoggerFactory.getLogger(RandomGenSteps.class);

    @Autowired
    private CommonSearchCriteria commonSearchCriteria;
    @Autowired
    Environment environment;

    @Autowired
    private AppLandingPage appLandingPage;

   /* @Autowired
    private RandomGeneratorAppTest randomGeneratorAppTest;*/

    @Given("Valid user provide following Randomization criteria")
    public void valid_user_provide_following_Randomization(List<RandomGeneratorSearchCriteria> rgscEntry) {
        rgscEntry.stream().forEach(x -> {
        });

        appLandingPage.goTo(environment.getProperty("base.url"));
        RandomGeneratorSearchCriteria randomGeneratorSearchCriteria = rgscEntry.get(0);
        appLandingPage.withHowManyDatesToGenerate(randomGeneratorSearchCriteria.getNumOfDates());
        appLandingPage.withDateOutputFormat(randomGeneratorSearchCriteria.getOutPutFormat());
        appLandingPage.withCustomDateFormat(randomGeneratorSearchCriteria.getCustomDateFormat());
        appLandingPage.withStartDate(randomGeneratorSearchCriteria.getStartDate());
        appLandingPage.withSendDate(randomGeneratorSearchCriteria.getEndDate());

        appLandingPage.setAllTheOptions();
        //   appLandingPage.getDriver();

        commonSearchCriteria.setListOfRandomGeneratorSearchCriteria(rgscEntry);
        System.out.println();
    }

    @Then("{string} actual result should match {string} expected result on UI")
    public void result_should_match_expected_result(String actual, String expected) {
        String[] ruleInfo = expected.split(";");
        String ruleIndex = ruleInfo[0];
        String ruleCriteria = ruleInfo[1];

        appLandingPage.getresultDataInTextArea();

    }


}
