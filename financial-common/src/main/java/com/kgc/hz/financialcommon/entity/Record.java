package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 兑换记录表
 */
public class Record implements Serializable {

    private Integer re_Id;

    private Integer re_UserId;

    private Integer re_ShopId;

    private Date re_Time;

    private Integer re_Credits;

    private Integer re_Amount;

    public Integer getRe_Id() {
        return re_Id;
    }

    public void setRe_Id(Integer re_Id) {
        this.re_Id = re_Id;
    }

    public Integer getRe_UserId() {
        return re_UserId;
    }

    public void setRe_UserId(Integer re_UserId) {
        this.re_UserId = re_UserId;
    }

    public Integer getRe_ShopId() {
        return re_ShopId;
    }

    public void setRe_ShopId(Integer re_ShopId) {
        this.re_ShopId = re_ShopId;
    }

    public Date getRe_Time() {
        return re_Time;
    }

    public void setRe_Time(Date re_Time) {
        this.re_Time = re_Time;
    }

    public Integer getRe_Credits() {
        return re_Credits;
    }

    public void setRe_Credits(Integer re_Credits) {
        this.re_Credits = re_Credits;
    }

    public Integer getRe_Amount() {
        return re_Amount;
    }

    public void setRe_Amount(Integer re_Amount) {
        this.re_Amount = re_Amount;
    }
}
