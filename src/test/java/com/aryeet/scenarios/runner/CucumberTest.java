package com.aryeet.scenarios.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//com.aryeet.scenarios.steps
@CucumberOptions(
        features = "src/test/resources/cucumber",
        glue = {"com.aryeet.scenarios.steps"},
      //  tags = "(@smoke) and (not @p4 or @ignore or @quotation_wrapped_search)",
        plugin = {
                "pretty",
                "html:target/cucumber-report/report/cucumber.html",
                "json:target/cucumber-report/cucumber.json",
                "rerun:target/cucumber-report/rerun.txt"
        })
public class CucumberTest {
}
