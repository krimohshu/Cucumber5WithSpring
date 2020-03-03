package com.aryeet.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

public class AppLandingPage extends AbstractPageObject{
    private static final Logger LOGGER = LoggerFactory.getLogger(AppLandingPage.class);

    public static final String PATH = "/";
    public AppLandingPage(final String path, final WebDriver driver, final int waitTimeOutSeconds) {
        super(path + PATH, driver, waitTimeOutSeconds);
    }

}
