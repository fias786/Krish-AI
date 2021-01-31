package com.sharnoxz.krishiai.data;


import java.util.ArrayList;

public class VData {
    private ArrayList<HData> hData;
    private String title,appDetails,weather;
    private int appIcon;
    private boolean detailsOfApp;

    public VData(ArrayList<HData> hData, String title, String appDetails, int appIcon, String weather, boolean detailsOfApp) {
        this.hData = hData;
        this.title = title;
        this.appDetails = appDetails;
        this.appIcon = appIcon;
        this.weather = weather;
        this.detailsOfApp = detailsOfApp;
    }

    public ArrayList<HData> gethData() {
        return hData;
    }

    public void sethData(ArrayList<HData> hData) {
        this.hData = hData;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAppDetails() {
        return appDetails;
    }

    public void setAppDetails(String appDetails) {
        this.appDetails = appDetails;
    }

    public int getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(int appIcon) {
        this.appIcon = appIcon;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public boolean isDetailsOfApp() {
        return detailsOfApp;
    }

    public void setDetailsOfApp(boolean detailsOfApp) {
        this.detailsOfApp = detailsOfApp;
    }
}
