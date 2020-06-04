package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 信用卡表
 */
public class Credit implements Serializable {

    private Integer credit_Id;

    private Integer credit_Type;

    private Date credit_Date;

    private Integer credit_State;

    private Integer credit_Linenum;

    private String credit_Name;

    private String credit_Number;

    private Integer credit_Genre;

    private Double credit_Fee;

    private Integer credit_Time;

    public Integer getCredit_Id() {
        return credit_Id;
    }

    public void setCredit_Id(Integer credit_Id) {
        this.credit_Id = credit_Id;
    }

    public Integer getCredit_Type() {
        return credit_Type;
    }

    public void setCredit_Type(Integer credit_Type) {
        this.credit_Type = credit_Type;
    }

    public Date getCredit_Date() {
        return credit_Date;
    }

    public void setCredit_Date(Date credit_Date) {
        this.credit_Date = credit_Date;
    }

    public Integer getCredit_State() {
        return credit_State;
    }

    public void setCredit_State(Integer credit_State) {
        this.credit_State = credit_State;
    }

    public Integer getCredit_Linenum() {
        return credit_Linenum;
    }

    public void setCredit_Linenum(Integer credit_Linenum) {
        this.credit_Linenum = credit_Linenum;
    }

    public String getCredit_Name() {
        return credit_Name;
    }

    public void setCredit_Name(String credit_Name) {
        this.credit_Name = credit_Name;
    }

    public String getCredit_Number() {
        return credit_Number;
    }

    public void setCredit_Number(String credit_Number) {
        this.credit_Number = credit_Number;
    }

    public Integer getCredit_Genre() {
        return credit_Genre;
    }

    public void setCredit_Genre(Integer credit_Genre) {
        this.credit_Genre = credit_Genre;
    }

    public Double getCredit_Fee() {
        return credit_Fee;
    }

    public void setCredit_Fee(Double credit_Fee) {
        this.credit_Fee = credit_Fee;
    }

    public Integer getCredit_Time() {
        return credit_Time;
    }

    public void setCredit_Time(Integer credit_Time) {
        this.credit_Time = credit_Time;
    }
}
