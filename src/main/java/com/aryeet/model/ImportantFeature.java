package com.aryeet.model;

import org.springframework.stereotype.Component;

@Component
public class ImportantFeature {

    private ScreenSize screenSize;
    private ScreenType screenType;
    private TvFeatures tvFeatures;


    public ScreenSize getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(ScreenSize screenSize) {
        this.screenSize = screenSize;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public void setScreenType(ScreenType screenType) {
        this.screenType = screenType;
    }

    public TvFeatures getTvFeatures() {
        return tvFeatures;
    }

    public void setTvFeatures(TvFeatures tvFeatures) {
        this.tvFeatures = tvFeatures;
    }
}
