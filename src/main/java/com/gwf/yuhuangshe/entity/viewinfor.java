package com.gwf.yuhuangshe.entity;

import lombok.Data;

import java.text.DateFormat;
@Data
public class viewinfor {
    private int id;//主键id
    private String value; //存储信息
    private DateFormat createdate;//创建时间
    private DateFormat updatedate;//更新时间

    public viewinfor() {
    }

    public viewinfor(int id, String value, DateFormat createdate, DateFormat updatedate) {
        this.id = id;
        this.value = value;
        this.createdate = createdate;
        this.updatedate = updatedate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
