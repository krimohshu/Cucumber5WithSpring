package com.aryeet.model;

public enum SortBy {
    Most_RECENTLY_REVIEWED("recently reviewed"),
    HIGHEST_WHICH_SCORE("Highest Which? score"),
    PRICE_LOW_TO_HIGH("Price (low to high)"),
    PRICE_HIGH_TO_LOW("Price (high to low)"),
    MOST_RECENTLY_LAUNCHED("Most-recently launched");

    private String sortOption;

    SortBy(String sortOption) {
        this.sortOption = sortOption;
    }

    public String getSortOption() {
        return sortOption;
    }
}
