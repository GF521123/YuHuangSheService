package com.gwf.yuhuangshe.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
/*
 * 页面菜单
 */
public class Menu {
    @JsonProperty
    private Integer id;//编号
    @JsonProperty
    private String name;//菜单页面菜单名
    @JsonProperty
    private String url;//菜单页面地址
    @JsonProperty
    private Integer lev;//菜单页面等级
    @JsonProperty
    private String pname;//菜单父页面菜单
    @JsonProperty
    private Integer state;//状态 默认0未启用   1启用
    private List<Menu> Menu;
//getandset方法

    public Menu() {
    }

    public Menu(Integer id, String name, String url, Integer lev, String pname, Integer state, List<com.gwf.yuhuangshe.entity.Menu> menu) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.lev = lev;
        this.pname = pname;
        this.state = state;
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

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public List<com.gwf.yuhuangshe.entity.Menu> getMenu() {
        return Menu;
    }

    public void setMenu(List<com.gwf.yuhuangshe.entity.Menu> menu) {
        Menu = menu;
    }
}
