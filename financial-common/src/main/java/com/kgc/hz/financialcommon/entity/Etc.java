package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ETC表
 */
public class Etc implements Serializable {

    private Integer etc_Id;

    private Integer etc_Facility;

    private Integer etc_Name;

    private Integer etc_Card;

    private Date etc_Time;

    private String etc_CarId;

    private Integer etc_State;

    private String etc_Type;

    public Integer getEtc_Id() {
        return etc_Id;
    }

    public void setEtc_Id(Integer etc_Id) {
        this.etc_Id = etc_Id;
    }

    public Integer getEtc_Facility() {
        return etc_Facility;
    }

    public void setEtc_Facility(Integer etc_Facility) {
        this.etc_Facility = etc_Facility;
    }

    public Integer getEtc_Name() {
        return etc_Name;
    }

    public void setEtc_Name(Integer etc_Name) {
        this.etc_Name = etc_Name;
    }

    public Integer getEtc_Card() {
        return etc_Card;
    }

    public void setEtc_Card(Integer etc_Card) {
        this.etc_Card = etc_Card;
    }

    public Date getEtc_Time() {
        return etc_Time;
    }

    public void setEtc_Time(Date etc_Time) {
        this.etc_Time = etc_Time;
    }

    public String getEtc_CarId() {
        return etc_CarId;
    }

    public void setEtc_CarId(String etc_CarId) {
        this.etc_CarId = etc_CarId;
    }

    public Integer getEtc_State() {
        return etc_State;
    }

    public void setEtc_State(Integer etc_State) {
        this.etc_State = etc_State;
    }

    public String getEtc_Type() {
        return etc_Type;
    }

    public void setEtc_Type(String etc_Type) {
        this.etc_Type = etc_Type;
    }
}
