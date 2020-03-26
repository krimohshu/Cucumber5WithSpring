package com.aryeet.scenarios.steps;

import com.aryeet.CucumberAutomationApp;
import com.aryeet.api.request.CommonRequestSpecDto;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;

public class RestAPISteps extends AbstractStepDefinition {

    private static final Logger log = LoggerFactory.getLogger(RestAPISteps.class);

    @Autowired
    private Environment environment;


    @Autowired
    private CucumberContextConfiguration cucumberContextConfiguration;

    @Autowired
    private CommonRequestSpecDto commonRequestSpecDto;

    @Before
    public void before(final Scenario scenario) {
        super.before(scenario);
    }


    @Given("user call following restapi {string} of {string} with {string} page")
    public void user_Call_Following_Restapi(String relativeEndPoint, String apiVersion, String httpMethod) {
        // embedTextInReport("Following endpoint with HTTP method");
        SoftAssertions softly = new SoftAssertions();


        String endPoint = createEndPoint(cucumberContextConfiguration.getBaseUrl(), cucumberContextConfiguration.getEndPointUrl(relativeEndPoint), "", "", apiVersion);
        commonRequestSpecDto.setEndPoint(endPoint);
        log.info(commonRequestSpecDto.getEndPoint());
        softly.assertThat("shyam").isEqualTo("shyam");

        softly.assertAll();

    }


    @Then("User should able to verify {string} tests")
    public void user_Call_Following_Restapi(String expectedResult) {
        // embedTextInReport("Following endpoint with HTTP method");


    }


}
