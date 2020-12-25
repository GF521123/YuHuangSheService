package com.gwf.yuhuangshe.entity;

/*
 * 页面角色关联表
 */
public class Relation {

  private Integer id;
  private String rname;
  private String mname;
  private Integer state;

  public Relation() {
  }

  public Relation(Integer id, String rname, String mname, Integer state) {
    this.id = id;
    this.rname = rname;
    this.mname = mname;
    this.state = state;
  }

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

  public String getMname() {
    return mname;
  }

  public void setMname(String mname) {
    this.mname = mname;
  }

  public Integer getStat() {
    return state;
  }

  public void setStat(Integer state) {
    this.state = state;
  }
}
