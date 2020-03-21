package com.aryeet.scenarios.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/cucumber",
        glue = {"com.aryeet.scenarios.steps"},
        tags = "(@whichone) and (not @wip or @ignore)",
        plugin = {
                "timeline:target/cucumber-report/report/timeline.html",
               /* "pretty",*/
                "html:target/cucumber-report/report/cucumber.html",
                "json:target/cucumber-report/cucumber.json",
                "rerun:target/cucumber-report/rerun.txt"
        })
public class CucumberTest {
}
