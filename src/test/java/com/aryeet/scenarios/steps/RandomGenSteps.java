package com.aryeet.scenarios.steps;

import com.aryeet.model.CommonSearchCriteria;
import com.aryeet.model.RandomGeneratorSearchCriteria;
import com.aryeet.pages.AppLandingPage;
import com.aryeet.secnarios.RandomGeneratorAppTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.annotation.DirtiesContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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
        appLandingPage.goTo(environment.getProperty("base.url"));
       /* JavascriptExecutor js = (JavascriptExecutor) driver;
        String val = (String) js.executeScript("window.bridges[\"generate-random-date\"];");*/

        RandomGeneratorSearchCriteria randomGeneratorSearchCriteria = rgscEntry.get(0);

        appLandingPage.withHowManyDatesToGenerate(randomGeneratorSearchCriteria.getNumOfDates())
                .withDateOutputFormat(randomGeneratorSearchCriteria.getOutPutFormat())
                .withCustomDateFormat(randomGeneratorSearchCriteria.getCustomDateFormat())
                .withStartDate(randomGeneratorSearchCriteria.getStartDate())
                .withSendDate(randomGeneratorSearchCriteria.getEndDate());

        appLandingPage.setAllTheOptions();
        commonSearchCriteria.setListOfRandomGeneratorSearchCriteria(rgscEntry);
        System.out.println();
    }
  //  @Given("Valid user provide following Randomization criteria {string},YYYY-MM-DD hh:mm:ss,YY-MM-DD,{int}-{int}-{int} {int}:{int}:{double}-{int}-{int} {int}:{int}:{int}")

    @Given("Valid user provide following Randomization criteria {string},{string},{string},{string},{string}")
    public void valid_user_provide_following_RandomizationWithList(String NumOfDates, String outPutFormat, String customDateFormat , String startDate, String endDate) {
        RandomGeneratorSearchCriteria rndg = new RandomGeneratorSearchCriteria(NumOfDates, outPutFormat , customDateFormat , startDate , endDate);
        List<RandomGeneratorSearchCriteria> listOfDataCreated = new LinkedList<>();
        listOfDataCreated.add(rndg);
        valid_user_provide_following_Randomization(listOfDataCreated);
        listOfDataCreated.remove(rndg);
    }

        @Then("result should match {string} expected result on UI")
    public void result_should_match_expected_result(String expected) {
        String[] ruleInfo = expected.split(";");
        String ruleIndex = ruleInfo[0];
        String ruleCriteria = ruleInfo[1];

        appLandingPage.getresultDataInTextArea();

    }


}
