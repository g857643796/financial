package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 信用卡款账单表
 */
public class Refund implements Serializable {

    private Integer refund_Id;

    private Integer refund_Credit;

    private Date refund_Time;

    private Double refund_Money;

    private Double refund_ShouId;

    private Double refund_Reality;

    private Double refund_Balance;

    private Integer refund_State;

    public Integer getRefund_Id() {
        return refund_Id;
    }

    public void setRefund_Id(Integer refund_Id) {
        this.refund_Id = refund_Id;
    }

    public Integer getRefund_Credit() {
        return refund_Credit;
    }

    public void setRefund_Credit(Integer refund_Credit) {
        this.refund_Credit = refund_Credit;
    }

    public Date getRefund_Time() {
        return refund_Time;
    }

    public void setRefund_Time(Date refund_Time) {
        this.refund_Time = refund_Time;
    }

    public Double getRefund_Money() {
        return refund_Money;
    }

    public void setRefund_Money(Double refund_Money) {
        this.refund_Money = refund_Money;
    }

    public Double getRefund_ShouId() {
        return refund_ShouId;
    }

    public void setRefund_ShouId(Double refund_ShouId) {
        this.refund_ShouId = refund_ShouId;
    }

    public Double getRefund_Reality() {
        return refund_Reality;
    }

    public void setRefund_Reality(Double refund_Reality) {
        this.refund_Reality = refund_Reality;
    }

    public Double getRefund_Balance() {
        return refund_Balance;
    }

    public void setRefund_Balance(Double refund_Balance) {
        this.refund_Balance = refund_Balance;
    }

    public Integer getRefund_State() {
        return refund_State;
    }

    public void setRefund_State(Integer refund_State) {
        this.refund_State = refund_State;
    }
}
