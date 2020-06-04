package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 借贷申请记录表
 */
public class Debit_Apply implements Serializable {

    private Integer da_Id;

    private Integer da_Order;

    private Integer da_State;

    private Integer da_UserName;

    private Date da_Time;

    public Integer getDa_Id() {
        return da_Id;
    }

    public void setDa_Id(Integer da_Id) {
        this.da_Id = da_Id;
    }

    public Integer getDa_Order() {
        return da_Order;
    }

    public void setDa_Order(Integer da_Order) {
        this.da_Order = da_Order;
    }

    public Integer getDa_State() {
        return da_State;
    }

    public void setDa_State(Integer da_State) {
        this.da_State = da_State;
    }

    public Integer getDa_UserName() {
        return da_UserName;
    }

    public void setDa_UserName(Integer da_UserName) {
        this.da_UserName = da_UserName;
    }

    public Date getDa_Time() {
        return da_Time;
    }

    public void setDa_Time(Date da_Time) {
        this.da_Time = da_Time;
    }
}
