package com.aryeet.model;

public enum TvFeatures {
    SMART_TV("Smart TV"),
    FREEVIEW_HD("Freeview HD"),
    FREESAT_HD("Freesat HD"),
    FREEVIEW_PLAY("Freeview Play"),
    PVR("PVR"),
    HDR("HDR"),
    TWIN_TUNERPVR("Twin-tuner PVR");

    private String Tvfeaturetype;

    TvFeatures(String Tvfeaturetype) {
        this.Tvfeaturetype = Tvfeaturetype;
    }

    public String getTvfeaturetype() {
        return Tvfeaturetype;
    }

    public void setTvfeaturetype(String tvfeaturetype) {
        Tvfeaturetype = tvfeaturetype;
    }
}


