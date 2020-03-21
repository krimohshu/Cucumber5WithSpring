package com.aryeet.pages;

import com.aryeet.model.ReviewFilter;
import com.aryeet.model.SortBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhichReviewHomePage extends AbstractPageObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(WhichReviewHomePage.class);

    private static final By SORTBY_DROPDOWN = By.id("product_listing_sorter");
    private static final By DATA_WHICH_BUTTON_ScreenSize = By.cssSelector("button[data-which-button='screen_size-filter']");
    private static final By DROPDOWN_CHOICES = By.cssSelector("label[for='_CSS_VALUE_']");
    private static final By SCREENSIZE_CHECKBOX = By.id("_ID_VALUE_");
    public static final String PATH = "/";

    public WhichReviewHomePage(final String path, final WebDriver driver, final int waitTimeOutSeconds) {
        super(path + PATH, driver, waitTimeOutSeconds);
    }

    public void selectDropdownByText(String sortOption) {
        super.selectDropdownByText(SORTBY_DROPDOWN, SortBy.valueOf(sortOption).getSortOption());
    }

    public void setfilters(ReviewFilter reviewFilter) {

        waitForInvisibilityOfSpinner(10);
        getDriver().findElement(DATA_WHICH_BUTTON_ScreenSize).click();
        genericWait(3);

        // Select all the Screensize of the user provided by the cucumber
        reviewFilter.getFilterScreenSize()
                .stream()
                .forEach(checkScreenSizeOption -> {
                    setCheckbox(getCssSelectorWithValue(DROPDOWN_CHOICES, checkScreenSizeOption.getSizeOption()), true);
                });

    }

}
