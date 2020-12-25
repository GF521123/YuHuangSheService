package com.gwf.yuhuangshe.entity;

/*
 * 角色
 */
public class Role {

  private Integer id;//编号
  private String rname;//校色
  private String title;//说明
  private Integer state;//状态：0不启用(默认)，1启用


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getRname() {
    return rname;
  }

  public void setRname(String rname) {
    this.rname = rname;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

}
