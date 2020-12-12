package com.gwf.yuhuangshe.entity;


public class User {
    private int UId;
    private String UName;
    private String UPassword;
//    private String UCreateDate;
    private String UIphone;

    public User() {
    }

    public User(int UId, String UName, String UPassword, String UIphone) {
        this.UId = UId;
        this.UName = UName;
        this.UPassword = UPassword;
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

    public String getUPassword() {
        return UPassword;
    }

    public void setUPassword(String UPassword) {
        this.UPassword = UPassword;
    }

    public String getUIphone() {
        return UIphone;
    }

    public void setUIphone(String UIphone) {
        this.UIphone = UIphone;
    }
}
