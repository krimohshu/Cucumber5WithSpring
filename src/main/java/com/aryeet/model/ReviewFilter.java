package com.aryeet.model;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;


public class ReviewFilter {

    private Set<ScreenSize> filterScreenSize;
    private Set<ScreenType> filterScreenType;
    private Set<TvFeatures> filterTvFeatures;

    public Set<ScreenSize> getFilterScreenSize() {
        return filterScreenSize;
    }

    public void setFilterScreenSize(Set<ScreenSize> filterScreenSize) {
        this.filterScreenSize = filterScreenSize;
    }

    public Set<ScreenType> getFilterScreenType() {
        return filterScreenType;
    }

    public void setFilterScreenType(Set<ScreenType> filterScreenType) {
        this.filterScreenType = filterScreenType;
    }

    public Set<TvFeatures> getFilterTvFeatures() {
        return filterTvFeatures;
    }

    public void setFilterTvFeatures(Set<TvFeatures> filterTvFeatures) {
        this.filterTvFeatures = filterTvFeatures;
    }

    public ReviewFilter setReviewFilter(Map<String, String> entry) {
        Set<ScreenType> filterScreenType = new HashSet<>();
        Set<ScreenSize> filterScreenSize = new HashSet<>();

        Optional<String> screenSizesf = entry.entrySet()
                .stream()
                .filter(x -> x.getKey().equalsIgnoreCase("ScreenSize"))
                .map(y -> y.getValue())
                .findFirst();

        Optional<String> ScreenTypef = entry.entrySet()
                .stream()
                .filter(x -> x.getKey().equalsIgnoreCase("ScreenType"))
                .map(y -> y.getValue())
                .findFirst();


        //  Optional.ofNullable(screenSizes).
        if (screenSizesf.isPresent()) {
            Arrays.asList(screenSizesf.get().trim().split(";"))
                    .stream()
                    .map(String::trim)
                    .forEach(val -> {
                        filterScreenSize.add(ScreenSize.valueOf(val));
                    });
            this.setFilterScreenSize(filterScreenSize);

        }

        if (ScreenTypef.isPresent()) {
            Arrays.asList(ScreenTypef.get().trim().split(";"))
                    .stream()
                    .map(String::trim)
                    .forEach(val -> {
                        filterScreenType.add(com.aryeet.model.ScreenType.valueOf(val));
                    });
            this.setFilterScreenType(filterScreenType);

        }

        System.out.println();
        return this;


    }

}
