package com.example.belajarpm;

public class SettingModel {
    private String title;
    private int icon;

    public SettingModel(String title, int icon) {
        this.title = title;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public int getIcon() {
        return icon;
    }
}