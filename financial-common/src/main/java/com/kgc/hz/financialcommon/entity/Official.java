package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;

/**
 * 公众号用户表
 */
public class Official implements Serializable {

    private Integer off_Id;

    private String off_Name;

    private String off_Area;

    private String off_Wechat;

    public Integer getOff_Id() {
        return off_Id;
    }

    public void setOff_Id(Integer off_Id) {
        this.off_Id = off_Id;
    }

    public String getOff_Name() {
        return off_Name;
    }

    public void setOff_Name(String off_Name) {
        this.off_Name = off_Name;
    }

    public String getOff_Area() {
        return off_Area;
    }

    public void setOff_Area(String off_Area) {
        this.off_Area = off_Area;
    }

    public String getOff_Wechat() {
        return off_Wechat;
    }

    public void setOff_Wechat(String off_Wechat) {
        this.off_Wechat = off_Wechat;
    }
}
