package com.aryeet.scenarios.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*@Component
@ContextConfiguration*/
//@RunWith(Cucumber.class)
/*@CucumberOptions(
        features = "src/test/resources/cucumber",
        glue = {"com.aryeet.scenarios.steps"},
        tags = "(@smoke) and (not @p4 or @ignore or @quotation_wrapped_search)",
        plugin = {
                "pretty",
                "html:target/cucumber-report/report/cucumber.html",
                "json:target/cucumber-report/cucumber.json",
                "rerun:target/cucumber-report/rerun.txt"
        })*/

public class RunnerTest {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Throwable {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

    }

    /*@Test(
            groups = "cucumber scenarios",
            description = "Runs Cucumber Scenarios",
            dataProvider = "scenarios")
    public void scenario(PickleWrapper pickleEvent, FeatureWrapper cucumberFeature)
            throws Throwable {
        testNGCucumberRunner.runScenario(pickleEvent.getPickle());
    }
*/
    @DataProvider
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
    }
}