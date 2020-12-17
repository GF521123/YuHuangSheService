package com.gwf.yuhuangshe.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Menu {
    @JsonProperty
    private Integer MId;
    @JsonProperty
    private String MTitle;
    @JsonProperty
    private String MValue;
    @JsonProperty
    private Integer MSort;
    @JsonProperty
    private String MUrl;
    @JsonProperty
    private String MOther;

    public Menu() {
    }

    public Menu(Integer MId, String MTitle, String MValue, Integer MSort, String MUrl, String MOther) {
        this.MId = MId;
        this.MTitle = MTitle;
        this.MValue = MValue;
        this.MSort = MSort;
        this.MUrl = MUrl;
        this.MOther = MOther;
    }

    public Integer getMId() {
        return MId;
    }

    public void setMId(Integer MId) {
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

    public Integer getMSort() {
        return MSort;
    }

    public void setMSort(Integer MSort) {
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

    @Override
    public String toString() {
        return "Menu{" +
                "MId=" + MId +
                ", MTitle='" + MTitle + '\'' +
                ", MValue='" + MValue + '\'' +
                ", MSort=" + MSort +
                ", MUrl='" + MUrl + '\'' +
                ", MOther='" + MOther + '\'' +
                '}';
    }
}
