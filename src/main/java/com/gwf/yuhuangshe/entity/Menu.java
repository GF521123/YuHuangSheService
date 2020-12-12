package com.gwf.yuhuangshe.entity;

public class Menu {
    private int MId;
    private String MTitle;
    private String MValue;
    private int MSort;
    private String MUrl;
    private String MOther;

    public Menu() {
    }

    public Menu(int MId, String MTitle, String MValue, int MSort, String MUrl, String MOther) {
        this.MId = MId;
        this.MTitle = MTitle;
        this.MValue = MValue;
        this.MSort = MSort;
        this.MUrl = MUrl;
        this.MOther = MOther;
    }

    public int getMId() {
        return MId;
    }

    public void setMId(int MId) {
        this.MId = MId;
    }

    public String getMTitle() {
        return MTitle;
    }

    public void setMTitle(String MTitle) {
        this.MTitle = MTitle;
    }

    public String getMValue() {
        return MValue;
    }

    public void setMValue(String MValue) {
        this.MValue = MValue;
    }

    public int getMSort() {
        return MSort;
    }

    public void setMSort(int MSort) {
        this.MSort = MSort;
    }

    public String getMUrl() {
        return MUrl;
    }

    public void setMUrl(String MUrl) {
        this.MUrl = MUrl;
    }

    public String getMOther() {
        return MOther;
    }

    public void setMOther(String MOther) {
        this.MOther = MOther;
    }
}
