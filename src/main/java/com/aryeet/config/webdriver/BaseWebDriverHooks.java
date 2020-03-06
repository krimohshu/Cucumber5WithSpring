package com.aryeet.config.webdriver;
import io.cucumber.core.internal.gherkin.ast.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public abstract class BaseWebDriverHooks {
   @Autowired
    private SharedDriver driver;


    private static final Logger LOGGER = LoggerFactory.getLogger(BaseWebDriverHooks.class);

    public void before(final Scenario scenario) {
        LOGGER.info("Running scenario: " + getScenarioIdentifier(scenario));
    }
    public void embedScreenshotIfFailed(final Scenario scenario){
    }


    private String getScenarioIdentifier(final Scenario scenario) {
        return scenario.getName() + " (#" + scenario.getSteps() + ")";
    }

}
