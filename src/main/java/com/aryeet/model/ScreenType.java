package com.aryeet.model;


public enum ScreenType {
    OLED("screen_type_oled"),
    LCD("screen_type_lcd"),
    CurveDB("screen_type_curved"),
    QLED("screen_type_qled");

    private String screenTypeOption;

    ScreenType(String screenTypeOption) {
        this.screenTypeOption = screenTypeOption;
    }

    public String getScreenTypeOption() {
        return screenTypeOption;
    }

    @Override
    public String toString() {
        return "ScreenType{" +
                "screenTypeOption='" + screenTypeOption + '\'' +
                '}';
    }
}
