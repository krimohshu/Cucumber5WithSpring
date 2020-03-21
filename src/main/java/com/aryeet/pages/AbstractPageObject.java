package com.aryeet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
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

    /**
     * perform global navigation based on the path provided to page
     */
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

    /**
     * Universal dropdown selector
     * accept By definition and call a timebound selection with appropriate waitProperty
     */
    public void selectDropdownByText(final By locator, final String visibleText) {
        waitForElement(locator);
        final List<WebElement> element = getElement(locator);
        selectDropdownByText(element, visibleText);
    }

    protected void selectDropdownByText(final List<WebElement> element, final String visibleText) {
       //Finding first dropdown
        WebElement selectElement = element.stream()
                .filter(elemetTyep -> elemetTyep.getTagName().equalsIgnoreCase("select"))
                .findFirst().get();


        final Select filterSelect = new Select(selectElement);
        waitForDropdownItems(selectElement);
        final long startTime = System.currentTimeMillis();
        while ((System.currentTimeMillis() - startTime) < 10000) {
            if (!filterSelect.getOptions().isEmpty()) {
                filterSelect.selectByVisibleText(visibleText);
                break;
            }
        }
    }

    protected List<WebElement> getElement(final By locator) {
        return getDriver().findElements(locator);
    }

    /*
     * All the wait conditions will be handled
     * @param locator
     */

    private void waitForElement(final By locator) {
        final WebDriverWait wait = new WebDriverWait(getDriver(), waitTimeOutSeconds);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    private void waitForDropdownItems(final WebElement element) {
        final WebDriverWait wait = new WebDriverWait(getDriver(), waitTimeOutSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
