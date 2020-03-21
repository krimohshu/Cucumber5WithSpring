package com.aryeet.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TvInfoCardPage extends AbstractPageObject{
    private static final Logger LOGGER = LoggerFactory.getLogger(TvInfoCardPage.class);

    public static final String PATH = "/";

    public TvInfoCardPage(final String path, final WebDriver driver, final int waitTimeOutSeconds) {
        super(path + PATH, driver, waitTimeOutSeconds);
    }
}
