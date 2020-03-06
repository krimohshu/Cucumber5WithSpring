package com.aryeet.pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AbstractPageObject {
    protected final String path;
    protected final WebDriver driver;
    protected final int waitTimeOutSeconds;
    protected static final int BIG_TIMEOUT_IN_SECONDS = 30;
    protected static final int SMALL_TIMEOUT_IN_SECONDS = 2;

    public AbstractPageObject(final String path, final WebDriver driver, final int waitTimeOutSeconds) {
        this.path = path;
        this.driver = driver;
        this.waitTimeOutSeconds = waitTimeOutSeconds;
    }

    public String getPath() {
        return path;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public int getWaitTimeOutSeconds() {
        return waitTimeOutSeconds;
    }

    public static int getBigTimeoutInSeconds() {
        return BIG_TIMEOUT_IN_SECONDS;
    }

    public static int getSmallTimeoutInSeconds() {
        return SMALL_TIMEOUT_IN_SECONDS;
    }

    public void goTo(final String path) {
        //  driver.navigate().refresh();
        getDriver().get(path);

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
}
