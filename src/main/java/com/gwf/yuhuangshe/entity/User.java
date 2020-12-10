package com.gwf.yuhuangshe.entity;


public class User {
    private int UId;
    private String UName;
    private String UPasswd;
//    private String UCreateDate;
    private String UIphone;

    public User() {
    }

    public User(int UId, String UName, String UPasswd, String UIphone) {
        this.UId = UId;
        this.UName = UName;
        this.UPasswd = UPasswd;
        this.UIphone = UIphone;
    }

    public int getUId() {
        return UId;
    }

    public void setUId(int UId) {
        this.UId = UId;
    }

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getUPasswd() {
        return UPasswd;
    }

    public void setUPasswd(String UPasswd) {
        this.UPasswd = UPasswd;
    }

    public String getUIphone() {
        return UIphone;
    }

    public void setUIphone(String UIphone) {
        this.UIphone = UIphone;
    }
}
