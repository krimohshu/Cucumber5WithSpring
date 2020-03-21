package com.aryeet.scenarios.steps;

import com.aryeet.pages.AppLandingPage;
import com.aryeet.pages.WhichReviewHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class WhichTVReviewHomeSteps {

    private static final Logger log = LoggerFactory.getLogger(RandomGenSteps.class);

    @Autowired
    Environment environment;

    @Autowired
    private WhichReviewHomePage whichReviewHomePage;


    @Given("user navigate to {string} page")
    public void user_navigate_to_page(String goToPage) {
        whichReviewHomePage.goTo(environment.getProperty("base.url.which.review.home"));
    }

    @When("sort the {string} page with {string} sort-option")
    public void sort_the_home_page_with_sort_option(String goToPage ,String sortOption ) {
        whichReviewHomePage.selectDropdownByText(sortOption);
    }

}
