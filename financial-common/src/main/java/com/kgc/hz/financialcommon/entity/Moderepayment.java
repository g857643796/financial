package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;

/**
 * 还款方式表
 */
public class Moderepayment implements Serializable {

    private Integer mode_Id;

    private String md_Payment;

    public Integer getMode_Id() {
        return mode_Id;
    }

    public void setMode_Id(Integer mode_Id) {
        this.mode_Id = mode_Id;
    }

    public String getMd_Payment() {
        return md_Payment;
    }

    public void setMd_Payment(String md_Payment) {
        this.md_Payment = md_Payment;
    }
}
