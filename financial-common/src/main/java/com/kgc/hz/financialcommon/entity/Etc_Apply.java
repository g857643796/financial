package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ETC申请表
 */
public class Etc_Apply implements Serializable {

    private Integer apply_Id;

    private Integer apply_Order;

    private Integer apply_Name;

    private Date apply_Time;

    private String apply_Type;

    public Integer getApply_Id() {
        return apply_Id;
    }

    public void setApply_Id(Integer apply_Id) {
        this.apply_Id = apply_Id;
    }

    public Integer getApply_Order() {
        return apply_Order;
    }

    public void setApply_Order(Integer apply_Order) {
        this.apply_Order = apply_Order;
    }

    public Integer getApply_Name() {
        return apply_Name;
    }

    public void setApply_Name(Integer apply_Name) {
        this.apply_Name = apply_Name;
    }

    public Date getApply_Time() {
        return apply_Time;
    }

    public void setApply_Time(Date apply_Time) {
        this.apply_Time = apply_Time;
    }

    public String getApply_Type() {
        return apply_Type;
    }

    public void setApply_Type(String apply_Type) {
        this.apply_Type = apply_Type;
    }
}
