package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 积分表
 */
public class Credits implements Serializable {

    private Integer cre_Id;

    private Integer cre_Amount;

    private Integer cre_yh;

    private Integer cre_Way;

    private Date cre_Time;

    public Integer getCre_Id() {
        return cre_Id;
    }

    public void setCre_Id(Integer cre_Id) {
        this.cre_Id = cre_Id;
    }

    public Integer getCre_Amount() {
        return cre_Amount;
    }

    public void setCre_Amount(Integer cre_Amount) {
        this.cre_Amount = cre_Amount;
    }

    public Integer getCre_yh() {
        return cre_yh;
    }

    public void setCre_yh(Integer cre_yh) {
        this.cre_yh = cre_yh;
    }

    public Integer getCre_Way() {
        return cre_Way;
    }

    public void setCre_Way(Integer cre_Way) {
        this.cre_Way = cre_Way;
    }

    public Date getCre_Time() {
        return cre_Time;
    }

    public void setCre_Time(Date cre_Time) {
        this.cre_Time = cre_Time;
    }
}
