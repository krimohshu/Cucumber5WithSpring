package com.aryeet.scenarios.steps;

import com.aryeet.model.ReviewFilter;
import com.aryeet.model.TVInfoCard;
import com.aryeet.pages.AppLandingPage;
import com.aryeet.pages.TvInfoCardPage;
import com.aryeet.pages.WhichReviewHomePage;
import com.aryeet.rules.RuleVerificationDTO;
import com.aryeet.util.StringUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.Ha;
import org.assertj.core.api.SoftAssertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WhichTVReviewHomeSteps {

    private static final Logger log = LoggerFactory.getLogger(RandomGenSteps.class);

    @Autowired
    Environment environment;

    @Autowired
    private WhichReviewHomePage whichReviewHomePage;

    @Autowired
    private TvInfoCardPage tvInfoCardPage;

    @Autowired
    private RuleVerificationDTO ruleVerificationDTO;

    Map<Integer, TVInfoCard> getReviewCardMap = new HashMap<>();
    ReviewFilter filterConditions = null;

    @Given("user navigate to {string} page")
    public void user_navigate_to_page(String goToPage) {
        whichReviewHomePage.goTo(environment.getProperty("base.url.which.review.home"));
    }

    @When("sort the {string} page with {string} sort-option")
    public void sort_the_home_page_with_sort_option(String goToPage, String sortOption) {
        whichReviewHomePage.selectDropdownByText(sortOption);
    }

    @When("User set filter conditions")
    public void user_set_filter_conditions(ReviewFilter filterConditions) {
        this.filterConditions = filterConditions;
        whichReviewHomePage.setfilters(filterConditions);
        ruleVerificationDTO.setReviewFilter(filterConditions);
    }

    @Then("verify filtered result of TV review products pass {string} rule")
    public void verify_filtered_result_of_TV_review_products_pass(String ruleEngineIndex) {
        SoftAssertions softly = new SoftAssertions();

        String filterStringToMatch = filterConditions.getFilterScreenSize().stream()
                .map(y -> y.getSizeOption())
                .collect(Collectors.joining(","));

        String allTVSizeType = StringUtils.getTVsizeBasedOnInpu(filterStringToMatch);


        //Get All the tv product cards
        getReviewCardMap = tvInfoCardPage.getAllTVReviewCard();
        ruleVerificationDTO.setRuleIndex(ruleEngineIndex.split(";")[0]);

        getReviewCardMap.entrySet().stream()
                .filter(y -> y !=null && y.getValue() !=null && y.getValue().getImportantFeature()!= null)
                .forEach(screensizetest -> {
                    softly.assertThat(allTVSizeType).contains(screensizetest.getValue()
                            .getImportantFeature()
                            .getScreenSize());
                });


        String finalTVTypeString = filterConditions.getFilterScreenType().stream()
                .map(y -> y.getScreenTypeOption())
                .collect(Collectors.joining(","));

     //   String allTVSizeType = StringUtils.getTVsizeBasedOnInpu(filterStringToMatch);



        getReviewCardMap.entrySet().stream()
                .filter(y -> y !=null && y.getValue() !=null && y.getValue().getImportantFeature()!= null)
                .forEach(screentypetest -> {
                    softly.assertThat(finalTVTypeString).contains(screentypetest.getValue()
                            .getImportantFeature()
                            .getScreenType());
                });
    }

    @When("get all the TV reviews on the page")
    public void get_all_the_TV_reviews_on_the_page() {

    }

}
