package com.gwf.yuhuangshe.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Menu {
    @JsonProperty
    private Integer id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String url;
    @JsonProperty
    private Integer lev;
    @JsonProperty
    private Integer pid;
    private List<Menu> Menu;
//getandset方法

    public Menu() {
    }

    public Menu(Integer id, String name, String url, Integer lev, Integer pid, List<Menu> menu) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.lev = lev;
        this.pid = pid;
        Menu = menu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<com.gwf.yuhuangshe.entity.Menu> getMenu() {
        return Menu;
    }

    public void setMenu(List<com.gwf.yuhuangshe.entity.Menu> menu) {
        Menu = menu;
    }
}
