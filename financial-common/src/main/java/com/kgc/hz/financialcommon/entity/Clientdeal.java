package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 转账订单表
 */
public class Clientdeal implements Serializable {
    private String acc_Id;

    private String account_Id;

    private Date account_Time;

    private Double account_Money;

    private String account_Out;

    private String account_Int;

    private String account_Transfer;

    private Integer account_Type;

    private String account_Way;

    private String account_State;

    public String getAcc_Id() {
        return acc_Id;
    }

    public void setAcc_Id(String acc_Id) {
        this.acc_Id = acc_Id;
    }

    public String getAccount_Id() {
        return account_Id;
    }

    public void setAccount_Id(String account_Id) {
        this.account_Id = account_Id;
    }

    public Date getAccount_Time() {
        return account_Time;
    }

    public void setAccount_Time(Date account_Time) {
        this.account_Time = account_Time;
    }

    public Double getAccount_Money() {
        return account_Money;
    }

    public void setAccount_Money(Double account_Money) {
        this.account_Money = account_Money;
    }

    public String getAccount_Out() {
        return account_Out;
    }

    public void setAccount_Out(String account_Out) {
        this.account_Out = account_Out;
    }

    public String getAccount_Int() {
        return account_Int;
    }

    public void setAccount_Int(String account_Int) {
        this.account_Int = account_Int;
    }

    public String getAccount_Transfer() {
        return account_Transfer;
    }

    public void setAccount_Transfer(String account_Transfer) {
        this.account_Transfer = account_Transfer;
    }

    public Integer getAccount_Type() {
        return account_Type;
    }

    public void setAccount_Type(Integer account_Type) {
        this.account_Type = account_Type;
    }

    public String getAccount_Way() {
        return account_Way;
    }

    public void setAccount_Way(String account_Way) {
        this.account_Way = account_Way;
    }

    public String getAccount_State() {
        return account_State;
    }

    public void setAccount_State(String account_State) {
        this.account_State = account_State;
    }
}
