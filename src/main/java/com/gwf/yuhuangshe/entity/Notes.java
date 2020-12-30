package com.gwf.yuhuangshe.entity;


import java.sql.Timestamp;
import java.util.Date;

public class Notes {

  private Integer id;//编号
  private String Uname;//用户姓名
  private Integer Uid;//用户id
  private String noteType;//事件类型
  private Integer noteTypeId;//事件类型
  private String notes;//事件内容
  private String test;//说明
  private Date createTime;//创建时间
  private Integer state;//状态

  public Notes() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUname() {
    return Uname;
  }

  public void setUname(String uname) {
    Uname = uname;
  }

  public Integer getUid() {
    return Uid;
  }

  public void setUid(Integer uid) {
    Uid = uid;
  }

  public String getNoteType() {
    return noteType;
  }

  public void setNoteType(String noteType) {
    this.noteType = noteType;
  }

  public Integer getNoteTypeId() {
    return noteTypeId;
  }

  public void setNoteTypeId(Integer noteTypeId) {
    this.noteTypeId = noteTypeId;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public String getTest() {
    return test;
  }

  public void setTest(String test) {
    this.test = test;
  }

  public Notes(String test, Integer id, String uname, Integer uid, String noteType, Integer noteTypeId, String notes, Date createTime, Integer state) {
    this.id = id;
    this.Uname = uname;
    this.test=test;
    this.Uid = uid;
    this.noteType = noteType;
    this.noteTypeId = noteTypeId;
    this.notes = notes;
    this.createTime = createTime;
    this.state = state;
  }
}
