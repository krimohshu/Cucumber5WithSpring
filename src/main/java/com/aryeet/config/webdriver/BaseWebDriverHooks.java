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

        /*if(scenario.isFailed()){
            LOGGER.info("Scenario failed: " + getScenarioIdentifier(scenario));
            try {
            scenario.write("Current Page URL is " +  driver.getCurrentUrl());
            if (driver.getWrappedDriver() instanceof TakesScreenshot){
                final byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
                try {
                    final List<LogEntry> logs = driver.manage().logs().get(LogType.BROWSER).getAll();
                    logs.stream()
                            .filter(log -> Level.SEVERE == log.getLevel())
                            .collect(Collectors.toList());
                    if (logs.size() > 0) {
                        scenario.write("\n" + logs.stream().map(log -> log.getTimestamp() + " : " + log.getMessage() + "\n")
                                .collect(joining()));
                    }
                }
                catch (final WebDriverException e) {
                    // IE does not support fetching browser logs
                    LOGGER.debug("Error when fetching logs from browser.", e);
                }
            }
            scenario.write(StringEscapeUtils.escapeHtml(driver.getPageSource()));
        }
        catch (final Throwable somePlatformsDontSupportScreenshotsOrBrowserHasDied) {
            somePlatformsDontSupportScreenshotsOrBrowserHasDied.printStackTrace(System.err);
        }
        }else {
            //List<LogEntry> passedLogs = driver.manage().logs().get(LogType.BROWSER).getAll();;
                scenario.write("Scenario passed on : " +  new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
                LOGGER.info("Scenario succeeded: " + getScenarioIdentifier(scenario));
            }*/
    }


    private String getScenarioIdentifier(final Scenario scenario) {
        return scenario.getName() + " (#" + scenario.getSteps() + ")";
    }

}
