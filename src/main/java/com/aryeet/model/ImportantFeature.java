package com.aryeet.model;

import org.springframework.stereotype.Component;


public class ImportantFeature {

    private String screenSize;
    private String screenType;
    private String tvFeatures;

    public ImportantFeature(String screenSize, String screenType, String tvFeatures) {
        this.screenSize = screenSize;
        this.screenType = screenType;
        this.tvFeatures = tvFeatures;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getTvFeatures() {
        return tvFeatures;
    }

    public void setTvFeatures(String tvFeatures) {
        this.tvFeatures = tvFeatures;
    }

    @Override
    public String toString() {
        return "ImportantFeature{" +
                "screenSize='" + screenSize + '\'' +
                ", screenType='" + screenType + '\'' +
                ", tvFeatures='" + tvFeatures + '\'' +
                '}';
    }
}
