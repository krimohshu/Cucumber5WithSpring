package com.aryeet.model;

public enum ScreenSize {

    SIZE_20_28("screen_size_20_28"),
    SIZE_32_34("screen_size_32_34"),
    SIZE_39_45("screen_size_39_45"),
    SIZE_48_51("screen_size_48_51"),
    SIZE_55_60("screen_size_55_60"),
    SIZE_65PLUS("screen_size_65_150");

    private String sizeOption;

    ScreenSize(String sizeOption) {
        this.sizeOption = sizeOption;
    }

    public String getSizeOption() {
        // Please enhance fwk with the intelligence if user pass value it automatically calculate in-between range
        return sizeOption;
    }

    @Override
    public String toString() {
        return "ScreenSize{" +
                "sizeOption='" + sizeOption + '\'' +
                '}';
    }
}
