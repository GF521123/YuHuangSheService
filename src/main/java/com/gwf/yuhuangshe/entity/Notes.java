package com.gwf.yuhuangshe.entity;


public class Notes {

  private long id;
  private long uId;
  private long noteType;
  private String notes;
  private java.sql.Timestamp createTime;
  private long state;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public long getNoteType() {
    return noteType;
  }

  public void setNoteType(long noteType) {
    this.noteType = noteType;
  }


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

}
