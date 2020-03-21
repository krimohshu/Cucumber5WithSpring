package com.aryeet.pages;

import com.aryeet.model.SortBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhichReviewHomePage extends AbstractPageObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(WhichReviewHomePage.class);

    private static final By SORTBY_DROPDOWN = By.id("product_listing_sorter");
    private static final By SUBMIT_BUTTON = By.id("submitButton");
    public static final String PATH = "/";

    public WhichReviewHomePage(final String path, final WebDriver driver, final int waitTimeOutSeconds) {
        super(path + PATH, driver, waitTimeOutSeconds);
    }

    public void selectDropdownByText(String sortOption) {
        super.selectDropdownByText(SORTBY_DROPDOWN, SortBy.valueOf(sortOption).getSortOption());
    }


}
